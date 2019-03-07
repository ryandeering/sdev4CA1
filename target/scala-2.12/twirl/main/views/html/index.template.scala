
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
  def apply/*1.2*/(employee: List[models.employees.Employee],department: List[models.entities.Department],project: List[models.entities.Project], user: models.employees.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""    """),_display_(/*2.6*/main("Employee", user)/*2.28*/ {_display_(Seq[Any](format.raw/*2.30*/("""
        """),format.raw/*3.9*/("""<p class="lead">Employee List</p>
        <div class="row">
            <div class="col-sm-2">
                <h4>Categories</h4>
                <div class="list-group">

                    <a href=""""),_display_(/*9.31*/routes/*9.37*/.HomeController.index()),format.raw/*9.60*/("""" class="list-group-item">All categories</a>
                    """),_display_(/*10.22*/for(d <- department) yield /*10.42*/ {_display_(Seq[Any](format.raw/*10.44*/("""
                        """),format.raw/*11.25*/("""<a href=""""),_display_(/*11.35*/routes/*11.41*/.HomeController.index(d.getId)),format.raw/*11.71*/("""" class="list-group-item">"""),_display_(/*11.98*/d/*11.99*/.getName),format.raw/*11.107*/("""
                        """),format.raw/*12.25*/("""<span class="badge">"""),_display_(/*12.46*/d/*12.47*/.getEmployees.size()),format.raw/*12.67*/("""</span>
                        </a>
                    """)))}),format.raw/*14.22*/("""



                """),format.raw/*18.17*/("""</div>
            </div>
        </div>
        <div class="col-sm-10">


            """),_display_(/*24.14*/if(flash.containsKey("success"))/*24.46*/{_display_(Seq[Any](format.raw/*24.47*/("""

                """),format.raw/*26.17*/("""<div class="alert alert-success">
                """),_display_(/*27.18*/flash/*27.23*/.get("success")),format.raw/*27.38*/("""
                """),format.raw/*28.17*/("""</div>
            """)))}),format.raw/*29.14*/("""
            """),format.raw/*30.13*/("""<table class="table table-bordered table-hover table-condensed">

                <thead>

                        <!-- The header row-->

                    <tr>

                        <th>Image</th>

                        <th>ID</th>

                        <th>Name</th>

                        <th>Address</th>

                        <th>Department</th>

                        <th>Project</th>


                        <th>Delete</th>

                        <th>Update</th>


                    </tr>

                </thead>

                <tbody>

                    <tr>





                            """),_display_(/*68.30*/for(e<-employee) yield /*68.46*/ {_display_(Seq[Any](format.raw/*68.48*/("""


                                    """),format.raw/*71.37*/("""<!--   /*  """),_display_(/*71.49*/if(env.resource("public/images/Images/" + e.getEmail + ".jpg").isDefined)/*71.122*/ {_display_(Seq[Any](format.raw/*71.124*/("""
                                    """),format.raw/*72.37*/("""<td><img src="/assets/images/Images/"""),_display_(/*72.74*/(e.getEmail + ".jpg")),format.raw/*72.95*/(""""/></td>
                                """)))}/*73.35*/else/*73.40*/{_display_(Seq[Any](format.raw/*73.41*/("""
                                    """),format.raw/*74.37*/("""<td><img src="/assets/images/Images/noImage.jpg"/></td>
                                """)))}),format.raw/*75.34*/(""" """),format.raw/*75.35*/("""*/-->


                    <td>"""),_display_(/*78.26*/e/*78.27*/.getEmail),format.raw/*78.36*/("""</td>

                    <td> """),_display_(/*80.27*/e/*80.28*/.getName),format.raw/*80.36*/("""</td>

                    <td>"""),_display_(/*82.26*/e/*82.27*/.getAddress.getAddress),format.raw/*82.49*/("""</td>

                    <td>"""),_display_(/*84.26*/e/*84.27*/.getDepartment.getName),format.raw/*84.49*/("""</td>



                    <td>
                             <a href=""""),_display_(/*89.40*/routes/*89.46*/.HomeController.addEmployee()),format.raw/*89.75*/("""" class="button-xs btn-danger">
                            <button class="btn btn-primary">Delete an Employee</button>
                        </a>

                    </td>
                    <td>
                        <a href=""""),_display_(/*95.35*/routes/*95.41*/.HomeController.addEmployee()),format.raw/*95.70*/("""" class="button-xs btn-danger">
                            <button class="btn btn-primary">Update an Employee</button>
                        </a>
                    </td>

                    </tr>
                </tbody>

                """)))}),format.raw/*103.18*/("""


            """),format.raw/*106.13*/("""</table>
            <p>
                <a href=""""),_display_(/*108.27*/routes/*108.33*/.HomeController.addEmployee()),format.raw/*108.62*/("""">
                    <button class="btn btn-primary">Add an Employee</button>
                </a>
            </p>


        </div>

    """)))}),format.raw/*116.6*/("""

"""))
      }
    }
  }

  def render(employee:List[models.employees.Employee],department:List[models.entities.Department],project:List[models.entities.Project],user:models.employees.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(employee,department,project,user,env)

  def f:((List[models.employees.Employee],List[models.entities.Department],List[models.entities.Project],models.employees.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (employee,department,project,user,env) => apply(employee,department,project,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 07 21:15:05 GMT 2019
                  SOURCE: /home/ryan/Documents/sdev4CA1/app/views/index.scala.html
                  HASH: f2a7e602c19cb1ff9a9d0591a41f726b7f5ede37
                  MATRIX: 1079->1|1356->185|1386->190|1416->212|1455->214|1490->223|1719->426|1733->432|1776->455|1869->521|1905->541|1945->543|1998->568|2035->578|2050->584|2101->614|2155->641|2165->642|2195->650|2248->675|2296->696|2306->697|2347->717|2436->775|2484->795|2599->883|2640->915|2679->916|2725->934|2803->985|2817->990|2853->1005|2898->1022|2949->1042|2990->1055|3648->1686|3680->1702|3720->1704|3787->1743|3826->1755|3909->1828|3950->1830|4015->1867|4079->1904|4121->1925|4182->1968|4195->1973|4234->1974|4299->2011|4419->2100|4448->2101|4508->2134|4518->2135|4548->2144|4608->2177|4618->2178|4647->2186|4706->2218|4716->2219|4759->2241|4818->2273|4828->2274|4871->2296|4971->2369|4986->2375|5036->2404|5298->2639|5313->2645|5363->2674|5640->2919|5684->2934|5763->2985|5779->2991|5830->3020|6002->3161
                  LINES: 28->1|33->2|33->2|33->2|33->2|34->3|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|45->14|49->18|55->24|55->24|55->24|57->26|58->27|58->27|58->27|59->28|60->29|61->30|99->68|99->68|99->68|102->71|102->71|102->71|102->71|103->72|103->72|103->72|104->73|104->73|104->73|105->74|106->75|106->75|109->78|109->78|109->78|111->80|111->80|111->80|113->82|113->82|113->82|115->84|115->84|115->84|120->89|120->89|120->89|126->95|126->95|126->95|134->103|137->106|139->108|139->108|139->108|147->116
                  -- GENERATED --
              */
          