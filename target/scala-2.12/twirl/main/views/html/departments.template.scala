
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

object departments extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.entities.Department],models.employees.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(department: List[models.entities.Department], user: models.employees.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Department", user)/*2.26*/{_display_(Seq[Any](format.raw/*2.27*/("""
    """),format.raw/*3.5*/("""<p class="lead">Department List</p>
    """),_display_(/*4.6*/if(flash.containsKey("success"))/*4.38*/{_display_(Seq[Any](format.raw/*4.39*/("""
        """),format.raw/*5.9*/("""<div class="alert alert-success">
        """),_display_(/*6.10*/flash/*6.15*/.get("success")),format.raw/*6.30*/("""
        """),format.raw/*7.9*/("""</div>
    """)))}),format.raw/*8.6*/("""
    """),format.raw/*9.5*/("""<table class="table table-bordered table-hover table-condensed">
        <thead>
            <tr>
                <th>ID</th>
                <th>Department</th>
                <th colspan="2">Update/Delete</th>
            </tr>
        </thead>
        <tbody>
            """),_display_(/*18.14*/for(d<-department) yield /*18.32*/ {_display_(Seq[Any](format.raw/*18.34*/("""
                """),format.raw/*19.17*/("""<tr>
                    <td>"""),_display_(/*20.26*/d/*20.27*/.getId),format.raw/*20.33*/("""</td>
                    <td>"""),_display_(/*21.26*/d/*21.27*/.getName),format.raw/*21.35*/("""</td>
                    <td>
                        <a href=""""),_display_(/*23.35*/routes/*23.41*/.HomeController.updateDepartment(d.getId)),format.raw/*23.82*/("""" class="button xs btn-danger">
                            <span class="glyphicon glyphicon-pencil"></span>
                        </a>
                    </td>
                    <td>
                        <a href=""""),_display_(/*28.35*/routes/*28.41*/.HomeController.deleteDepartment(d.getId)),format.raw/*28.82*/("""" class="button xs btn-danger">
                            <span class="glyphicon glyphicon-trash"></span>
                        </a>
                    </td>
                </tr>
            """)))}),format.raw/*33.14*/("""
        """),format.raw/*34.9*/("""</tbody>
    </table>


    <a href=""""),_display_(/*38.15*/routes/*38.21*/.HomeController.addDepartment()),format.raw/*38.52*/("""">
        <button class="btn btn-primary">Add a Department</button>
    </a>
""")))}),format.raw/*41.2*/("""
"""))
      }
    }
  }

  def render(department:List[models.entities.Department],user:models.employees.User): play.twirl.api.HtmlFormat.Appendable = apply(department,user)

  def f:((List[models.entities.Department],models.employees.User) => play.twirl.api.HtmlFormat.Appendable) = (department,user) => apply(department,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 16 15:10:38 GMT 2019
                  SOURCE: /home/ryan/Documents/a/sdev4CA1/app/views/departments.scala.html
                  HASH: 9718bfeb6069d41ca7fc206794eb3b56debc6d0a
                  MATRIX: 1002->1|1171->78|1203->102|1241->103|1272->108|1338->149|1378->181|1416->182|1451->191|1520->234|1533->239|1568->254|1603->263|1644->275|1675->280|1979->557|2013->575|2053->577|2098->594|2155->624|2165->625|2192->631|2250->662|2260->663|2289->671|2381->736|2396->742|2458->783|2708->1006|2723->1012|2785->1053|3014->1251|3050->1260|3115->1298|3130->1304|3182->1335|3291->1414
                  LINES: 28->1|33->2|33->2|33->2|34->3|35->4|35->4|35->4|36->5|37->6|37->6|37->6|38->7|39->8|40->9|49->18|49->18|49->18|50->19|51->20|51->20|51->20|52->21|52->21|52->21|54->23|54->23|54->23|59->28|59->28|59->28|64->33|65->34|69->38|69->38|69->38|72->41
                  -- GENERATED --
              */
          