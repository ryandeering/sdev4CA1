
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object updateEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Form[models.employees.Employee],models.employees.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(email: String, updateEmployeeForm: Form[models.employees.Employee], user: models.employees.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._
/*4.2*/import models.employees.Employee
/*5.2*/import models.employees.User
/*6.2*/import models.entities.Project;
/*7.2*/import models.entities.Address;
/*8.2*/import models.entities.Department;


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*9.1*/("""


"""),_display_(/*12.2*/main("Update Employee", user)/*12.31*/ {_display_(Seq[Any](format.raw/*12.33*/("""
    """),format.raw/*13.5*/("""<p class="lead">Update Employee</p>
    """),_display_(/*14.6*/form(action=routes.HomeController.updateEmployeeSubmit(email), 'class -> "form-horizontal", 'role -> "form", 'enctype -> "multipart/form-data")/*14.149*/ {_display_(Seq[Any](format.raw/*14.151*/("""
        """),_display_(/*15.10*/CSRF/*15.14*/.formField),format.raw/*15.24*/("""
        """),_display_(/*16.10*/inputText(updateEmployeeForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*16.94*/("""
        """),_display_(/*17.10*/inputPassword(updateEmployeeForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*17.104*/("""
        """),_display_(/*18.10*/inputText(updateEmployeeForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*18.92*/("""
        """),_display_(/*19.10*/inputText(updateEmployeeForm("address.address"), '_label -> "Address", 'class -> "form-control")),format.raw/*19.106*/("""
        """),_display_(/*20.10*/select(updateEmployeeForm("department.id"), options(Department.options), '_label -> "Department", '_default -> "-- Choose a department --", '_showConstraints -> false, 'class -> "form-control")),format.raw/*20.203*/("""
        """),_display_(/*21.10*/inputText(updateEmployeeForm("role").copy(value=Some("employee")), '_label -> "",'hidden -> "hidden")),format.raw/*21.111*/("""

        """),_display_(/*23.10*/for((value, name) <- Project.options) yield /*23.47*/ {_display_(Seq[Any](format.raw/*23.49*/("""
            """),format.raw/*24.13*/("""<input type="checkbox" name="projSelect[]" value=""""),_display_(/*24.64*/value),format.raw/*24.69*/(""""
            """),_display_(/*25.14*/if(Project.inProject(value.toLong, email))/*25.56*/ {_display_(Seq[Any](format.raw/*25.58*/("""
                """),format.raw/*26.17*/("""checked
            """)))}),format.raw/*27.14*/("""
            """),format.raw/*28.13*/("""/>"""),_display_(/*28.16*/name),format.raw/*28.20*/("""<br>
        """)))}),format.raw/*29.10*/("""

        """),format.raw/*31.9*/("""<label>Image Upload</label>
        <input class="btn-sm btn-default" type="file" name="upload">
        <br></br>

        <div class="actions">
            <input type="submit" value="Update Employee" class="btn btn-primary">
            <a href=""""),_display_(/*37.23*/routes/*37.29*/.HomeController.index(0)),format.raw/*37.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*41.6*/("""
""")))}))
      }
    }
  }

  def render(email:String,updateEmployeeForm:Form[models.employees.Employee],user:models.employees.User): play.twirl.api.HtmlFormat.Appendable = apply(email,updateEmployeeForm,user)

  def f:((String,Form[models.employees.Employee],models.employees.User) => play.twirl.api.HtmlFormat.Appendable) = (email,updateEmployeeForm,user) => apply(email,updateEmployeeForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 16 14:56:52 GMT 2019
                  SOURCE: /home/ryan/Documents/a/sdev4CA1/app/views/updateEmployee.scala.html
                  HASH: cad9cc41bb964a919b3a35ce8d140abf441b6a45
                  MATRIX: 1011->1|1181->100|1204->118|1244->152|1280->182|1319->215|1358->248|1421->116|1448->283|1478->287|1516->316|1556->318|1588->323|1655->364|1808->507|1849->509|1886->519|1899->523|1930->533|1967->543|2072->627|2109->637|2225->731|2262->741|2365->823|2402->833|2520->929|2557->939|2772->1132|2809->1142|2932->1243|2970->1254|3023->1291|3063->1293|3104->1306|3182->1357|3208->1362|3250->1377|3301->1419|3341->1421|3386->1438|3438->1459|3479->1472|3509->1475|3534->1479|3579->1493|3616->1503|3893->1753|3908->1759|3953->1783|4101->1901
                  LINES: 28->1|31->2|32->4|33->5|34->6|35->7|36->8|39->3|40->9|43->12|43->12|43->12|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|48->17|48->17|49->18|49->18|50->19|50->19|51->20|51->20|52->21|52->21|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|58->27|59->28|59->28|59->28|60->29|62->31|68->37|68->37|68->37|72->41
                  -- GENERATED --
              */
          