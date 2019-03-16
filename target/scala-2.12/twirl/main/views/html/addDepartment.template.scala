
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

object addDepartment extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.entities.Department],models.employees.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(departmentForm: Form[models.entities.Department], user: models.employees.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add Department", user)/*4.30*/ {_display_(Seq[Any](format.raw/*4.32*/("""
    """),format.raw/*5.5*/("""<p class="lead">Add a new department</p>
    """),_display_(/*6.6*/form(action=routes.HomeController.addDepartmentSubmit(), 'class -> "form-horizontal", 'enctype -> "multipart/form-data")/*6.126*/ {_display_(Seq[Any](format.raw/*6.128*/("""
        """),_display_(/*7.10*/CSRF/*7.14*/.formField),format.raw/*7.24*/("""

        """),_display_(/*9.10*/inputText(departmentForm("name"), '_label -> "Department name", 'class -> "form-control")),format.raw/*9.99*/("""

        """),format.raw/*11.9*/("""<div>
            <input type="submit" value="Add/Update Department" class="btn btn-primary">
            <a href=""""),_display_(/*13.23*/routes/*13.29*/.HomeController.departments),format.raw/*13.56*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>


        </div>
    """)))}),format.raw/*19.6*/("""
""")))}))
      }
    }
  }

  def render(departmentForm:Form[models.entities.Department],user:models.employees.User): play.twirl.api.HtmlFormat.Appendable = apply(departmentForm,user)

  def f:((Form[models.entities.Department],models.employees.User) => play.twirl.api.HtmlFormat.Appendable) = (departmentForm,user) => apply(departmentForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 16 14:50:05 GMT 2019
                  SOURCE: /home/ryan/Documents/a/sdev4CA1/app/views/addDepartment.scala.html
                  HASH: 14a26c10b0ae433c59ed4e92bf7d6780a78e7889
                  MATRIX: 1004->1|1156->82|1200->98|1227->100|1263->128|1302->130|1333->135|1404->181|1533->301|1573->303|1609->313|1621->317|1651->327|1688->338|1797->427|1834->437|1977->553|1992->559|2040->586|2190->706
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|37->6|37->6|37->6|38->7|38->7|38->7|40->9|40->9|42->11|44->13|44->13|44->13|50->19
                  -- GENERATED --
              */
          