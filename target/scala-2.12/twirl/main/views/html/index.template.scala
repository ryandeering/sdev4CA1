
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[List[models.employees.Employee],List[models.entities.Department],List[models.entities.Project],models.employees.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employees: List[models.employees.Employee], departments: List[models.entities.Department], project: List[models.entities.Project], user: models.employees.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Employees", user)/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
    """),format.raw/*4.5*/("""<p class="lead">Employee List</p>
    <br>
    <div class="row">
        <div class="col-sm-2">
            <h4>Departments</h4>
            <div class="list-group">
                <a href=""""),_display_(/*10.27*/routes/*10.33*/.HomeController.index(0)),format.raw/*10.57*/("""" class="list-group-item">All Departments</a>
                """),_display_(/*11.18*/for(d <- departments) yield /*11.39*/ {_display_(Seq[Any](format.raw/*11.41*/("""
                    """),format.raw/*12.21*/("""<a href=""""),_display_(/*12.31*/routes/*12.37*/.HomeController.index(d.getId)),format.raw/*12.67*/("""" class="list-group-item">"""),_display_(/*12.94*/d/*12.95*/.getName),format.raw/*12.103*/("""
                    """),format.raw/*13.21*/("""<span class="badge">"""),_display_(/*13.42*/d/*13.43*/.getEmployees.size()),format.raw/*13.63*/("""</span>
                    </a>
                """)))}),format.raw/*15.18*/("""
            """),format.raw/*16.13*/("""</div>
        </div>
        <div class="col-sm-7">
            <table class="table table-bordered table-hover table-condensed">
                """),_display_(/*20.18*/if(flash.containsKey("success"))/*20.50*/ {_display_(Seq[Any](format.raw/*20.52*/("""
                    """),format.raw/*21.21*/("""<div class="alert alert-success">
                    """),_display_(/*22.22*/flash/*22.27*/.get("success")),format.raw/*22.42*/("""
                    """),format.raw/*23.21*/("""</div>
                """)))}),format.raw/*24.18*/("""
                """),format.raw/*25.17*/("""<thead>
                    <tr>
                        <th>Image</th>
                        <th>Email</th>
                        <th>Name</th>
                        <th>Address</th>
                        <th>Department</th>
                        """),_display_(/*32.26*/if(user.getRole == "manager")/*32.55*/ {_display_(Seq[Any](format.raw/*32.57*/("""
                            """),format.raw/*33.29*/("""<th colspan="2"> Update/ Delete</th>
                        """)))}),format.raw/*34.26*/("""
                    """),format.raw/*35.21*/("""</tr>
                </thead>

                <tbody>
                """),_display_(/*39.18*/for(e <- employees) yield /*39.37*/ {_display_(Seq[Any](format.raw/*39.39*/("""
                    """),format.raw/*40.21*/("""<tr>
                        """),_display_(/*41.26*/if(env.resource("public/images/employeeImages/thumbnails/" + e.getEmail + ".jpg").isDefined)/*41.118*/ {_display_(Seq[Any](format.raw/*41.120*/("""
                            """),format.raw/*42.29*/("""<td><img src="/assets/images/employeeImages/thumbnails/"""),_display_(/*42.85*/(e.getEmail + ".jpg")),format.raw/*42.106*/(""""/></td>
                        """)))}/*43.27*/else/*43.32*/{_display_(Seq[Any](format.raw/*43.33*/("""
                            """),format.raw/*44.29*/("""<td><img src="/assets/images/employeeImages/thumbnails/noImage.png"></td>
                        """)))}),format.raw/*45.26*/("""
                    """),format.raw/*46.21*/("""<td>"""),_display_(/*46.26*/e/*46.27*/.getEmail),format.raw/*46.36*/("""</td>
                    <td>
                        """),_display_(/*48.26*/if(user.getEmail == e.getEmail)/*48.57*/ {_display_(Seq[Any](format.raw/*48.59*/("""
                            """),format.raw/*49.29*/("""<a href=""""),_display_(/*49.39*/routes/*49.45*/.HomeController.employeeProjects(e.getEmail)),format.raw/*49.89*/("""">"""),_display_(/*49.92*/e/*49.93*/.getName),format.raw/*49.101*/("""</a>
                        """)))}/*50.27*/else if(user.getRole == "manager")/*50.61*/ {_display_(Seq[Any](format.raw/*50.63*/("""
                    """),format.raw/*51.21*/("""<a href=""""),_display_(/*51.31*/routes/*51.37*/.HomeController.employeeProjects(e.getEmail)),format.raw/*51.81*/("""">"""),_display_(/*51.84*/e/*51.85*/.getName),format.raw/*51.93*/("""</a>
                        """)))}/*52.26*/else/*52.31*/{_display_(Seq[Any](format.raw/*52.32*/("""
                        """),_display_(/*53.26*/e/*53.27*/.getName),format.raw/*53.35*/("""
                        """)))}),format.raw/*54.26*/("""
                    """),format.raw/*55.21*/("""</td>
                    <td>"""),_display_(/*56.26*/e/*56.27*/.getAddress.getAddress()),format.raw/*56.51*/("""</td>
                    <td>"""),_display_(/*57.26*/e/*57.27*/.getDepartment.getName),format.raw/*57.49*/("""</td>
                    <td>"""),_display_(/*58.26*/e/*58.27*/.getProjects.size()),format.raw/*58.46*/("""</td>
                        """),_display_(/*59.26*/if(user.getRole == "manager")/*59.55*/ {_display_(Seq[Any](format.raw/*59.57*/("""
                            """),format.raw/*60.29*/("""<td>
                                <a href=""""),_display_(/*61.43*/routes/*61.49*/.HomeController.updateEmployee(e.getEmail)),format.raw/*61.91*/("""" class="button xs btn-danger">
                                    <span class="glyphicon glyphicon-pencil"></span>
                                </a>
                            </td>
                            <td>
                                <a href=""""),_display_(/*66.43*/routes/*66.49*/.HomeController.deleteEmployee(e.getEmail)),format.raw/*66.91*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                                    <span class="glyphicon glyphicon-trash"></span>
                                </a>
                            </td>
                        """)))}),format.raw/*70.26*/("""
                    """),format.raw/*71.21*/("""</tr>
                """)))}),format.raw/*72.18*/("""
                """),format.raw/*73.17*/("""</tbody>
            </table>
            <div>
                <a href=""""),_display_(/*76.27*/routes/*76.33*/.HomeController.addEmployee()),format.raw/*76.62*/("""">
                    <button class="btn btn-primary">Add an employee</button>
                </a>
            </div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(employees:List[models.employees.Employee],departments:List[models.entities.Department],project:List[models.entities.Project],user:models.employees.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(employees,departments,project,user,env)

  def f:((List[models.employees.Employee],List[models.entities.Department],List[models.entities.Project],models.employees.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (employees,departments,project,user,env) => apply(employees,departments,project,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 09 20:31:01 GMT 2019
                  SOURCE: /home/ryan/Documents/sdev4CA1/app/views/index.scala.html
                  HASH: bb473a1a2810443500e2696d4521f7d3b28af6db
                  MATRIX: 1079->1|1360->189|1387->191|1418->214|1457->216|1488->221|1707->413|1722->419|1767->443|1857->506|1894->527|1934->529|1983->550|2020->560|2035->566|2086->596|2140->623|2150->624|2180->632|2229->653|2277->674|2287->675|2328->695|2409->745|2450->758|2624->905|2665->937|2705->939|2754->960|2836->1015|2850->1020|2886->1035|2935->1056|2990->1080|3035->1097|3321->1356|3359->1385|3399->1387|3456->1416|3549->1478|3598->1499|3698->1572|3733->1591|3773->1593|3822->1614|3879->1644|3981->1736|4022->1738|4079->1767|4162->1823|4205->1844|4258->1879|4271->1884|4310->1885|4367->1914|4497->2013|4546->2034|4578->2039|4588->2040|4618->2049|4701->2105|4741->2136|4781->2138|4838->2167|4875->2177|4890->2183|4955->2227|4985->2230|4995->2231|5025->2239|5074->2270|5117->2304|5157->2306|5206->2327|5243->2337|5258->2343|5323->2387|5353->2390|5363->2391|5392->2399|5441->2429|5454->2434|5493->2435|5546->2461|5556->2462|5585->2470|5642->2496|5691->2517|5749->2548|5759->2549|5804->2573|5862->2604|5872->2605|5915->2627|5973->2658|5983->2659|6023->2678|6081->2709|6119->2738|6159->2740|6216->2769|6290->2816|6305->2822|6368->2864|6658->3127|6673->3133|6736->3175|7010->3418|7059->3439|7113->3462|7158->3479|7259->3553|7274->3559|7324->3588
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|46->15|47->16|51->20|51->20|51->20|52->21|53->22|53->22|53->22|54->23|55->24|56->25|63->32|63->32|63->32|64->33|65->34|66->35|70->39|70->39|70->39|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|75->44|76->45|77->46|77->46|77->46|77->46|79->48|79->48|79->48|80->49|80->49|80->49|80->49|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|82->51|82->51|82->51|82->51|82->51|83->52|83->52|83->52|84->53|84->53|84->53|85->54|86->55|87->56|87->56|87->56|88->57|88->57|88->57|89->58|89->58|89->58|90->59|90->59|90->59|91->60|92->61|92->61|92->61|97->66|97->66|97->66|101->70|102->71|103->72|104->73|107->76|107->76|107->76
                  -- GENERATED --
              */
          