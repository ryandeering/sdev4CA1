
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

object project extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.entities.Project],models.employees.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(project: List[models.entities.Project], user: models.employees.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Project", user)/*2.23*/{_display_(Seq[Any](format.raw/*2.24*/("""
    """),format.raw/*3.5*/("""<p class="lead">Project List</p>

    """),_display_(/*5.6*/if(flash.containsKey("success"))/*5.38*/{_display_(Seq[Any](format.raw/*5.39*/("""

        """),format.raw/*7.9*/("""<div class="alert alert-success">
        """),_display_(/*8.10*/flash/*8.15*/.get("success")),format.raw/*8.30*/("""
        """),format.raw/*9.9*/("""</div>
    """)))}),format.raw/*10.6*/("""
    """),format.raw/*11.5*/("""<table class="table table-bordered table-hover table-condensed">
        <thead>
            <tr>
                <th>ID</th>
                <th>Project</th>
            </tr>
        </thead>
        <tbody>
        """),_display_(/*19.10*/for(p<-project) yield /*19.25*/ {_display_(Seq[Any](format.raw/*19.27*/("""
            """),format.raw/*20.13*/("""<tr>
                <td>"""),_display_(/*21.22*/p/*21.23*/.getId),format.raw/*21.29*/("""</td>
                <td>"""),_display_(/*22.22*/p/*22.23*/.getPname),format.raw/*22.32*/("""</td>
            </tr>
        """)))}),format.raw/*24.10*/("""
        """),format.raw/*25.9*/("""</tbody>
    </table>


""")))}))
      }
    }
  }

  def render(project:List[models.entities.Project],user:models.employees.User): play.twirl.api.HtmlFormat.Appendable = apply(project,user)

  def f:((List[models.entities.Project],models.employees.User) => play.twirl.api.HtmlFormat.Appendable) = (project,user) => apply(project,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 07 21:15:05 GMT 2019
                  SOURCE: /home/ryan/Documents/sdev4CA1/app/views/project.scala.html
                  HASH: f92ad6e70f8781aa9c6995b4c05c852b256bcf90
                  MATRIX: 995->1|1158->72|1187->93|1225->94|1256->99|1320->138|1360->170|1398->171|1434->181|1503->224|1516->229|1551->244|1586->253|1628->265|1660->270|1906->489|1937->504|1977->506|2018->519|2071->545|2081->546|2108->552|2162->579|2172->580|2202->589|2266->622|2302->631
                  LINES: 28->1|33->2|33->2|33->2|34->3|36->5|36->5|36->5|38->7|39->8|39->8|39->8|40->9|41->10|42->11|50->19|50->19|50->19|51->20|52->21|52->21|52->21|53->22|53->22|53->22|55->24|56->25
                  -- GENERATED --
              */
          