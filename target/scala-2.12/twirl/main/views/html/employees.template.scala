
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


        """),format.raw/*6.75*/("""
        """),_display_(/*7.10*/if(flash.containsKey("success"))/*7.42*/ {_display_(Seq[Any](format.raw/*7.44*/("""
            """),format.raw/*8.13*/("""<div class="alert alert-success">
            """),_display_(/*9.14*/flash/*9.19*/.get("success")),format.raw/*9.34*/("""
            """),format.raw/*10.13*/("""</div>
        """)))}),format.raw/*11.10*/("""

        """),format.raw/*13.9*/("""<div class="col-sm-9">
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

                    """),format.raw/*29.70*/("""
                    """),_display_(/*30.22*/for(e<-employees) yield /*30.39*/ {_display_(Seq[Any](format.raw/*30.41*/("""
                        """),format.raw/*31.25*/("""<tr>
                            <td>"""),_display_(/*32.34*/e/*32.35*/.getEmail),format.raw/*32.44*/("""</td>
                            <td>"""),_display_(/*33.34*/e/*33.35*/.getRole),format.raw/*33.43*/("""</td>
                            <td>"""),_display_(/*34.34*/e/*34.35*/.getName),format.raw/*34.43*/("""</td>


                                <!-- Update button -->
                            <td>
                                <a href=""""),_display_(/*39.43*/routes/*39.49*/.HomeController.employeesManager()),format.raw/*39.83*/("""" class="button-xs btn-danger">
                                    <span class="glyphicon glyphicon-pencil"></span>
                                </a> <!--updateEmployee(e.getEmail)    deleteEmployee(e.getEmail)-->
                            </td>
                                <!-- Delete button -->
                            <td>
                                <a href=""""),_display_(/*45.43*/routes/*45.49*/.HomeController.employeesManager()),format.raw/*45.83*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                                    <span class="glyphicon glyphicon-trash"></span>
                                </a>
                            </td>
                        </tr>
                    """)))}),format.raw/*50.22*/("""

                """),format.raw/*52.17*/("""</tbody>
            </table>

            <p>
                <a href=""""),_display_(/*56.27*/routes/*56.33*/.HomeController.addEmployee()),format.raw/*56.62*/("""">
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
                  DATE: Thu Mar 07 21:15:05 GMT 2019
                  SOURCE: /home/ryan/Documents/sdev4CA1/app/views/employees.scala.html
                  HASH: 01cfd9cef6107351ab77527b3474ebed9c33988c
                  MATRIX: 999->1|1166->75|1196->80|1226->102|1264->103|1299->112|1363->215|1399->225|1439->257|1478->259|1518->272|1591->319|1604->324|1639->339|1680->352|1727->368|1764->378|2283->918|2332->940|2365->957|2405->959|2458->984|2523->1022|2533->1023|2563->1032|2629->1071|2639->1072|2668->1080|2734->1119|2744->1120|2773->1128|2938->1266|2953->1272|3008->1306|3417->1688|3432->1694|3487->1728|3787->1997|3833->2015|3933->2088|3948->2094|3998->2123
                  LINES: 28->1|33->2|33->2|33->2|33->2|34->3|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|44->13|60->29|61->30|61->30|61->30|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|70->39|70->39|70->39|76->45|76->45|76->45|81->50|83->52|87->56|87->56|87->56
                  -- GENERATED --
              */
          