
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

object employees extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.employees.Employee],models.employees.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employees: List[models.employees.Employee] ,user: models.employees.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""    """),_display_(/*2.6*/main("Employees",user)/*2.28*/{_display_(Seq[Any](format.raw/*2.29*/("""
        """),format.raw/*3.9*/("""<h1>Current customers</h1>
        """),_display_(/*4.10*/if(flash.containsKey("success"))/*4.42*/ {_display_(Seq[Any](format.raw/*4.44*/("""
            """),format.raw/*5.13*/("""<div class="alert alert-success">
            """),_display_(/*6.14*/flash/*6.19*/.get("success")),format.raw/*6.34*/("""
            """),format.raw/*7.13*/("""</div>
        """)))}),format.raw/*8.10*/("""

        """),format.raw/*10.9*/("""<div class="col-sm-9">
            <h4>Employees.</h4>
            <table class="table table-bordered table-hover table-condensed">
                <thead>
                    <tr>
                        <th>Email</th>
                        <th>Role </th>
                        <th>Name </th>
                    </tr>
                </thead>
                <tbody>

                    """),_display_(/*22.22*/for(e<-employees) yield /*22.39*/ {_display_(Seq[Any](format.raw/*22.41*/("""
                        """),format.raw/*23.25*/("""<tr>
                            <td>"""),_display_(/*24.34*/e/*24.35*/.getEmail),format.raw/*24.44*/("""</td>
                            <td>"""),_display_(/*25.34*/e/*25.35*/.getRole),format.raw/*25.43*/("""</td>
                            <td>"""),_display_(/*26.34*/e/*26.35*/.getName),format.raw/*26.43*/("""</td>

                            <td>
                                <a href=""""),_display_(/*29.43*/routes/*29.49*/.HomeController.employeesManager()),format.raw/*29.83*/("""" class="button-xs btn-danger">
                                    <span class="glyphicon glyphicon-pencil"></span>
                                </a>
                            </td>
                            <td>
                                <a href=""""),_display_(/*34.43*/routes/*34.49*/.HomeController.employeesManager()),format.raw/*34.83*/("""" class="button-xs btn-danger">
                                    <span class="glyphicon glyphicon-trash"></span>
                                </a>
                            </td>
                        </tr>
                    """)))}),format.raw/*39.22*/("""

                """),format.raw/*41.17*/("""</tbody>
            </table>
            <p>
                <a href=""""),_display_(/*44.27*/routes/*44.33*/.HomeController.addEmployee()),format.raw/*44.62*/("""">
                    <button class="btn btn-primary">Add a new Customer</button>
                </a>
            </p>
        </div>
    """)))}))
      }
    }
  }

  def render(employees:List[models.employees.Employee],user:models.employees.User): play.twirl.api.HtmlFormat.Appendable = apply(employees,user)

  def f:((List[models.employees.Employee],models.employees.User) => play.twirl.api.HtmlFormat.Appendable) = (employees,user) => apply(employees,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 16 14:50:05 GMT 2019
                  SOURCE: /home/ryan/Documents/a/sdev4CA1/app/views/employees.scala.html
                  HASH: 6752bd66f3b1addbdaa2649a0635e6981b3bde74
                  MATRIX: 999->1|1166->75|1196->80|1226->102|1264->103|1299->112|1361->148|1401->180|1440->182|1480->195|1553->242|1566->247|1601->262|1641->275|1687->291|1724->301|2146->696|2179->713|2219->715|2272->740|2337->778|2347->779|2377->788|2443->827|2453->828|2482->836|2548->875|2558->876|2587->884|2696->966|2711->972|2766->1006|3056->1269|3071->1275|3126->1309|3395->1547|3441->1565|3540->1637|3555->1643|3605->1672
                  LINES: 28->1|33->2|33->2|33->2|33->2|34->3|35->4|35->4|35->4|36->5|37->6|37->6|37->6|38->7|39->8|41->10|53->22|53->22|53->22|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|60->29|60->29|60->29|65->34|65->34|65->34|70->39|72->41|75->44|75->44|75->44
                  -- GENERATED --
              */
          