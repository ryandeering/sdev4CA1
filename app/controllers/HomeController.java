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
        return ok(index.render(Employee.getEmployeeById(session().get("email"))));
    }

   // public Result addEmployee(){
    //    return ok(addEmployee.render());
   // }









}
