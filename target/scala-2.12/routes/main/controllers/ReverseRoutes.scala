// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ryan/Documents/a/sdev4CA1/conf/routes
// @DATE:Fri Mar 15 12:24:44 GMT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:13
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def addProject(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manager/addProject")
    }
  
    // @LINE:34
    def projects(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "projects")
    }
  
    // @LINE:47
    def deleteProject(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manager/deleteProject/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:46
    def updateProjectSubmit(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "manager/updateProjectSubmit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:45
    def updateProject(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manager/updateProject/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:26
    def addEmployeeSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "manager/addEmployeeSubmit")
    }
  
    // @LINE:29
    def deleteEmployee(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delEmployee/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:41
    def addDepartmentSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "manager/addDepartmentSubmit")
    }
  
    // @LINE:28
    def updateEmployeeSubmit(email:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateEmployeeSubmit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("email", email)) + "/")
    }
  
    // @LINE:6
    def index(department:Long = 0L): Call = {
      
      Call("GET", _prefix + play.core.routing.queryString(List(if(department == 0L) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("department", department)))))
    }
  
    // @LINE:27
    def updateEmployee(email:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateEmployee/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("email", email)) + "/")
    }
  
    // @LINE:31
    def employeesManager(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manager/employees")
    }
  
    // @LINE:25
    def addEmployee(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manager/addEmployee")
    }
  
    // @LINE:37
    def employeeProjects(email:String = null): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "employeeProjects" + play.core.routing.queryString(List(if(email == null) None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("email", email)))))
    }
  
    // @LINE:44
    def addProjectSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "manager/addProjectSubmit")
    }
  
    // @LINE:32
    def departments(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "departments")
    }
  
    // @LINE:40
    def addDepartment(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manager/addDepartment")
    }
  
  }

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:18
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def loginSubmit(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "loginSubmit")
    }
  
    // @LINE:22
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:18
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }


}
