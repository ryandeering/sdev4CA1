
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.employees.Employee,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.employees.Employee):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/("Home", user)),format.raw/*2.16*/("""{"""),format.raw/*2.17*/("""
    """),format.raw/*3.5*/("""<h1>Meowdy.</h1>
"""),format.raw/*4.1*/("""}"""))
      }
    }
  }

  def render(user:models.employees.Employee): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.employees.Employee) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Feb 15 09:43:29 GMT 2019
                  SOURCE: /home/ryan/Documents/sdev4CA1/app/views/index.scala.html
                  HASH: f05f24b609bc689e3743d40bb158006a3c307b93
                  MATRIX: 967->1|1094->36|1128->50|1156->51|1187->56|1230->73
                  LINES: 28->1|33->2|33->2|33->2|34->3|35->4
                  -- GENERATED --
              */
          