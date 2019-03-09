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
import models.employees.*;
import models.entities.*;
import models.entities.Department;

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
    @With(AuthManager.class)
    @Transactional
    public Result addEmployee() {
        Form<Employee> employeeForm = formFactory.form(Employee.class);
        return ok(addEmployee.render(employeeForm, User.getUserById(session().get("email"))));
    }

    public Result addEmployeeSubmit() {
        Employee newEmployee;
        String saveImageMsg;

        Form<Employee> newEmployeeForm = formFactory.form(Employee.class).bindFromRequest();

        if (newEmployeeForm.hasErrors()) {
            return badRequest(addEmployee.render(newEmployeeForm, User.getUserById(session().get("email"))));
        }

        newEmployee = newEmployeeForm.get();


        if (User.getUserById(newEmployee.getEmail()) == null) {
            newEmployee.save();
        } else {
            newEmployee.update();
        }


        flash("success", "Employee " + newEmployee.getEmail() + "was added");

        MultipartFormData<File> data = request().body().asMultipartFormData();
        FilePart<File> image = data.getFile("upload");

        saveImageMsg = saveFile(newEmployee.getEmail(), image);

        flash("success", "Employee " + newEmployee.getName() + " has been created " + saveImageMsg);

        return redirect(controllers.routes.HomeController.index(0));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthManager.class)
    @Transactional
    public Result updateEmployee(String email) {
        Employee e;
        Form<Employee> employeeForm;

        try {
            e = Employee.find.byId(email);
            employeeForm = formFactory.form(Employee.class).fill(e);
            flash("success", "Employee " + e.getName() + " was added");
        } catch (Exception ex) {
            return badRequest("error");
        }
        return ok(updateEmployee.render(email, employeeForm, Employee.getUserById(session().get("email"))));
    }


    public Result updateEmployeeSubmit(String email) {
        Form<Employee> updateEmployeeForm = formFactory.form(Employee.class).bindFromRequest();
        if (updateEmployeeForm.hasErrors()) {
            return badRequest(updateEmployee.render(email, updateEmployeeForm, Employee.getUserById(session().get("email"))));
        } else {
            Employee e = updateEmployeeForm.get();

            e.setEmail(email);

            List<Project> newProjects = new ArrayList<Project>();
            for (Long proj : e.getProjs()) {
                newProjects.add(Project.find.byId(proj));
            }

            e.projects = newProjects;

            e.update();
            MultipartFormData<File> data = request().body().asMultipartFormData();
            Http.MultipartFormData.FilePart<File> image = data.getFile("upload");

            String saveImageMsg = saveFile(e.getEmail(), image);

            flash("success", "Employee " + e.getName() + " has been  updated " + saveImageMsg);

            return redirect(controllers.routes.HomeController.index(0));

        }
    }


    @Security.Authenticated(Secured.class)
    @With(AuthManager.class)
    @Transactional
    public Result deleteEmployee(String id) {
        Employee.find.ref(id).delete();
        flash("success", "Employee has been deleted");

        return redirect(routes.HomeController.index(0));
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthManager.class)
    public Result employeesManager() {
        List<models.employees.Employee> userList = null;
        userList = Employee.findAll();
        return ok(employees.render(userList, User.getEmployeeById(session().get("email"))));
    }




    @Security.Authenticated(Secured.class)
    @With(Auth.class)
    public Result index(Long cat) {
        List<Employee> empList = null;
        List<Department> depList = Department.findAll();
        List<Project> projList = Project.findAll();
        if (cat == 0) {
            empList = Employee.findAll();
        } else {
            empList = Department.find.ref(cat).getEmployees();
        }
        return ok(index.render(empList, depList, projList, User.getUserById(session().get("email")), e));
    }


    @Security.Authenticated(Secured.class)
    @With(Auth.class)
    public Result employeeProjects(String email) {
        List<Project> projList = null;
        Employee tempEmployee = Employee.find.byId(email);
        if (email.equals(null)) {
            return redirect(controllers.routes.HomeController.index(0));
        } else {
            projList = tempEmployee.getProjects();
        }
        return ok(employeeProjects.render(projList, tempEmployee, (Employee) User.getUserById(session().get("email"))));
    }


    @Security.Authenticated(Secured.class)
    @With(AuthManager.class)
    public Result deleteProject(Long id) {
        Project.find.ref(id).delete();
        flash("success", "Project has been deleted");
        return redirect(controllers.routes.HomeController.projects());
    }

    @Security.Authenticated(Secured.class)
    @With(AuthManager.class)
    public Result addProject() {
        Form<Project> projectForm = formFactory.form(Project.class);
        return ok(addProject.render(projectForm, User.getUserById(session().get("email"))));
    }


    @Security.Authenticated(Secured.class)
    @With(AuthManager.class)
    public Result projects() {
        List<Project> projList = Project.findAll();
        return ok(projects.render(projList, User.getUserById(session().get("email"))));
    }


    @Security.Authenticated(Secured.class)
    @With(AuthManager.class)
    public Result addProjectSubmit() {
        Project p;
        Form<Project> newProjectForm = formFactory.form(Project.class).bindFromRequest();

        if (newProjectForm.hasErrors()) {
            return badRequest(addProject.render(newProjectForm, Employee.getUserById(session().get("email"))));
        } else {
            p = newProjectForm.get();
            if (p.getId() == null) {
                p.save();
            } else if (p.getId() != null) {
                p.update();
            }
        }

        return redirect(controllers.routes.HomeController.projects());
    }


    public String saveFile(String id, MultipartFormData.FilePart<File> image) {
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
                op.addImage("public/images/employeeImages/" + id + ".jpg");
                // thumbnail
                IMOperation thumb = new IMOperation();
                // Get the uploaded image file
                thumb.addImage(file.getAbsolutePath());
                thumb.thumbnail(60);
                // Save the  image
                thumb.addImage("public/images/employeeImages/thumbnails/" + id + ".jpg");
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



    @Security.Authenticated(Secured.class)
    @With(AuthManager.class)
    public Result updateProject(Long id) {
        Project p;
        Form<Project> projectForm;

        try {
            p = Project.find.byId(id);
            projectForm = formFactory.form(Project.class).fill(p);
            flash("success", "Project was updated");
        } catch(Exception ex) {
            return badRequest("error");
        }
        return ok(updateProject.render(id, projectForm, Employee.getUserById(session().get("email"))));
    }



    @Security.Authenticated(Secured.class)
    @With(AuthManager.class)
    public Result updateProjectSubmit(Long id) {
        Form<Project> newProjectForm = formFactory.form(Project.class).bindFromRequest();
        if (newProjectForm.hasErrors()) {
            return badRequest(updateProject.render(id, newProjectForm, Employee.getUserById(session().get("email"))));
        } else {
            Project p = newProjectForm.get();
            p.setId(id);
            p.update();
        }
        return redirect(controllers.routes.HomeController.projects());
    }


    @Security.Authenticated(Secured.class)
    @With(AuthManager.class)
    public Result addDepartment() {
        Form<Department> departmentForm = formFactory.form(Department.class);
        return ok(addDepartment.render(departmentForm, Employee.getUserById(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthManager.class)
    public Result addDepartmentSubmit() {
        Department newDepartment;
        Form<Department> newDepartmentForm = formFactory.form(Department.class).bindFromRequest();

        if (newDepartmentForm.hasErrors()) {
            return badRequest(addDepartment.render(newDepartmentForm, Employee.getUserById(session().get("email"))));
        } else {
            newDepartment = newDepartmentForm.get();
            if(newDepartment.getId() == null){
                newDepartment.save();
                flash("success", newDepartment.getName() +  " department was added");
            } else if (newDepartment.getId() != null) {
                newDepartment.update();
                flash("success", "Department " + newDepartment.getName() + " was updated");
            }
        }

        return redirect(controllers.routes.HomeController.departments());
    }


    @Security.Authenticated(Secured.class)
    @With(Auth.class)
    public Result departments(){
        List<Department> depList = Department.findAll();
        return ok(departments.render(depList, Employee.getUserById(session().get("email"))));
    }


}


















