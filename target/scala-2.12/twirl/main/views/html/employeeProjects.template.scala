
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

object employeeProjects extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.entities.Project],models.employees.Employee,models.employees.Employee,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projects: List[models.entities.Project], employee: models.employees.Employee, user: models.employees.Employee):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Employee Projects", user)/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""
    """),format.raw/*4.5*/("""<p class="lead">Projects for """),_display_(/*4.35*/employee/*4.43*/.getName),format.raw/*4.51*/("""</p>

    <div class="col-sm-3">
        <table class="table table-bordered table-hover table-condensed">
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Description</th>
                </tr>
            </thead>

            <tbody>
            """),_display_(/*16.14*/for(p <- projects) yield /*16.32*/ {_display_(Seq[Any](format.raw/*16.34*/("""
                """),format.raw/*17.17*/("""<tr>
                    <td>"""),_display_(/*18.26*/p/*18.27*/.getPname),format.raw/*18.36*/("""</td>

                </tr>
            """)))}),format.raw/*21.14*/("""
            """),format.raw/*22.13*/("""</tbody>
        </table>
    </div>
""")))}))
      }
    }
  }

  def render(projects:List[models.entities.Project],employee:models.employees.Employee,user:models.employees.Employee): play.twirl.api.HtmlFormat.Appendable = apply(projects,employee,user)

  def f:((List[models.entities.Project],models.employees.Employee,models.employees.Employee) => play.twirl.api.HtmlFormat.Appendable) = (projects,employee,user) => apply(projects,employee,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 09 20:31:01 GMT 2019
                  SOURCE: /home/ryan/Documents/sdev4CA1/app/views/employeeProjects.scala.html
                  HASH: 157fb20f0f65475bf28977dfb119181f3b2fe306
                  MATRIX: 1034->1|1239->113|1266->115|1305->146|1344->148|1375->153|1431->183|1447->191|1475->199|1801->498|1835->516|1875->518|1920->535|1977->565|1987->566|2017->575|2090->617|2131->630
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|35->4|35->4|35->4|47->16|47->16|47->16|48->17|49->18|49->18|49->18|52->21|53->22
                  -- GENERATED --
              */
          