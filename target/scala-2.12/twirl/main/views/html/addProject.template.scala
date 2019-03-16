
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

object addProject extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.entities.Project],models.employees.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projectForm: Form[models.entities.Project], user: models.employees.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add Project", user)/*4.27*/ {_display_(Seq[Any](format.raw/*4.29*/("""
"""),format.raw/*5.1*/("""<div class="col-sm-3">
    <p class="lead">Add a new project</p>
    """),_display_(/*7.6*/form(action=routes.HomeController.addProjectSubmit(), 'class -> "form-horizontal", 'role -> "form", 'enctype -> "multipart/form-data")/*7.140*/ {_display_(Seq[Any](format.raw/*7.142*/("""
    """),_display_(/*8.6*/CSRF/*8.10*/.formField),format.raw/*8.20*/("""

    """),_display_(/*10.6*/inputText(projectForm("Pname"), '_label -> "Name", 'class -> "form-control")),format.raw/*10.82*/("""

    """),format.raw/*12.5*/("""<div class="actions">
        <input type="submit" value="Add Project" class="btn btn-primary">
        <a href=""""),_display_(/*14.19*/routes/*14.25*/.HomeController.index(0)),format.raw/*14.49*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
</div>
""")))}),format.raw/*19.2*/("""
""")))}))
      }
    }
  }

  def render(projectForm:Form[models.entities.Project],user:models.employees.User): play.twirl.api.HtmlFormat.Appendable = apply(projectForm,user)

  def f:((Form[models.entities.Project],models.employees.User) => play.twirl.api.HtmlFormat.Appendable) = (projectForm,user) => apply(projectForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 16 14:50:05 GMT 2019
                  SOURCE: /home/ryan/Documents/a/sdev4CA1/app/views/addProject.scala.html
                  HASH: d6d0632135ee7ad092419797a4d8efb10292b1ea
                  MATRIX: 998->1|1144->76|1188->92|1215->94|1248->119|1287->121|1314->122|1409->192|1552->326|1592->328|1623->334|1635->338|1665->348|1698->355|1795->431|1828->437|1969->551|1984->557|2029->581|2168->690
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|38->7|38->7|38->7|39->8|39->8|39->8|41->10|41->10|43->12|45->14|45->14|45->14|50->19
                  -- GENERATED --
              */
          