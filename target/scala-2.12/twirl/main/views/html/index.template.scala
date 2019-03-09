
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

                        """),_display_(/*33.26*/if(user.getRole == "manager")/*33.55*/ {_display_(Seq[Any](format.raw/*33.57*/("""
                            """),format.raw/*34.29*/("""<th colspan="2"> Update/ Delete</th>
                        """)))}),format.raw/*35.26*/("""
                    """),format.raw/*36.21*/("""</tr>
                </thead>

                <tbody>
                """),_display_(/*40.18*/for(e <- employees) yield /*40.37*/ {_display_(Seq[Any](format.raw/*40.39*/("""
                    """),format.raw/*41.21*/("""<tr>
                        """),_display_(/*42.26*/if(env.resource("public/images/employeeImages/thumbnails/" + e.getEmail + ".jpg").isDefined)/*42.118*/ {_display_(Seq[Any](format.raw/*42.120*/("""
                            """),format.raw/*43.29*/("""<td><img src="/assets/images/employeeImages/thumbnails/"""),_display_(/*43.85*/(e.getEmail + ".jpg")),format.raw/*43.106*/(""""/></td>
                        """)))}/*44.27*/else/*44.32*/{_display_(Seq[Any](format.raw/*44.33*/("""
                            """),format.raw/*45.29*/("""<td><img src="/assets/images/employeeImages/thumbnails/noImage.png"></td>
                        """)))}),format.raw/*46.26*/("""
                    """),format.raw/*47.21*/("""<td>"""),_display_(/*47.26*/e/*47.27*/.getEmail),format.raw/*47.36*/("""</td>
                    <td>
                        """),_display_(/*49.26*/if(user.getEmail == e.getEmail)/*49.57*/ {_display_(Seq[Any](format.raw/*49.59*/("""
                            """),format.raw/*50.29*/("""<a href=""""),_display_(/*50.39*/routes/*50.45*/.HomeController.employeeProjects(e.getEmail)),format.raw/*50.89*/("""">"""),_display_(/*50.92*/e/*50.93*/.getName),format.raw/*50.101*/("""</a>
                        """)))}/*51.27*/else if(user.getRole == "manager")/*51.61*/ {_display_(Seq[Any](format.raw/*51.63*/("""
                    """),format.raw/*52.21*/("""<a href=""""),_display_(/*52.31*/routes/*52.37*/.HomeController.employeeProjects(e.getEmail)),format.raw/*52.81*/("""">"""),_display_(/*52.84*/e/*52.85*/.getName),format.raw/*52.93*/("""</a>
                        """)))}/*53.26*/else/*53.31*/{_display_(Seq[Any](format.raw/*53.32*/("""
                        """),_display_(/*54.26*/e/*54.27*/.getName),format.raw/*54.35*/("""
                        """)))}),format.raw/*55.26*/("""
                    """),format.raw/*56.21*/("""</td>
                    <td>"""),_display_(/*57.26*/e/*57.27*/.getAddress.getAddress()),format.raw/*57.51*/("""</td>
                    <td>"""),_display_(/*58.26*/e/*58.27*/.getDepartment.getName()),format.raw/*58.51*/("""</td>

                        """),_display_(/*60.26*/if(user.getRole == "manager")/*60.55*/ {_display_(Seq[Any](format.raw/*60.57*/("""
                            """),format.raw/*61.29*/("""<td>
                                <a href=""""),_display_(/*62.43*/routes/*62.49*/.HomeController.updateEmployee(e.getEmail)),format.raw/*62.91*/("""" class="button xs btn-danger">
                                    <span class="glyphicon glyphicon-pencil"></span>
                                </a>
                            </td>
                            <td>
                                <a href=""""),_display_(/*67.43*/routes/*67.49*/.HomeController.deleteEmployee(e.getEmail)),format.raw/*67.91*/("""" class="button xs btn-danger">
                                    <span class="glyphicon glyphicon-trash"></span>
                                </a>
                            </td>
                        """)))}),format.raw/*71.26*/("""
                    """),format.raw/*72.21*/("""</tr>
                """)))}),format.raw/*73.18*/("""
                """),format.raw/*74.17*/("""</tbody>
            </table>
            <div>
                <a href=""""),_display_(/*77.27*/routes/*77.33*/.HomeController.addEmployee()),format.raw/*77.62*/("""">
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
                  DATE: Sat Mar 09 20:55:26 GMT 2019
                  SOURCE: /home/ryan/Documents/sdev4CA1/app/views/index.scala.html
                  HASH: 39f03a88fe3da3518290d694dece5e0237f491ac
                  MATRIX: 1079->1|1360->189|1387->191|1418->214|1457->216|1488->221|1707->413|1722->419|1767->443|1857->506|1894->527|1934->529|1983->550|2020->560|2035->566|2086->596|2140->623|2150->624|2180->632|2229->653|2277->674|2287->675|2328->695|2409->745|2450->758|2624->905|2665->937|2705->939|2754->960|2836->1015|2850->1020|2886->1035|2935->1056|2990->1080|3035->1097|3322->1357|3360->1386|3400->1388|3457->1417|3550->1479|3599->1500|3699->1573|3734->1592|3774->1594|3823->1615|3880->1645|3982->1737|4023->1739|4080->1768|4163->1824|4206->1845|4259->1880|4272->1885|4311->1886|4368->1915|4498->2014|4547->2035|4579->2040|4589->2041|4619->2050|4702->2106|4742->2137|4782->2139|4839->2168|4876->2178|4891->2184|4956->2228|4986->2231|4996->2232|5026->2240|5075->2271|5118->2305|5158->2307|5207->2328|5244->2338|5259->2344|5324->2388|5354->2391|5364->2392|5393->2400|5442->2430|5455->2435|5494->2436|5547->2462|5557->2463|5586->2471|5643->2497|5692->2518|5750->2549|5760->2550|5805->2574|5863->2605|5873->2606|5918->2630|5977->2662|6015->2691|6055->2693|6112->2722|6186->2769|6201->2775|6264->2817|6554->3080|6569->3086|6632->3128|6875->3340|6924->3361|6978->3384|7023->3401|7124->3475|7139->3481|7189->3510
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|46->15|47->16|51->20|51->20|51->20|52->21|53->22|53->22|53->22|54->23|55->24|56->25|64->33|64->33|64->33|65->34|66->35|67->36|71->40|71->40|71->40|72->41|73->42|73->42|73->42|74->43|74->43|74->43|75->44|75->44|75->44|76->45|77->46|78->47|78->47|78->47|78->47|80->49|80->49|80->49|81->50|81->50|81->50|81->50|81->50|81->50|81->50|82->51|82->51|82->51|83->52|83->52|83->52|83->52|83->52|83->52|83->52|84->53|84->53|84->53|85->54|85->54|85->54|86->55|87->56|88->57|88->57|88->57|89->58|89->58|89->58|91->60|91->60|91->60|92->61|93->62|93->62|93->62|98->67|98->67|98->67|102->71|103->72|104->73|105->74|108->77|108->77|108->77
                  -- GENERATED --
              */
          