
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
/*3.2*/import models.entities.Project
/*4.2*/import models.entities.Department


Seq[Any](format.raw/*5.1*/("""



"""),_display_(/*9.2*/main("Update Employee", user)/*9.31*/ {_display_(Seq[Any](format.raw/*9.33*/("""
    """),format.raw/*10.5*/("""<p class="lead">Update Employee</p>
    """),_display_(/*11.6*/form(action=routes.HomeController.updateEmployeeSubmit(email), 'class -> "form-horizontal", 'role -> "form", 'enctype -> "multipart/form-data")/*11.149*/ {_display_(Seq[Any](format.raw/*11.151*/("""
        """),_display_(/*12.10*/CSRF/*12.14*/.formField),format.raw/*12.24*/("""
        """),_display_(/*13.10*/inputText(updateEmployeeForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*13.94*/("""
        """),_display_(/*14.10*/inputText(updateEmployeeForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*14.100*/("""
        """),_display_(/*15.10*/inputText(updateEmployeeForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*15.92*/("""
        """),_display_(/*16.10*/inputText(updateEmployeeForm("address.address"), '_label -> "Address", 'class -> "form-control")),format.raw/*16.106*/("""
        """),_display_(/*17.10*/select(updateEmployeeForm("department.id"), options(Department.options), '_label -> "Department", '_default -> "-- Choose a department --", '_showConstraints -> false, 'class -> "form-control")),format.raw/*17.203*/("""
        """),_display_(/*18.10*/inputText(updateEmployeeForm("role"), '_label -> "Role, Choose either 'employee' or 'manager'", 'class -> "form-control")),format.raw/*18.131*/("""

        """),_display_(/*20.10*/for((value, name) <- Project.options) yield /*20.47*/ {_display_(Seq[Any](format.raw/*20.49*/("""
            """),format.raw/*21.13*/("""<input type="checkbox" name="projSelect[]" value=""""),_display_(/*21.64*/value),format.raw/*21.69*/(""""
            """),_display_(/*22.14*/if(Project.inProject(value.toLong, email))/*22.56*/ {_display_(Seq[Any](format.raw/*22.58*/("""
                """),format.raw/*23.17*/("""checked
            """)))}),format.raw/*24.14*/("""
            """),format.raw/*25.13*/("""/>"""),_display_(/*25.16*/name),format.raw/*25.20*/("""<br>
        """)))}),format.raw/*26.10*/("""

        """),format.raw/*28.9*/("""<label>Image Upload</label>
        <input class="btn-sm btn-default" type="file" name="upload">
        <br></br>

        <div class="actions">
            <input type="submit" value="Update Employee" class="btn btn-primary">
            <a href=""""),_display_(/*34.23*/routes/*34.29*/.HomeController.index(0)),format.raw/*34.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*38.6*/("""
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
                  DATE: Sat Mar 09 20:31:01 GMT 2019
                  SOURCE: /home/ryan/Documents/sdev4CA1/app/views/updateEmployee.scala.html
                  HASH: 2cc611a66dc066552410e392eb1ebcc6676818d1
                  MATRIX: 1011->1|1181->100|1204->117|1242->149|1304->183|1334->188|1371->217|1410->219|1442->224|1509->265|1662->408|1703->410|1740->420|1753->424|1784->434|1821->444|1926->528|1963->538|2075->628|2112->638|2215->720|2252->730|2370->826|2407->836|2622->1029|2659->1039|2802->1160|2840->1171|2893->1208|2933->1210|2974->1223|3052->1274|3078->1279|3120->1294|3171->1336|3211->1338|3256->1355|3308->1376|3349->1389|3379->1392|3404->1396|3449->1410|3486->1420|3763->1670|3778->1676|3823->1700|3971->1818
                  LINES: 28->1|31->2|32->3|33->4|36->5|40->9|40->9|40->9|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|45->14|45->14|46->15|46->15|47->16|47->16|48->17|48->17|49->18|49->18|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|55->24|56->25|56->25|56->25|57->26|59->28|65->34|65->34|65->34|69->38
                  -- GENERATED --
              */
          