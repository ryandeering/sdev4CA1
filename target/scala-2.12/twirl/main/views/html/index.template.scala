
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
                        """),format.raw/*13.25*/("""&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <span class="badge">"""),_display_(/*14.42*/d/*14.43*/.getEmployees.size()),format.raw/*14.63*/("""</span>
                    </a>
                """)))}),format.raw/*16.18*/("""
            """),format.raw/*17.13*/("""</div>
        </div>
        <div class="col-sm-7">
            <table class="table table-bordered table-hover table-condensed">
                """),_display_(/*21.18*/if(flash.containsKey("success"))/*21.50*/ {_display_(Seq[Any](format.raw/*21.52*/("""
                    """),format.raw/*22.21*/("""<div class="alert alert-success">
                    """),_display_(/*23.22*/flash/*23.27*/.get("success")),format.raw/*23.42*/("""
                    """),format.raw/*24.21*/("""</div>
                """)))}),format.raw/*25.18*/("""
                """),format.raw/*26.17*/("""<thead>
                    <tr>
                        <th>Image</th>
                        """),_display_(/*29.26*/if(user.getRole == "manager")/*29.55*/ {_display_(Seq[Any](format.raw/*29.57*/("""
                            """),format.raw/*30.29*/("""<th>Email</th>
                        """)))}),format.raw/*31.26*/("""
                        """),format.raw/*32.25*/("""<th>Name</th>
                        """),_display_(/*33.26*/if(user.getRole == "manager")/*33.55*/ {_display_(Seq[Any](format.raw/*33.57*/("""
                            """),format.raw/*34.29*/("""<th>Address</th>
                        """)))}),format.raw/*35.26*/("""
                        """),format.raw/*36.25*/("""<th>Department</th>
                        """),_display_(/*37.26*/if(user.getRole == "manager")/*37.55*/ {_display_(Seq[Any](format.raw/*37.57*/("""
                            """),format.raw/*38.29*/("""<th colspan="2"> Update/ Delete</th>
                        """)))}),format.raw/*39.26*/("""
                    """),format.raw/*40.21*/("""</tr>
                </thead>

                <tbody>
                """),_display_(/*44.18*/for(e <- employees) yield /*44.37*/ {_display_(Seq[Any](format.raw/*44.39*/("""
                    """),format.raw/*45.21*/("""<tr>
                        """),_display_(/*46.26*/if(env.resource("public/images/employeeImages/thumbnails/" + e.getEmail + ".jpg").isDefined)/*46.118*/ {_display_(Seq[Any](format.raw/*46.120*/("""
                            """),format.raw/*47.29*/("""<td><img src="/assets/images/employeeImages/thumbnails/"""),_display_(/*47.85*/(e.getEmail + ".jpg")),format.raw/*47.106*/(""""/></td>
                        """)))}/*48.27*/else/*48.32*/{_display_(Seq[Any](format.raw/*48.33*/("""
                            """),format.raw/*49.29*/("""<td><img src="/assets/images/employeeImages/thumbnails/noImage.png"></td>
                        """)))}),format.raw/*50.26*/("""
                        """),_display_(/*51.26*/if(user.getRole == "manager")/*51.55*/ {_display_(Seq[Any](format.raw/*51.57*/("""
                            """),format.raw/*52.29*/("""<td>"""),_display_(/*52.34*/e/*52.35*/.getEmail),format.raw/*52.44*/("""</td>
                        """)))}),format.raw/*53.26*/("""

                    """),format.raw/*55.21*/("""<td>
                        """),_display_(/*56.26*/if(user.getEmail == e.getEmail)/*56.57*/ {_display_(Seq[Any](format.raw/*56.59*/("""
                            """),format.raw/*57.29*/("""<a href=""""),_display_(/*57.39*/routes/*57.45*/.HomeController.employeeProjects(e.getEmail)),format.raw/*57.89*/("""">"""),_display_(/*57.92*/e/*57.93*/.getName),format.raw/*57.101*/("""</a>
                        """)))}/*58.27*/else if(user.getRole == "manager")/*58.61*/ {_display_(Seq[Any](format.raw/*58.63*/("""
                    """),format.raw/*59.21*/("""<a href=""""),_display_(/*59.31*/routes/*59.37*/.HomeController.employeeProjects(e.getEmail)),format.raw/*59.81*/("""">"""),_display_(/*59.84*/e/*59.85*/.getName),format.raw/*59.93*/("""</a>
                        """)))}/*60.26*/else/*60.31*/{_display_(Seq[Any](format.raw/*60.32*/("""
                        """),_display_(/*61.26*/e/*61.27*/.getName),format.raw/*61.35*/("""
                        """)))}),format.raw/*62.26*/("""
                    """),format.raw/*63.21*/("""</td>
                        """),_display_(/*64.26*/if(user.getRole == "manager")/*64.55*/ {_display_(Seq[Any](format.raw/*64.57*/("""
                            """),format.raw/*65.29*/("""<td>"""),_display_(/*65.34*/e/*65.35*/.getAddress.getAddress()),format.raw/*65.59*/("""</td>
                        """)))}),format.raw/*66.26*/("""

                    """),format.raw/*68.21*/("""<td>"""),_display_(/*68.26*/e/*68.27*/.getDepartment.getName()),format.raw/*68.51*/("""</td>

                        """),_display_(/*70.26*/if(user.getRole == "manager")/*70.55*/ {_display_(Seq[Any](format.raw/*70.57*/("""
                            """),format.raw/*71.29*/("""<td>
                                <a href=""""),_display_(/*72.43*/routes/*72.49*/.HomeController.updateEmployee(e.getEmail)),format.raw/*72.91*/("""" class="button xs btn-danger">
                                    <span class="glyphicon glyphicon-pencil"></span>
                                </a>
                            </td>
                            <td>
                                <a href=""""),_display_(/*77.43*/routes/*77.49*/.HomeController.deleteEmployee(e.getEmail)),format.raw/*77.91*/("""" class="button xs btn-danger">
                                    <span class="glyphicon glyphicon-trash"></span>
                                </a>
                            </td>
                        """)))}),format.raw/*81.26*/("""
                    """),format.raw/*82.21*/("""</tr>
                """)))}),format.raw/*83.18*/("""
                """),format.raw/*84.17*/("""</tbody>
            </table>
            <div>
                """),_display_(/*87.18*/if(user.getRole == "manager")/*87.47*/ {_display_(Seq[Any](format.raw/*87.49*/("""
                    """),format.raw/*88.21*/("""<a href=""""),_display_(/*88.31*/routes/*88.37*/.HomeController.addEmployee()),format.raw/*88.66*/("""">
                        <button class="btn btn-primary">Add an employee</button>
                    </a>
                """)))}),format.raw/*91.18*/("""
            """),format.raw/*92.13*/("""</div>
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
                  DATE: Sat Mar 16 15:15:36 GMT 2019
                  SOURCE: /home/ryan/Documents/a/sdev4CA1/app/views/index.scala.html
                  HASH: 042cabb491490ab45885e4bc4aafb702629896a9
                  MATRIX: 1079->1|1360->189|1387->191|1418->214|1457->216|1488->221|1707->413|1722->419|1767->443|1857->506|1894->527|1934->529|1983->550|2020->560|2035->566|2086->596|2140->623|2150->624|2180->632|2233->657|2374->771|2384->772|2425->792|2506->842|2547->855|2721->1002|2762->1034|2802->1036|2851->1057|2933->1112|2947->1117|2983->1132|3032->1153|3087->1177|3132->1194|3256->1291|3294->1320|3334->1322|3391->1351|3462->1391|3515->1416|3581->1455|3619->1484|3659->1486|3716->1515|3789->1557|3842->1582|3914->1627|3952->1656|3992->1658|4049->1687|4142->1749|4191->1770|4291->1843|4326->1862|4366->1864|4415->1885|4472->1915|4574->2007|4615->2009|4672->2038|4755->2094|4798->2115|4851->2150|4864->2155|4903->2156|4960->2185|5090->2284|5143->2310|5181->2339|5221->2341|5278->2370|5310->2375|5320->2376|5350->2385|5412->2416|5462->2438|5519->2468|5559->2499|5599->2501|5656->2530|5693->2540|5708->2546|5773->2590|5803->2593|5813->2594|5843->2602|5892->2633|5935->2667|5975->2669|6024->2690|6061->2700|6076->2706|6141->2750|6171->2753|6181->2754|6210->2762|6259->2792|6272->2797|6311->2798|6364->2824|6374->2825|6403->2833|6460->2859|6509->2880|6567->2911|6605->2940|6645->2942|6702->2971|6734->2976|6744->2977|6789->3001|6851->3032|6901->3054|6933->3059|6943->3060|6988->3084|7047->3116|7085->3145|7125->3147|7182->3176|7256->3223|7271->3229|7334->3271|7624->3534|7639->3540|7702->3582|7945->3794|7994->3815|8048->3838|8093->3855|8185->3920|8223->3949|8263->3951|8312->3972|8349->3982|8364->3988|8414->4017|8571->4143|8612->4156
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|43->12|44->13|45->14|45->14|45->14|47->16|48->17|52->21|52->21|52->21|53->22|54->23|54->23|54->23|55->24|56->25|57->26|60->29|60->29|60->29|61->30|62->31|63->32|64->33|64->33|64->33|65->34|66->35|67->36|68->37|68->37|68->37|69->38|70->39|71->40|75->44|75->44|75->44|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|80->49|81->50|82->51|82->51|82->51|83->52|83->52|83->52|83->52|84->53|86->55|87->56|87->56|87->56|88->57|88->57|88->57|88->57|88->57|88->57|88->57|89->58|89->58|89->58|90->59|90->59|90->59|90->59|90->59|90->59|90->59|91->60|91->60|91->60|92->61|92->61|92->61|93->62|94->63|95->64|95->64|95->64|96->65|96->65|96->65|96->65|97->66|99->68|99->68|99->68|99->68|101->70|101->70|101->70|102->71|103->72|103->72|103->72|108->77|108->77|108->77|112->81|113->82|114->83|115->84|118->87|118->87|118->87|119->88|119->88|119->88|119->88|122->91|123->92
                  -- GENERATED --
              */
          