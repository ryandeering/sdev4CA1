package controllers;

import play.mvc.*;

import views.html.*;

import org.imgscalr.*;

import models.*;

import java.util.*;

import javax.inject.Inject;

import play.data.*;
import play.db.ebean.Transactional;





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
        return ok(index.render());
    }

    public Result addEmployee(){
        return ok(addEmployee.render());
    }



}
