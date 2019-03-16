
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
                        <th colspan="2">Update/Delete</th>
                    </tr>
                </thead>

                <tbody>
                """),_display_(/*23.18*/for(p <- projects) yield /*23.36*/ {_display_(Seq[Any](format.raw/*23.38*/("""
                    """),format.raw/*24.21*/("""<tr>
                        <td class="numeric">"""),_display_(/*25.46*/p/*25.47*/.getId),format.raw/*25.53*/("""</td>
                        <td>"""),_display_(/*26.30*/p/*26.31*/.getPname),format.raw/*26.40*/("""</td>

                        <td>
                            <a href=""""),_display_(/*29.39*/routes/*29.45*/.HomeController.updateProject(p.getId)),format.raw/*29.83*/("""" class="button xs btn-danger">
                                <span class="glyphicon glyphicon-pencil"></span>
                            </a>
                        </td>
                        <td>
                            <a href=""""),_display_(/*34.39*/routes/*34.45*/.HomeController.deleteProject(p.getId)),format.raw/*34.83*/("""" class="button xs btn-danger">
                                <span class="glyphicon glyphicon-trash"></span>
                            </a>
                        </td>
                    </tr>
                """)))}),format.raw/*39.18*/("""
                """),format.raw/*40.17*/("""</tbody>
            </table>
            <a href=""""),_display_(/*42.23*/routes/*42.29*/.HomeController.addProject()),format.raw/*42.57*/("""">
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
                  DATE: Sat Mar 16 14:50:05 GMT 2019
                  SOURCE: /home/ryan/Documents/a/sdev4CA1/app/views/projects.scala.html
                  HASH: 9611096d0e9de5b672ec92e4d06c50ad21ed7456
                  MATRIX: 996->1|1160->72|1191->78|1221->100|1260->102|1295->111|1372->162|1412->194|1451->196|1491->209|1564->256|1577->261|1612->276|1652->289|1699->305|1736->315|2126->678|2160->696|2200->698|2249->719|2326->769|2336->770|2363->776|2425->811|2435->812|2465->821|2566->895|2581->901|2640->939|2910->1182|2925->1188|2984->1226|3233->1444|3278->1461|3357->1513|3372->1519|3421->1547
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|41->10|43->12|54->23|54->23|54->23|55->24|56->25|56->25|56->25|57->26|57->26|57->26|60->29|60->29|60->29|65->34|65->34|65->34|70->39|71->40|73->42|73->42|73->42
                  -- GENERATED --
              */
          