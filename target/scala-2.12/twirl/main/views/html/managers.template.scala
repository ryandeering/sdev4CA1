
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

object managers extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.employees.Manager],models.employees.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employees: List[models.employees.Manager] ,user: models.employees.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Employees",user)/*2.24*/{_display_(Seq[Any](format.raw/*2.25*/("""
    """),format.raw/*3.5*/("""<h1>Current customers</h1>


    """),format.raw/*6.71*/("""
    """),_display_(/*7.6*/if(flash.containsKey("success"))/*7.38*/ {_display_(Seq[Any](format.raw/*7.40*/("""
        """),format.raw/*8.9*/("""<div class="alert alert-success">
        """),_display_(/*9.10*/flash/*9.15*/.get("success")),format.raw/*9.30*/("""
        """),format.raw/*10.9*/("""</div>
    """)))}),format.raw/*11.6*/("""

    """),format.raw/*13.5*/("""<div class="col-sm-9">
        <h4>Employees.</h4>
        <table class="table table-bordered table-hover table-condensed">
            <thead>
                    <!-- The header row-->
                <tr>
                    <th>Email</th>
                    <th>Role </th>
                    <th>Name </th>


                </tr>
            </thead>
            <tbody>
                    <!-- Product row(s) -->

                """),format.raw/*29.66*/("""
                """),_display_(/*30.18*/for(e<-employees) yield /*30.35*/ {_display_(Seq[Any](format.raw/*30.37*/("""
                    """),format.raw/*31.21*/("""<tr>
                        <td>"""),_display_(/*32.30*/e/*32.31*/.getEmail),format.raw/*32.40*/("""</td>
                        <td>"""),_display_(/*33.30*/e/*33.31*/.getRole),format.raw/*33.39*/("""</td>
                        <td>"""),_display_(/*34.30*/e/*34.31*/.getName),format.raw/*34.39*/("""</td>


                            <!-- Update button -->
                        <td>
                            <a href=""""),_display_(/*39.39*/routes/*39.45*/.HomeController.employeesManager()),format.raw/*39.79*/("""" class="button-xs btn-danger">
                                <span class="glyphicon glyphicon-pencil"></span>
                            </a> <!--updateEmployee(e.getEmail)    deleteEmployee(e.getEmail)-->
                        </td>
                            <!-- Delete button -->
                        <td>
                            <a href=""""),_display_(/*45.39*/routes/*45.45*/.HomeController.employeesManager()),format.raw/*45.79*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                                <span class="glyphicon glyphicon-trash"></span>
                            </a>
                        </td>
                    </tr>
                """)))}),format.raw/*50.18*/("""

            """),format.raw/*52.13*/("""</tbody>
        </table>

        <p>
            <a href=""""),_display_(/*56.23*/routes/*56.29*/.HomeController.addEmployee()),format.raw/*56.58*/("""">
                <button class="btn btn-primary">Add a new Customer</button>
            </a>
        </p>
    </div>
""")))}))
      }
    }
  }

  def render(employees:List[models.employees.Manager],user:models.employees.User): play.twirl.api.HtmlFormat.Appendable = apply(employees,user)

  def f:((List[models.employees.Manager],models.employees.User) => play.twirl.api.HtmlFormat.Appendable) = (employees,user) => apply(employees,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 04 23:27:08 GMT 2019
                  SOURCE: /home/ryan/Documents/sdev4CA1/app/views/managers.scala.html
                  HASH: 8613aa69754a9ab0134158588940715e4b7fef91
                  MATRIX: 997->1|1163->75|1193->97|1231->98|1262->103|1322->202|1353->208|1393->240|1432->242|1467->251|1536->294|1549->299|1584->314|1620->323|1662->335|1695->341|2162->829|2207->847|2240->864|2280->866|2329->887|2390->921|2400->922|2430->931|2492->966|2502->967|2531->975|2593->1010|2603->1011|2632->1019|2785->1145|2800->1151|2855->1185|3240->1543|3255->1549|3310->1583|3590->1832|3632->1846|3720->1907|3735->1913|3785->1942
                  LINES: 28->1|33->2|33->2|33->2|34->3|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|44->13|60->29|61->30|61->30|61->30|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|70->39|70->39|70->39|76->45|76->45|76->45|81->50|83->52|87->56|87->56|87->56
                  -- GENERATED --
              */
          