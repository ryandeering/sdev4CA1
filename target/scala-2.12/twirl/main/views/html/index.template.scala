
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Index")/*1.15*/{_display_(Seq[Any](format.raw/*1.16*/("""
"""),format.raw/*2.1*/("""<p>
<a href=""""),_display_(/*3.11*/routes/*3.17*/.HomeController.addEmployee()),format.raw/*3.46*/("""">
<button class = "btn btn-primary"> Add an Employee </button>
</a>
</p>
""")))}),format.raw/*7.2*/("""

"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Feb 14 10:53:44 GMT 2019
                  SOURCE: /home/ryan/Documents/sdev4CA1/app/views/index.scala.html
                  HASH: a6b2c338a18a51065c3b3a0898dbc2b21460a5d5
                  MATRIX: 1030->1|1051->14|1089->15|1116->16|1156->30|1170->36|1219->65|1323->140
                  LINES: 33->1|33->1|33->1|34->2|35->3|35->3|35->3|39->7
                  -- GENERATED --
              */
          