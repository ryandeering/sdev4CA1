// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ryan/Documents/a/sdev4CA1/conf/routes
// @DATE:Fri Mar 15 12:24:44 GMT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:8
  CountController_0: controllers.CountController,
  // @LINE:10
  AsyncController_2: controllers.AsyncController,
  // @LINE:13
  Assets_3: controllers.Assets,
  // @LINE:18
  LoginController_4: controllers.LoginController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:8
    CountController_0: controllers.CountController,
    // @LINE:10
    AsyncController_2: controllers.AsyncController,
    // @LINE:13
    Assets_3: controllers.Assets,
    // @LINE:18
    LoginController_4: controllers.LoginController
  ) = this(errorHandler, HomeController_1, CountController_0, AsyncController_2, Assets_3, LoginController_4, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, CountController_0, AsyncController_2, Assets_3, LoginController_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index(department:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/addEmployee""", """controllers.HomeController.addEmployee"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/addEmployeeSubmit""", """controllers.HomeController.addEmployeeSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateEmployee/""" + "$" + """email<[^/]+>/""", """controllers.HomeController.updateEmployee(email:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateEmployeeSubmit/""" + "$" + """email<[^/]+>/""", """controllers.HomeController.updateEmployeeSubmit(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delEmployee/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteEmployee(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/employees""", """controllers.HomeController.employeesManager"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """departments""", """controllers.HomeController.departments"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projects""", """controllers.HomeController.projects"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employeeProjects""", """controllers.HomeController.employeeProjects(email:String ?= null)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/addDepartment""", """controllers.HomeController.addDepartment"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/addDepartmentSubmit""", """controllers.HomeController.addDepartmentSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/addProject""", """controllers.HomeController.addProject"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/addProjectSubmit""", """controllers.HomeController.addProjectSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/updateProject/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateProject(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/updateProjectSubmit/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateProjectSubmit(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/deleteProject/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteProject(id:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_0.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_2.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_LoginController_login4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login4_invoker = createInvoker(
    LoginController_4.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_LoginController_loginSubmit5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit5_invoker = createInvoker(
    LoginController_4.loginSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Nil,
      "GET",
      this.prefix + """loginSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_LoginController_logout6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout6_invoker = createInvoker(
    LoginController_4.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_HomeController_addEmployee7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/addEmployee")))
  )
  private[this] lazy val controllers_HomeController_addEmployee7_invoker = createInvoker(
    HomeController_1.addEmployee,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addEmployee",
      Nil,
      "GET",
      this.prefix + """manager/addEmployee""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_HomeController_addEmployeeSubmit8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/addEmployeeSubmit")))
  )
  private[this] lazy val controllers_HomeController_addEmployeeSubmit8_invoker = createInvoker(
    HomeController_1.addEmployeeSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addEmployeeSubmit",
      Nil,
      "POST",
      this.prefix + """manager/addEmployeeSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_HomeController_updateEmployee9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateEmployee/"), DynamicPart("email", """[^/]+""",true), StaticPart("/")))
  )
  private[this] lazy val controllers_HomeController_updateEmployee9_invoker = createInvoker(
    HomeController_1.updateEmployee(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateEmployee",
      Seq(classOf[String]),
      "GET",
      this.prefix + """updateEmployee/""" + "$" + """email<[^/]+>/""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_HomeController_updateEmployeeSubmit10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateEmployeeSubmit/"), DynamicPart("email", """[^/]+""",true), StaticPart("/")))
  )
  private[this] lazy val controllers_HomeController_updateEmployeeSubmit10_invoker = createInvoker(
    HomeController_1.updateEmployeeSubmit(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateEmployeeSubmit",
      Seq(classOf[String]),
      "POST",
      this.prefix + """updateEmployeeSubmit/""" + "$" + """email<[^/]+>/""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_HomeController_deleteEmployee11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delEmployee/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteEmployee11_invoker = createInvoker(
    HomeController_1.deleteEmployee(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteEmployee",
      Seq(classOf[String]),
      "GET",
      this.prefix + """delEmployee/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_HomeController_employeesManager12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/employees")))
  )
  private[this] lazy val controllers_HomeController_employeesManager12_invoker = createInvoker(
    HomeController_1.employeesManager,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "employeesManager",
      Nil,
      "GET",
      this.prefix + """manager/employees""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_HomeController_departments13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("departments")))
  )
  private[this] lazy val controllers_HomeController_departments13_invoker = createInvoker(
    HomeController_1.departments,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "departments",
      Nil,
      "GET",
      this.prefix + """departments""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_HomeController_projects14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projects")))
  )
  private[this] lazy val controllers_HomeController_projects14_invoker = createInvoker(
    HomeController_1.projects,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "projects",
      Nil,
      "GET",
      this.prefix + """projects""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_HomeController_employeeProjects15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employeeProjects")))
  )
  private[this] lazy val controllers_HomeController_employeeProjects15_invoker = createInvoker(
    HomeController_1.employeeProjects(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "employeeProjects",
      Seq(classOf[String]),
      "GET",
      this.prefix + """employeeProjects""",
      """""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_HomeController_addDepartment16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/addDepartment")))
  )
  private[this] lazy val controllers_HomeController_addDepartment16_invoker = createInvoker(
    HomeController_1.addDepartment,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addDepartment",
      Nil,
      "GET",
      this.prefix + """manager/addDepartment""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_HomeController_addDepartmentSubmit17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/addDepartmentSubmit")))
  )
  private[this] lazy val controllers_HomeController_addDepartmentSubmit17_invoker = createInvoker(
    HomeController_1.addDepartmentSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addDepartmentSubmit",
      Nil,
      "POST",
      this.prefix + """manager/addDepartmentSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_HomeController_addProject18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/addProject")))
  )
  private[this] lazy val controllers_HomeController_addProject18_invoker = createInvoker(
    HomeController_1.addProject,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addProject",
      Nil,
      "GET",
      this.prefix + """manager/addProject""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_HomeController_addProjectSubmit19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/addProjectSubmit")))
  )
  private[this] lazy val controllers_HomeController_addProjectSubmit19_invoker = createInvoker(
    HomeController_1.addProjectSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addProjectSubmit",
      Nil,
      "POST",
      this.prefix + """manager/addProjectSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_HomeController_updateProject20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/updateProject/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateProject20_invoker = createInvoker(
    HomeController_1.updateProject(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateProject",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """manager/updateProject/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_HomeController_updateProjectSubmit21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/updateProjectSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateProjectSubmit21_invoker = createInvoker(
    HomeController_1.updateProjectSubmit(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateProjectSubmit",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """manager/updateProjectSubmit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_HomeController_deleteProject22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/deleteProject/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteProject22_invoker = createInvoker(
    HomeController_1.deleteProject(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteProject",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """manager/deleteProject/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call(params.fromQuery[Long]("department", Some(0L))) { (department) =>
        controllers_HomeController_index0_invoker.call(HomeController_1.index(department))
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params@_) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_0.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params@_) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_3.versioned(path, file))
      }
  
    // @LINE:18
    case controllers_LoginController_login4_route(params@_) =>
      call { 
        controllers_LoginController_login4_invoker.call(LoginController_4.login)
      }
  
    // @LINE:20
    case controllers_LoginController_loginSubmit5_route(params@_) =>
      call { 
        controllers_LoginController_loginSubmit5_invoker.call(LoginController_4.loginSubmit)
      }
  
    // @LINE:22
    case controllers_LoginController_logout6_route(params@_) =>
      call { 
        controllers_LoginController_logout6_invoker.call(LoginController_4.logout)
      }
  
    // @LINE:25
    case controllers_HomeController_addEmployee7_route(params@_) =>
      call { 
        controllers_HomeController_addEmployee7_invoker.call(HomeController_1.addEmployee)
      }
  
    // @LINE:26
    case controllers_HomeController_addEmployeeSubmit8_route(params@_) =>
      call { 
        controllers_HomeController_addEmployeeSubmit8_invoker.call(HomeController_1.addEmployeeSubmit)
      }
  
    // @LINE:27
    case controllers_HomeController_updateEmployee9_route(params@_) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_HomeController_updateEmployee9_invoker.call(HomeController_1.updateEmployee(email))
      }
  
    // @LINE:28
    case controllers_HomeController_updateEmployeeSubmit10_route(params@_) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_HomeController_updateEmployeeSubmit10_invoker.call(HomeController_1.updateEmployeeSubmit(email))
      }
  
    // @LINE:29
    case controllers_HomeController_deleteEmployee11_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_deleteEmployee11_invoker.call(HomeController_1.deleteEmployee(id))
      }
  
    // @LINE:31
    case controllers_HomeController_employeesManager12_route(params@_) =>
      call { 
        controllers_HomeController_employeesManager12_invoker.call(HomeController_1.employeesManager)
      }
  
    // @LINE:32
    case controllers_HomeController_departments13_route(params@_) =>
      call { 
        controllers_HomeController_departments13_invoker.call(HomeController_1.departments)
      }
  
    // @LINE:34
    case controllers_HomeController_projects14_route(params@_) =>
      call { 
        controllers_HomeController_projects14_invoker.call(HomeController_1.projects)
      }
  
    // @LINE:37
    case controllers_HomeController_employeeProjects15_route(params@_) =>
      call(params.fromQuery[String]("email", Some(null))) { (email) =>
        controllers_HomeController_employeeProjects15_invoker.call(HomeController_1.employeeProjects(email))
      }
  
    // @LINE:40
    case controllers_HomeController_addDepartment16_route(params@_) =>
      call { 
        controllers_HomeController_addDepartment16_invoker.call(HomeController_1.addDepartment)
      }
  
    // @LINE:41
    case controllers_HomeController_addDepartmentSubmit17_route(params@_) =>
      call { 
        controllers_HomeController_addDepartmentSubmit17_invoker.call(HomeController_1.addDepartmentSubmit)
      }
  
    // @LINE:43
    case controllers_HomeController_addProject18_route(params@_) =>
      call { 
        controllers_HomeController_addProject18_invoker.call(HomeController_1.addProject)
      }
  
    // @LINE:44
    case controllers_HomeController_addProjectSubmit19_route(params@_) =>
      call { 
        controllers_HomeController_addProjectSubmit19_invoker.call(HomeController_1.addProjectSubmit)
      }
  
    // @LINE:45
    case controllers_HomeController_updateProject20_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateProject20_invoker.call(HomeController_1.updateProject(id))
      }
  
    // @LINE:46
    case controllers_HomeController_updateProjectSubmit21_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateProjectSubmit21_invoker.call(HomeController_1.updateProjectSubmit(id))
      }
  
    // @LINE:47
    case controllers_HomeController_deleteProject22_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteProject22_invoker.call(HomeController_1.deleteProject(id))
      }
  }
}
