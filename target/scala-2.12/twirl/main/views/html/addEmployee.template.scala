
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
/*1.2*/import models.employees.Employee
/*2.2*/import models.employees.User
/*3.2*/import models.entities.Project;
/*4.2*/import models.entities.Address;
/*5.2*/import models.entities.Department;

object addEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.employees.Employee],models.employees.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(employeeForm: Form[models.employees.Employee], user: models.employees.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*8.2*/import helper._


Seq[Any](format.raw/*9.1*/("""

"""),_display_(/*11.2*/main("Add Employee", user)/*11.28*/{_display_(Seq[Any](format.raw/*11.29*/("""
    """),format.raw/*12.5*/("""<p class="lead">Add a new Employee</p>

    """),_display_(/*14.6*/form(action=routes.HomeController.addEmployeeSubmit(),
        'class -> "form-horizontal",
        'role -> "form",
        'enctype -> "multipart/form-data")/*17.43*/ {_display_(Seq[Any](format.raw/*17.45*/("""


        """),_display_(/*20.10*/CSRF/*20.14*/.formField),format.raw/*20.24*/("""

        """),_display_(/*22.10*/inputText(employeeForm("email"), '_label -> "id", 'class -> "form-control")),format.raw/*22.85*/("""

        """),_display_(/*24.10*/inputText(employeeForm("address.address"), '_label -> "Address", 'class -> "form-control")),format.raw/*24.100*/("""
        """),_display_(/*25.10*/select(
            employeeForm("department.id"),
            options(Department.options),
            '_label -> "Department", '_default -> "-- Choose a Department --",
            '_showConstraints -> false, 'class -> "form-control"
        )),format.raw/*30.10*/("""


        """),_display_(/*33.10*/inputText(employeeForm("name"), '_label -> "name", 'class -> "form-control")),format.raw/*33.86*/("""

        """),_display_(/*35.10*/inputText(employeeForm("role").copy(value=Some("employee")), '_label -> "",'hidden -> "hidden")),format.raw/*35.105*/("""

        """),_display_(/*37.10*/inputText(employeeForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*37.94*/("""


        """),_display_(/*40.10*/for((value, name) <- Project.options) yield /*40.47*/ {_display_(Seq[Any](format.raw/*40.49*/("""
            """),format.raw/*41.13*/("""<input type="checkbox" name="projSelect[]" value=""""),_display_(/*41.64*/value),format.raw/*41.69*/(""""/>"""),_display_(/*41.73*/name),format.raw/*41.77*/("""<br>
        """)))}),format.raw/*42.10*/("""






        """),format.raw/*49.9*/("""<label>Image Upload</label>
        <input class="btn-sm btn-default" type="file" name="upload">
        <br><br>
        <div class="actions">
            <input type="submit" value="Add/Update Employee" class="btn btn-primary">
            <a href=""""),_display_(/*54.23*/routes/*54.29*/.HomeController.index(0)),format.raw/*54.53*/("""">
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
                  DATE: Sat Mar 09 20:31:01 GMT 2019
                  SOURCE: /home/ryan/Documents/sdev4CA1/app/views/addEmployee.scala.html
                  HASH: 331ef5e8dacf64c1859c4888a84d76c0e2b0b20b
                  MATRIX: 651->1|691->35|727->65|766->98|805->131|1197->168|1346->246|1390->262|1419->265|1454->291|1493->292|1525->297|1596->342|1764->501|1804->503|1843->515|1856->519|1887->529|1925->540|2021->615|2059->626|2171->716|2208->726|2474->971|2513->983|2610->1059|2648->1070|2765->1165|2803->1176|2908->1260|2947->1272|3000->1309|3040->1311|3081->1324|3159->1375|3185->1380|3216->1384|3241->1388|3286->1402|3328->1417|3607->1669|3622->1675|3667->1699
                  LINES: 24->1|25->2|26->3|27->4|28->5|33->7|36->8|39->9|41->11|41->11|41->11|42->12|44->14|47->17|47->17|50->20|50->20|50->20|52->22|52->22|54->24|54->24|55->25|60->30|63->33|63->33|65->35|65->35|67->37|67->37|70->40|70->40|70->40|71->41|71->41|71->41|71->41|71->41|72->42|79->49|84->54|84->54|84->54
                  -- GENERATED --
              */
          