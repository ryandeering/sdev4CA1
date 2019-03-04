package controllers;

import play.mvc.*;


import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import views.html.*;
import org.imgscalr.*;
import models.*;
import models.employees.*;
import java.util.*;
import javax.inject.Inject;
import play.data.*;
import play.db.ebean.Transactional; //clean up imports later - Ryan
import org.mindrot.jbcrypt.BCrypt;





/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {


private FormFactory formFactory;


@Inject
public HomeController (FormFactory f){
    this.formFactory = f;
}

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */



    public Result index() {
        return ok(index.render(User.getEmployeeById(session().get("email"))));
    }

   // public Result addEmployee(){
    //    return ok(addEmployee.render());
   // }


    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result addEmployee() {
        Form<Employee> employeeForm = formFactory.form(Employee.class);
        return ok(addEmployee.render(employeeForm, User.getUserById(session().get("email"))));
    }


    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result addEmployeeSubmit(){
        Form<Employee> newEmployeeForm = formFactory.form(Employee.class).bindFromRequest();

        if(newEmployeeForm.hasErrors()){
            return badRequest(addEmployee.render(newEmployeeForm, User.getEmployeeById(session().get("email"))));
        }else{
            Employee newEmployee = newEmployeeForm.get();

            newEmployee.save();
            flash("Employee registered.");
            return redirect(controllers.routes.HomeController.index());
        }

    }


    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result employeesManager() {
        List<models.employees.Employee> userList = null;
        userList = Employee.findAll();
        return ok(employees.render(userList,User.getEmployeeById(session().get("email"))));
    }


    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result managers() {
        List<models.employees.Manager> userList = null;
        userList = Manager.findAll();
        return ok(managers.render(userList,User.getEmployeeById(session().get("email"))));
    }









}



