
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
    """),format.raw/*12.5*/("""<p class#"lead">Add a new Employee</p>

    """),_display_(/*14.6*/form(action=routes.HomeController.addEmployeeSubmit(),
        'class -> "form-horizontal",
        'role -> "form",
        'enctype -> "multipart/form-data")/*17.43*/ {_display_(Seq[Any](format.raw/*17.45*/("""


        """),_display_(/*20.10*/CSRF/*20.14*/.formField),format.raw/*20.24*/("""

        """),_display_(/*22.10*/inputText(employeeForm("id"), '_label -> "id", 'class -> "form-control")),format.raw/*22.82*/("""
        """),_display_(/*23.10*/select(

            employeeForm("Department.id"),options(Department.options),'_label ->"Department",'_default -> "--Choose department please--",
            '_showConstraints -> false, 'class-> "form-control"

        )),format.raw/*28.10*/("""
        """),_display_(/*29.10*/select(

            employeeForm("Address.id"),options(Address.options),'_label ->"Address",'_default -> "--Choose Address please--",
            '_showConstraints -> false, 'class-> "form-control"

        )),format.raw/*34.10*/("""
        """),_display_(/*35.10*/inputText(employeeForm("name"), '_label -> "name", 'class -> "form-control")),format.raw/*35.86*/("""


        """),_display_(/*38.10*/for((value, name) <- Project.options) yield /*38.47*/ {_display_(Seq[Any](format.raw/*38.49*/("""
            """),format.raw/*39.13*/("""<input type="checkbox" name="projSelect[]" value=""""),_display_(/*39.64*/value),format.raw/*39.69*/(""""

            />"""),_display_(/*41.16*/name),format.raw/*41.20*/("""<br>
        """)))}),format.raw/*42.10*/("""


        """),_display_(/*45.10*/inputText(employeeForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*45.75*/("""

        """),_display_(/*47.10*/inputText(employeeForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*47.94*/("""
        """),_display_(/*48.10*/inputText(employeeForm("role").copy(value=Some("customer")), '_label -> "",'hidden -> "hidden")),format.raw/*48.105*/("""






        """),format.raw/*55.9*/("""<label>Image Upload</label>
        <input class="btn-sm btn-default" type="file" name="upload">
        <br><br>
        <div class="actions">
            <input type="submit" value="Add/Update Employee" class="btn btn-primary">
            <a href=""""),_display_(/*60.23*/routes/*60.29*/.HomeController.index(0)),format.raw/*60.53*/("""">
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
                  DATE: Thu Mar 07 21:23:37 GMT 2019
                  SOURCE: /home/ryan/Documents/sdev4CA1/app/views/addEmployee.scala.html
                  HASH: d52f33919ceef4f34868948c507bac8d081e6ad0
                  MATRIX: 651->1|691->35|727->65|766->98|805->131|1197->168|1346->246|1390->262|1419->265|1454->291|1493->292|1525->297|1596->342|1764->501|1804->503|1843->515|1856->519|1887->529|1925->540|2018->612|2055->622|2297->843|2334->853|2564->1062|2601->1072|2698->1148|2737->1160|2790->1197|2830->1199|2871->1212|2949->1263|2975->1268|3020->1286|3045->1290|3090->1304|3129->1316|3215->1381|3253->1392|3358->1476|3395->1486|3512->1581|3554->1596|3833->1848|3848->1854|3893->1878
                  LINES: 24->1|25->2|26->3|27->4|28->5|33->7|36->8|39->9|41->11|41->11|41->11|42->12|44->14|47->17|47->17|50->20|50->20|50->20|52->22|52->22|53->23|58->28|59->29|64->34|65->35|65->35|68->38|68->38|68->38|69->39|69->39|69->39|71->41|71->41|72->42|75->45|75->45|77->47|77->47|78->48|78->48|85->55|90->60|90->60|90->60
                  -- GENERATED --
              */
          