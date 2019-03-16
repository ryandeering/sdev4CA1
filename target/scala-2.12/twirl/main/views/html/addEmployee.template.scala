
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

object addEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[models.employees.Employee],Form[models.entities.Address],Form[models.entities.Department],models.employees.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(employeeForm: Form[models.employees.Employee], addressForm: Form[models.entities.Address], departmentForm: Form[models.entities.Department],user: models.employees.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._
/*4.2*/import models.employees.Employee
/*5.2*/import models.employees.User
/*6.2*/import models.entities.Project;
/*7.2*/import models.entities.Address;
/*8.2*/import models.entities.Department;


Seq[Any](format.raw/*9.1*/("""
"""),_display_(/*10.2*/main("Add Employee", user)/*10.28*/{_display_(Seq[Any](format.raw/*10.29*/("""
    """),format.raw/*11.5*/("""<p class="lead">Add a new Employee</p>

    """),_display_(/*13.6*/form(action=routes.HomeController.addEmployeeSubmit(),
        'class -> "form-horizontal",
        'role -> "form",
        'enctype -> "multipart/form-data")/*16.43*/ {_display_(Seq[Any](format.raw/*16.45*/("""


        """),_display_(/*19.10*/CSRF/*19.14*/.formField),format.raw/*19.24*/("""

        """),_display_(/*21.10*/inputText(employeeForm("email"), '_label -> "id", 'class -> "form-control")),format.raw/*21.85*/("""

        """),_display_(/*23.10*/inputText(addressForm("address.address"), '_label -> "Address", 'class -> "form-control")),format.raw/*23.99*/("""
        """),_display_(/*24.10*/select(
            departmentForm("department.id"),
            options(Department.options),
            '_label -> "Department", '_default -> "-- Choose a Department --",
            '_showConstraints -> false, 'class -> "form-control"
        )),format.raw/*29.10*/("""

        """),_display_(/*31.10*/inputText(employeeForm("name"), '_label -> "name", 'class -> "form-control")),format.raw/*31.86*/("""

        """),_display_(/*33.10*/inputText(employeeForm("role").copy(value=Some("employee")), '_label -> "",'hidden -> "hidden")),format.raw/*33.105*/("""

        """),_display_(/*35.10*/inputText(employeeForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*35.94*/("""


        """),_display_(/*38.10*/for((value, name) <- Project.options) yield /*38.47*/ {_display_(Seq[Any](format.raw/*38.49*/("""
            """),format.raw/*39.13*/("""<input type="checkbox" name="projSelect[]" value=""""),_display_(/*39.64*/value),format.raw/*39.69*/(""""/>"""),_display_(/*39.73*/name),format.raw/*39.77*/("""<br>
        """)))}),format.raw/*40.10*/("""



        """),format.raw/*44.9*/("""<label>Image Upload</label>
        <input class="btn-sm btn-default" type="file" name="upload">
        <br><br>
        <div class="actions">
            <input type="submit" value="Add/Update Employee" class="btn btn-primary">
            <a href=""""),_display_(/*49.23*/routes/*49.29*/.HomeController.index(0)),format.raw/*49.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))})))}))
      }
    }
  }

  def render(employeeForm:Form[models.employees.Employee],addressForm:Form[models.entities.Address],departmentForm:Form[models.entities.Department],user:models.employees.User): play.twirl.api.HtmlFormat.Appendable = apply(employeeForm,addressForm,departmentForm,user)

  def f:((Form[models.employees.Employee],Form[models.entities.Address],Form[models.entities.Department],models.employees.User) => play.twirl.api.HtmlFormat.Appendable) = (employeeForm,addressForm,departmentForm,user) => apply(employeeForm,addressForm,departmentForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 16 14:50:05 GMT 2019
                  SOURCE: /home/ryan/Documents/a/sdev4CA1/app/views/addEmployee.scala.html
                  HASH: dec2261e1f24aa8868e0425c43bafe3ea356e881
                  MATRIX: 1064->2|1306->173|1329->190|1369->224|1405->254|1444->287|1483->320|1546->355|1574->357|1609->383|1648->384|1680->389|1751->434|1919->593|1959->595|1998->607|2011->611|2042->621|2080->632|2176->707|2214->718|2324->807|2361->817|2629->1064|2667->1075|2764->1151|2802->1162|2919->1257|2957->1268|3062->1352|3101->1364|3154->1401|3194->1403|3235->1416|3313->1467|3339->1472|3370->1476|3395->1480|3440->1494|3479->1506|3758->1758|3773->1764|3818->1788
                  LINES: 28->2|31->3|32->4|33->5|34->6|35->7|36->8|39->9|40->10|40->10|40->10|41->11|43->13|46->16|46->16|49->19|49->19|49->19|51->21|51->21|53->23|53->23|54->24|59->29|61->31|61->31|63->33|63->33|65->35|65->35|68->38|68->38|68->38|69->39|69->39|69->39|69->39|69->39|70->40|74->44|79->49|79->49|79->49
                  -- GENERATED --
              */
          