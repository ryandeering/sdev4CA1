
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

object department extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.entities.Department],models.employees.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(department: List[models.entities.Department], user: models.employees.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Department", user)/*2.26*/{_display_(Seq[Any](format.raw/*2.27*/("""
    """),format.raw/*3.5*/("""<p class="lead">Department List</p>
    """),_display_(/*4.6*/if(flash.containsKey("success"))/*4.38*/{_display_(Seq[Any](format.raw/*4.39*/("""
        """),format.raw/*5.9*/("""<div class="alert alert-success">
        """),_display_(/*6.10*/flash/*6.15*/.get("success")),format.raw/*6.30*/("""
        """),format.raw/*7.9*/("""</div>
    """)))}),format.raw/*8.6*/("""
    """),format.raw/*9.5*/("""<table class="table table-bordered table-hover table-condensed">
        <thead>
            <tr>
                <th>ID</th>
                <th>Department</th>
            </tr>
        </thead>
        <tbody>
            """),_display_(/*17.14*/for(d<-department) yield /*17.32*/ {_display_(Seq[Any](format.raw/*17.34*/("""
                """),format.raw/*18.17*/("""<tr>
                    <td>"""),_display_(/*19.26*/d/*19.27*/.getId),format.raw/*19.33*/("""</td>
                    <td>"""),_display_(/*20.26*/d/*20.27*/.getName),format.raw/*20.35*/("""</td>
                </tr>
            """)))}),format.raw/*22.14*/("""
        """),format.raw/*23.9*/("""</tbody>
    </table>
""")))}),format.raw/*25.2*/("""
"""))
      }
    }
  }

  def render(department:List[models.entities.Department],user:models.employees.User): play.twirl.api.HtmlFormat.Appendable = apply(department,user)

  def f:((List[models.entities.Department],models.employees.User) => play.twirl.api.HtmlFormat.Appendable) = (department,user) => apply(department,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 07 21:15:05 GMT 2019
                  SOURCE: /home/ryan/Documents/sdev4CA1/app/views/department.scala.html
                  HASH: 14cb2bf7a33b0e9a23eaeb9e894a23cefa17ef1e
                  MATRIX: 1001->1|1170->78|1202->102|1240->103|1271->108|1337->149|1377->181|1415->182|1450->191|1519->234|1532->239|1567->254|1602->263|1643->275|1674->280|1927->506|1961->524|2001->526|2046->543|2103->573|2113->574|2140->580|2198->611|2208->612|2237->620|2309->661|2345->670|2398->693
                  LINES: 28->1|33->2|33->2|33->2|34->3|35->4|35->4|35->4|36->5|37->6|37->6|37->6|38->7|39->8|40->9|48->17|48->17|48->17|49->18|50->19|50->19|50->19|51->20|51->20|51->20|53->22|54->23|56->25
                  -- GENERATED --
              */
          