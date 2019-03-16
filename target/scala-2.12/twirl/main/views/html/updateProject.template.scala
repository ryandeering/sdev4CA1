
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

object updateProject extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Long,Form[models.entities.Project],models.employees.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, projectForm: Form[models.entities.Project], user: models.employees.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Update Project", user)/*4.30*/ {_display_(Seq[Any](format.raw/*4.32*/("""
    """),format.raw/*5.5*/("""<div class="col-sm-3">
        <p class="lead">Update project</p>
        """),_display_(/*7.10*/form(action=routes.HomeController.updateProjectSubmit(id), 'class -> "form-horizontal", 'role -> "form", 'enctype -> "multipart/form-data")/*7.149*/ {_display_(Seq[Any](format.raw/*7.151*/("""
            """),_display_(/*8.14*/CSRF/*8.18*/.formField),format.raw/*8.28*/("""

            """),_display_(/*10.14*/inputText(projectForm("Pname"), '_label -> "Name", 'class -> "form-control")),format.raw/*10.90*/("""

            """),format.raw/*12.13*/("""<div class="actions">
                <input type="submit" value="Update Project" class="btn btn-primary">
                <a href=""""),_display_(/*14.27*/routes/*14.33*/.HomeController.projects()),format.raw/*14.59*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
        </div>
""")))}),format.raw/*19.2*/("""
""")))}))
      }
    }
  }

  def render(id:Long,projectForm:Form[models.entities.Project],user:models.employees.User): play.twirl.api.HtmlFormat.Appendable = apply(id,projectForm,user)

  def f:((Long,Form[models.entities.Project],models.employees.User) => play.twirl.api.HtmlFormat.Appendable) = (id,projectForm,user) => apply(id,projectForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 16 14:50:05 GMT 2019
                  SOURCE: /home/ryan/Documents/a/sdev4CA1/app/views/updateProject.scala.html
                  HASH: 3ef0292e09f98098e4b6f4a5b54c3a7a09f67d32
                  MATRIX: 1006->1|1162->86|1206->102|1233->104|1269->132|1308->134|1339->139|1440->214|1588->353|1628->355|1668->369|1680->373|1710->383|1752->398|1849->474|1891->488|2051->621|2066->627|2113->653|2284->794
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|38->7|38->7|38->7|39->8|39->8|39->8|41->10|41->10|43->12|45->14|45->14|45->14|50->19
                  -- GENERATED --
              */
          