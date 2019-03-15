
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

object employeeProjects extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.entities.Project],models.employees.Employee,models.employees.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projects: List[models.entities.Project], employee: models.employees.Employee, user: models.employees.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Employee Projects", user)/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""
    """),format.raw/*4.5*/("""<p class="lead">Projects for """),_display_(/*4.35*/employee/*4.43*/.getName),format.raw/*4.51*/("""</p>

    <div class="col-sm-3">
        <table class="table table-bordered table-hover table-condensed">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Name</th>

                </tr>
            </thead>

            <tbody>
            """),_display_(/*17.14*/for(p <- projects) yield /*17.32*/ {_display_(Seq[Any](format.raw/*17.34*/("""
                """),format.raw/*18.17*/("""<tr>
                    <td>"""),_display_(/*19.26*/p/*19.27*/.getId),format.raw/*19.33*/("""</td>
                    <td>"""),_display_(/*20.26*/p/*20.27*/.getPname),format.raw/*20.36*/("""</td>

                </tr>
            """)))}),format.raw/*23.14*/("""
            """),format.raw/*24.13*/("""</tbody>
        </table>
    </div>
""")))}))
      }
    }
  }

  def render(projects:List[models.entities.Project],employee:models.employees.Employee,user:models.employees.User): play.twirl.api.HtmlFormat.Appendable = apply(projects,employee,user)

  def f:((List[models.entities.Project],models.employees.Employee,models.employees.User) => play.twirl.api.HtmlFormat.Appendable) = (projects,employee,user) => apply(projects,employee,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 15 12:24:44 GMT 2019
                  SOURCE: /home/ryan/Documents/a/sdev4CA1/app/views/employeeProjects.scala.html
                  HASH: 9da5a545ee7704b196fcd6f95d5ce5e3ca8822bf
                  MATRIX: 1030->1|1231->109|1258->111|1297->142|1336->144|1367->149|1423->179|1439->187|1467->195|1785->486|1819->504|1859->506|1904->523|1961->553|1971->554|1998->560|2056->591|2066->592|2096->601|2169->643|2210->656
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|35->4|35->4|35->4|48->17|48->17|48->17|49->18|50->19|50->19|50->19|51->20|51->20|51->20|54->23|55->24
                  -- GENERATED --
              */
          