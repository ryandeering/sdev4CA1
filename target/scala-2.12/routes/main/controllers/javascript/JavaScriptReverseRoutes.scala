// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ryan/Documents/a/sdev4CA1/conf/routes
// @DATE:Sat Mar 16 15:06:08 GMT 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:13
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:47
    def addProject: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addProject",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manager/addProject"})
        }
      """
    )
  
    // @LINE:43
    def updateDepartment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateDepartment",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manager/updateDepartment/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:34
    def projects: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.projects",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "projects"})
        }
      """
    )
  
    // @LINE:51
    def deleteProject: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteProject",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manager/deleteProject/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:44
    def updateDepartmentSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateDepartmentSubmit",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "manager/updateDepartmentSubmit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:50
    def updateProjectSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateProjectSubmit",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "manager/updateProjectSubmit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:49
    def updateProject: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateProject",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manager/updateProject/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:26
    def addEmployeeSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addEmployeeSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "manager/addEmployeeSubmit"})
        }
      """
    )
  
    // @LINE:29
    def deleteEmployee: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteEmployee",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delEmployee/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:41
    def addDepartmentSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addDepartmentSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "manager/addDepartmentSubmit"})
        }
      """
    )
  
    // @LINE:28
    def updateEmployeeSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateEmployeeSubmit",
      """
        function(email0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateEmployeeSubmit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("email", email0)) + "/"})
        }
      """
    )
  
    // @LINE:42
    def deleteDepartment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteDepartment",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manager/deleteDepartment/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function(department0) {
          return _wA({method:"GET", url:"""" + _prefix + """" + _qS([(department0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("department", department0))])})
        }
      """
    )
  
    // @LINE:27
    def updateEmployee: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateEmployee",
      """
        function(email0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateEmployee/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("email", email0)) + "/"})
        }
      """
    )
  
    // @LINE:31
    def employeesManager: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.employeesManager",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manager/employees"})
        }
      """
    )
  
    // @LINE:25
    def addEmployee: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addEmployee",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manager/addEmployee"})
        }
      """
    )
  
    // @LINE:37
    def employeeProjects: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.employeeProjects",
      """
        function(email0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employeeProjects" + _qS([(email0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("email", email0))])})
        }
      """
    )
  
    // @LINE:48
    def addProjectSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addProjectSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "manager/addProjectSubmit"})
        }
      """
    )
  
    // @LINE:32
    def departments: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.departments",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "departments"})
        }
      """
    )
  
    // @LINE:40
    def addDepartment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addDepartment",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manager/addDepartment"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:18
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def loginSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.loginSubmit",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loginSubmit"})
        }
      """
    )
  
    // @LINE:22
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:18
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }


}
