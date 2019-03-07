
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

object address extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.entities.Address],models.employees.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(address: List[models.entities.Address], user: models.employees.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Address", user)/*2.23*/{_display_(Seq[Any](format.raw/*2.24*/("""
    """),format.raw/*3.5*/("""<p class="lead">Address List</p>
    """),_display_(/*4.6*/if(flash.containsKey("success"))/*4.38*/{_display_(Seq[Any](format.raw/*4.39*/("""
        """),format.raw/*5.9*/("""<div class="alert alert-success">
        """),_display_(/*6.10*/flash/*6.15*/.get("success")),format.raw/*6.30*/("""
        """),format.raw/*7.9*/("""</div>
    """)))}),format.raw/*8.6*/("""
    """),format.raw/*9.5*/("""<table class="table table-bordered table-hover table-condensed">
        <thead>
            <tr>
                <th>ID</th>
                <th>Address</th>
            </tr>
        </thead>
        <tbody>
            """),_display_(/*17.14*/for(a<-address) yield /*17.29*/ {_display_(Seq[Any](format.raw/*17.31*/("""
                """),format.raw/*18.17*/("""<tr>
                    <td>"""),_display_(/*19.26*/a/*19.27*/.getId),format.raw/*19.33*/("""</td>
                    <td>"""),_display_(/*20.26*/a/*20.27*/.getAddress),format.raw/*20.38*/("""</td>
                </tr>
            """)))}),format.raw/*22.14*/("""
        """),format.raw/*23.9*/("""</tbody>
    </table>
""")))}))
      }
    }
  }

  def render(address:List[models.entities.Address],user:models.employees.User): play.twirl.api.HtmlFormat.Appendable = apply(address,user)

  def f:((List[models.entities.Address],models.employees.User) => play.twirl.api.HtmlFormat.Appendable) = (address,user) => apply(address,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 07 21:15:05 GMT 2019
                  SOURCE: /home/ryan/Documents/sdev4CA1/app/views/address.scala.html
                  HASH: 168edea3df646b314b4042de693f66791b6b999b
                  MATRIX: 995->1|1158->72|1187->93|1225->94|1256->99|1319->137|1359->169|1397->170|1432->179|1501->222|1514->227|1549->242|1584->251|1625->263|1656->268|1906->491|1937->506|1977->508|2022->525|2079->555|2089->556|2116->562|2174->593|2184->594|2216->605|2288->646|2324->655
                  LINES: 28->1|33->2|33->2|33->2|34->3|35->4|35->4|35->4|36->5|37->6|37->6|37->6|38->7|39->8|40->9|48->17|48->17|48->17|49->18|50->19|50->19|50->19|51->20|51->20|51->20|53->22|54->23
                  -- GENERATED --
              */
          