
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


        """),_display_(/*32.10*/inputText(employeeForm("name"), '_label -> "name", 'class -> "form-control")),format.raw/*32.86*/("""

        """),_display_(/*34.10*/inputText(employeeForm("role").copy(value=Some("employee")), '_label -> "",'hidden -> "hidden")),format.raw/*34.105*/("""

        """),_display_(/*36.10*/inputText(employeeForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*36.94*/("""


        """),_display_(/*39.10*/for((value, name) <- Project.options) yield /*39.47*/ {_display_(Seq[Any](format.raw/*39.49*/("""
            """),format.raw/*40.13*/("""<input type="checkbox" name="projSelect[]" value=""""),_display_(/*40.64*/value),format.raw/*40.69*/(""""/>"""),_display_(/*40.73*/name),format.raw/*40.77*/("""<br>
        """)))}),format.raw/*41.10*/("""






        """),format.raw/*48.9*/("""<label>Image Upload</label>
        <input class="btn-sm btn-default" type="file" name="upload">
        <br><br>
        <div class="actions">
            <input type="submit" value="Add/Update Employee" class="btn btn-primary">
            <a href=""""),_display_(/*53.23*/routes/*53.29*/.HomeController.index(0)),format.raw/*53.53*/("""">
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
                  DATE: Fri Mar 15 12:24:44 GMT 2019
                  SOURCE: /home/ryan/Documents/a/sdev4CA1/app/views/addEmployee.scala.html
                  HASH: 8a00c320423e04ae89cd77d9258d71f6e654e8bf
                  MATRIX: 1064->2|1306->173|1329->190|1369->224|1405->254|1444->287|1483->320|1546->355|1574->357|1609->383|1648->384|1680->389|1751->434|1919->593|1959->595|1998->607|2011->611|2042->621|2080->632|2176->707|2214->718|2324->807|2361->817|2629->1064|2668->1076|2765->1152|2803->1163|2920->1258|2958->1269|3063->1353|3102->1365|3155->1402|3195->1404|3236->1417|3314->1468|3340->1473|3371->1477|3396->1481|3441->1495|3483->1510|3762->1762|3777->1768|3822->1792
                  LINES: 28->2|31->3|32->4|33->5|34->6|35->7|36->8|39->9|40->10|40->10|40->10|41->11|43->13|46->16|46->16|49->19|49->19|49->19|51->21|51->21|53->23|53->23|54->24|59->29|62->32|62->32|64->34|64->34|66->36|66->36|69->39|69->39|69->39|70->40|70->40|70->40|70->40|70->40|71->41|78->48|83->53|83->53|83->53
                  -- GENERATED --
              */
          