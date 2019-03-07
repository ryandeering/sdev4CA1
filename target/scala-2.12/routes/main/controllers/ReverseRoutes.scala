// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ryan/Documents/sdev4CA1/conf/routes
// @DATE:Thu Mar 07 21:15:04 GMT 2019

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

  
    // @LINE:26
    def addEmployeeSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "manager/addEmployeeSubmit")
    }
  
    // @LINE:30
    def address(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "address")
    }
  
    // @LINE:28
    def managers(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manager/managers")
    }
  
    // @LINE:29
    def department(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "department")
    }
  
    // @LINE:31
    def project(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project")
    }
  
    // @LINE:6
    def index(department:Long = 0L): Call = {
      
      Call("GET", _prefix + play.core.routing.queryString(List(if(department == 0L) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("department", department)))))
    }
  
    // @LINE:27
    def employeesManager(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manager/employees")
    }
  
    // @LINE:25
    def addEmployee(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manager/addEmployee")
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
