
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

object addEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.employees.Employee],models.employees.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(employeeForm: Form[models.employees.Employee], user: models.employees.User):play.twirl.api.HtmlFormat.Appendable = {
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

        """),_display_(/*23.10*/inputText(employeeForm("address.address"), '_label -> "Address", 'class -> "form-control")),format.raw/*23.100*/("""
        """),_display_(/*24.10*/select(
            employeeForm("department.id"),
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

  def render(employeeForm:Form[models.employees.Employee],user:models.employees.User): play.twirl.api.HtmlFormat.Appendable = apply(employeeForm,user)

  def f:((Form[models.employees.Employee],models.employees.User) => play.twirl.api.HtmlFormat.Appendable) = (employeeForm,user) => apply(employeeForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 09 21:03:56 GMT 2019
                  SOURCE: /home/ryan/Documents/sdev4CA1/app/views/addEmployee.scala.html
                  HASH: 76b36abd90aa16a219129838578952b2de4eede8
                  MATRIX: 1001->2|1150->80|1173->97|1213->131|1249->161|1288->194|1327->227|1390->262|1418->264|1453->290|1492->291|1524->296|1595->341|1763->500|1803->502|1842->514|1855->518|1886->528|1924->539|2020->614|2058->625|2170->715|2207->725|2473->970|2512->982|2609->1058|2647->1069|2764->1164|2802->1175|2907->1259|2946->1271|2999->1308|3039->1310|3080->1323|3158->1374|3184->1379|3215->1383|3240->1387|3285->1401|3327->1416|3606->1668|3621->1674|3666->1698
                  LINES: 28->2|31->3|32->4|33->5|34->6|35->7|36->8|39->9|40->10|40->10|40->10|41->11|43->13|46->16|46->16|49->19|49->19|49->19|51->21|51->21|53->23|53->23|54->24|59->29|62->32|62->32|64->34|64->34|66->36|66->36|69->39|69->39|69->39|70->40|70->40|70->40|70->40|70->40|71->41|78->48|83->53|83->53|83->53
                  -- GENERATED --
              */
          