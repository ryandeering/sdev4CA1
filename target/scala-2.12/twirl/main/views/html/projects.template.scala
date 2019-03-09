
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

object projects extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.entities.Project],models.employees.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projects: List[models.entities.Project], user: models.employees.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
    """),_display_(/*3.6*/main("Projects", user)/*3.28*/ {_display_(Seq[Any](format.raw/*3.30*/("""
        """),format.raw/*4.9*/("""<p class="lead">Projects</p>
        <br>
        """),_display_(/*6.10*/if(flash.containsKey("success"))/*6.42*/ {_display_(Seq[Any](format.raw/*6.44*/("""
            """),format.raw/*7.13*/("""<div class="alert alert-success">
            """),_display_(/*8.14*/flash/*8.19*/.get("success")),format.raw/*8.34*/("""
            """),format.raw/*9.13*/("""</div>
        """)))}),format.raw/*10.10*/("""

        """),format.raw/*12.9*/("""<div class="col-sm-4">
            <table class="table table-bordered table condensed">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Description</th>
                        <th>Due Date</th>
                        <th colspan="2">Update/Delete</th>
                    </tr>
                </thead>

                <tbody>
                """),_display_(/*25.18*/for(p <- projects) yield /*25.36*/ {_display_(Seq[Any](format.raw/*25.38*/("""
                    """),format.raw/*26.21*/("""<tr>
                        <td class="numeric">"""),_display_(/*27.46*/p/*27.47*/.getId),format.raw/*27.53*/("""</td>
                        <td>"""),_display_(/*28.30*/p/*28.31*/.getPname),format.raw/*28.40*/("""</td>

                        <td>
                            <a href=""""),_display_(/*31.39*/routes/*31.45*/.HomeController.updateProject(p.getId)),format.raw/*31.83*/("""" class="button xs btn-danger">
                                <span class="glyphicon glyphicon-pencil"></span>
                            </a>
                        </td>
                        <td>
                            <a href=""""),_display_(/*36.39*/routes/*36.45*/.HomeController.deleteProject(p.getId)),format.raw/*36.83*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                                <span class="glyphicon glyphicon-trash"></span>
                            </a>
                        </td>
                    </tr>
                """)))}),format.raw/*41.18*/("""
                """),format.raw/*42.17*/("""</tbody>
            </table>
            <a href=""""),_display_(/*44.23*/routes/*44.29*/.HomeController.addProject()),format.raw/*44.57*/("""">
                <button class="btn btn-primary">Add a project</button>
            </a>
        </div>
    """)))}))
      }
    }
  }

  def render(projects:List[models.entities.Project],user:models.employees.User): play.twirl.api.HtmlFormat.Appendable = apply(projects,user)

  def f:((List[models.entities.Project],models.employees.User) => play.twirl.api.HtmlFormat.Appendable) = (projects,user) => apply(projects,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 09 20:31:01 GMT 2019
                  SOURCE: /home/ryan/Documents/sdev4CA1/app/views/projects.scala.html
                  HASH: 55ebd4ee73176b8b50cd4515c6f37a2b571d707a
                  MATRIX: 996->1|1160->72|1191->78|1221->100|1260->102|1295->111|1372->162|1412->194|1451->196|1491->209|1564->256|1577->261|1612->276|1652->289|1699->305|1736->315|2213->765|2247->783|2287->785|2336->806|2413->856|2423->857|2450->863|2512->898|2522->899|2552->908|2653->982|2668->988|2727->1026|2997->1269|3012->1275|3071->1313|3351->1562|3396->1579|3475->1631|3490->1637|3539->1665
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|41->10|43->12|56->25|56->25|56->25|57->26|58->27|58->27|58->27|59->28|59->28|59->28|62->31|62->31|62->31|67->36|67->36|67->36|72->41|73->42|75->44|75->44|75->44
                  -- GENERATED --
              */
          