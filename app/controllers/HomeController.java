package controllers;

import play.mvc.*;


import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import play.mvc.Http.MultipartFormData.*;
import play.mvc.Http.MultipartFormData;
import views.html.*;
import org.imgscalr.*;
import models.*;
import models.employees.*;
import models.entities.*;
import java.util.*;
import javax.inject.Inject;
import play.data.*;
import play.db.ebean.Transactional; //clean up imports later - Ryan
import org.mindrot.jbcrypt.BCrypt;
import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;



public class HomeController extends Controller {

    private FormFactory formFactory;
    private Environment e;

    @Inject
    public HomeController(FormFactory f, Environment env) {
        this.formFactory = f;
        this.e = env;
    }


    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result addEmployee() {
        Form<Employee> employeeForm = formFactory.form(Employee.class);
        return ok(addEmployee.render(employeeForm, User.getUserById(session().get("email"))));
    }

    public Result addEmployeeSubmit(){
        Employee newEmployee;
        String saveImageMsg;

        Form<Employee> newEmployeeForm = formFactory.form(Employee.class).bindFromRequest();

        if (newEmployeeForm.hasErrors()) {
            return badRequest(addEmployee.render(newEmployeeForm, User.getUserById(session().get("email"))));

        } else {
            newEmployee = newEmployeeForm.get();

            newEmployee.save();
            newEmployee.update();

            flash("success", "Employee "+newEmployee.getEmail() + "was added");

        }
        MultipartFormData<File> data = request().body().asMultipartFormData();
        FilePart<File> image = data.getFile("upload");

        saveImageMsg = saveFile(newEmployee.getEmail(), image);

        flash("success", "Employee " + newEmployee.getName() + " has been created " + saveImageMsg);

        return redirect(controllers.routes.HomeController.index(0));
    }


    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result updateEmployee(Long id) {
        Employee e;
        Form<Employee> employeeForm;
        try {
            e = Employee.find.byId(id);
            employeeForm = formFactory.form(Employee.class).fill(e);
        } catch (Exception ex) {
            return badRequest("error");
        }
        return ok(addEmployee.render(employeeForm, User.getUserById(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result deleteEmployee(Long id) {
        Employee.find.ref(id).delete();
        flash("success", "Employee has been deleted");

        return redirect(routes.HomeController.index(0));
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result employeesManager() {
        List<models.employees.Employee> userList = null;
        userList = Employee.findAll();
        return ok(employees.render(userList, User.getEmployeeById(session().get("email"))));
    }


    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result managers() {
        List<models.employees.Manager> userList = null;
        userList = Manager.findAll();
        return ok(managers.render(userList, User.getEmployeeById(session().get("email"))));
    }


    public Result department() {
        List<Department> departmentList = Department.findAll();
        return ok(department.render(departmentList, User.getUserById(session().get("email"))));
    }

    public Result project() {
        List<Project> projectList = Project.findAll();
        return ok(project.render(projectList, User.getUserById(session().get("email"))));
    }

    public Result address() {
        List<Address> addressList = Address.findAll();
        return ok(address.render(addressList, User.getUserById(session().get("email"))));
    }


    public Result index(Long department) {
        List<Employee> employeeList = Employee.findAll();
        List<Department> departmentList = Department.findAll();
        List<Project> projectList = Project.findAll();

        if (department == 0) {
            employeeList = Employee.findAll();
        } else {
            employeeList = Department.find.ref(department).getEmployees();
        }
        return ok(index.render(employeeList, departmentList, projectList, User.getUserById(session().get("email")), e));
    }


        //  public Result index(Long cat) {
        //      List<Department> deps = Department.find.query().where().orderBy("name asc").findList();
        //     List<Employee> emps = new ArrayList<Employee>();


        //     if (cat == 0) {
        //      emps = Employee.findAll();
        //  } else {
        //         emps = Employee.findFilter(cat, "");
        //    }

        //      return ok(index.render(deps, emps, User.getUserById(session().get("email"))));
//    }


        public String saveFile (String id, MultipartFormData.FilePart <File> image){
            if (image != null) {
                // Get mimetype from image
                String mimeType = image.getContentType();
                // Check if uploaded file is an image
                if (mimeType.startsWith("image/")) {
                    // Create file from uploaded image
                    File file = image.getFile();
                    // create ImageMagick command instance
                    ConvertCmd cmd = new ConvertCmd();
                    // create the operation, add images and operators/options
                    IMOperation op = new IMOperation();
                    // Get the uploaded image file
                    op.addImage(file.getAbsolutePath());
                    // Resize using height and width constraints
                    op.resize(300, 200);
                    // Save the  image
                    op.addImage("public/images/productImages/" + id + ".jpg");
                    // thumbnail
                    IMOperation thumb = new IMOperation();
                    // Get the uploaded image file
                    thumb.addImage(file.getAbsolutePath());
                    thumb.thumbnail(60);
                    // Save the  image
                    thumb.addImage("public/images/productImages/thumbnails/" + id + ".jpg");
                    // execute the operation
                    try {
                        cmd.run(op);
                        cmd.run(thumb);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    return " and image saved";
                }
            }
            return "image file missing";
        }


    }



