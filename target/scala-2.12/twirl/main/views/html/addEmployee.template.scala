
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
  def apply/*1.2*/(userForm : Form[models.employees.Employee],user:models.employees.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._
/*3.2*/import models.employees._


Seq[Any](format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("New Employees",user)/*5.28*/{_display_(Seq[Any](format.raw/*5.29*/("""
    """),format.raw/*6.5*/("""<p class="lead">Register</p>


    """),_display_(/*9.6*/form(action=routes.HomeController.addEmployeeSubmit(), 'class -> "form-horizontal", 'role -> "form")/*9.106*/ {_display_(Seq[Any](format.raw/*9.108*/("""
        """),format.raw/*10.37*/("""
        """),format.raw/*11.99*/("""
        """),_display_(/*12.10*/CSRF/*12.14*/.formField),format.raw/*12.24*/("""
        """),_display_(/*13.10*/inputText(userForm("email"), '_label -> "email", 'class -> "form-control")),format.raw/*13.84*/("""
        """),_display_(/*14.10*/inputText(userForm("name"), '_label -> "name", 'class -> "form-control")),format.raw/*14.82*/("""
        """),_display_(/*15.10*/inputText(userForm("password"), '_label -> "password", 'class -> "form-control")),format.raw/*15.90*/("""

            """),format.raw/*17.13*/("""<!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
        <div class="actions">
            <input type="submit" value="Add/Update item" class="btn btn-primary">
            <a href=""""),_display_(/*23.23*/routes/*23.29*/.HomeController.employeesManager()),format.raw/*23.63*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*27.6*/(""" """),format.raw/*27.24*/("""
""")))}),format.raw/*28.2*/(""" """),format.raw/*28.20*/("""

"""))
      }
    }
  }

  def render(userForm:Form[models.employees.Employee],user:models.employees.User): play.twirl.api.HtmlFormat.Appendable = apply(userForm,user)

  def f:((Form[models.employees.Employee],models.employees.User) => play.twirl.api.HtmlFormat.Appendable) = (userForm,user) => apply(userForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 04 21:49:22 GMT 2019
                  SOURCE: /home/ryan/Documents/sdev4CA1/app/views/addEmployee.scala.html
                  HASH: ffbdc6d960ef2ab2ee654b6f1836bc5e725ef04c
                  MATRIX: 1001->1|1145->74|1168->91|1222->117|1249->119|1283->145|1321->146|1352->151|1413->187|1522->287|1562->289|1599->326|1636->425|1673->435|1686->439|1717->449|1754->459|1849->533|1886->543|1979->615|2016->625|2117->705|2159->719|2539->1072|2554->1078|2609->1112|2757->1230|2786->1248|2818->1250|2847->1268
                  LINES: 28->1|31->2|32->3|35->4|36->5|36->5|36->5|37->6|40->9|40->9|40->9|41->10|42->11|43->12|43->12|43->12|44->13|44->13|45->14|45->14|46->15|46->15|48->17|54->23|54->23|54->23|58->27|58->27|59->28|59->28
                  -- GENERATED --
              */
          