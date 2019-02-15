
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.employees.Login],models.employees.Employee,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.employees.Login], user:models.employees.Employee):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Login", user)/*4.21*/{_display_(Seq[Any](format.raw/*4.22*/("""
    """),format.raw/*5.5*/("""<h3>Sign in</h3>

"""),_display_(/*7.2*/if(loginForm.hasGlobalErrors)/*7.31*/ {_display_(Seq[Any](format.raw/*7.33*/("""
    """),format.raw/*8.5*/("""<p class ="alert alert-warning">

    """),_display_(/*10.6*/for(e <- loginForm.globalErrors) yield /*10.38*/ {_display_(Seq[Any](format.raw/*10.40*/("""
        """),_display_(/*11.10*/e/*11.11*/.message),format.raw/*11.19*/("""<br/>
    """)))}),format.raw/*12.6*/("""
"""),format.raw/*13.1*/("""</p>
""")))}),format.raw/*14.2*/("""

"""),_display_(/*16.2*/if(flash.containsKey("error"))/*16.32*/{_display_(Seq[Any](format.raw/*16.33*/("""
    """),format.raw/*17.5*/("""<div class="alert alert-success">
        """),_display_(/*18.10*/flash/*18.15*/.get("error")),format.raw/*18.28*/("""
    """),format.raw/*19.5*/("""</div>
""")))}),format.raw/*20.2*/("""





"""),_display_(/*26.2*/helper/*26.8*/.form(action = controllers.routes.LoginController.loginSubmit())/*26.72*/ {_display_(Seq[Any](format.raw/*26.74*/("""
"""),_display_(/*27.2*/CSRF/*27.6*/.formField),format.raw/*27.16*/("""
"""),format.raw/*28.1*/("""<div class="form-group">
    """),_display_(/*29.6*/inputText(loginForm("email"), '_label -> "",
    'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*30.64*/("""
"""),format.raw/*31.1*/("""</div>
<div class="form-group">
    """),_display_(/*33.6*/inputText(loginForm("password"), '_label -> "",
    'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*34.67*/("""
"""),format.raw/*35.1*/("""</div>
<div class="form-group">
    <input type="submit" value="Sign In" class="btn btn-primary">
</div>

""")))}),format.raw/*40.2*/("""
""")))}),format.raw/*41.2*/("""



"""))
      }
    }
  }

  def render(loginForm:Form[models.employees.Login],user:models.employees.Employee): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.employees.Login],models.employees.Employee) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Feb 15 10:33:40 GMT 2019
                  SOURCE: /home/ryan/Documents/sdev4CA1/app/views/login.scala.html
                  HASH: dcea94bcde08677b544945ec5637aa1a4fc3f1d2
                  MATRIX: 996->1|1142->76|1186->92|1213->94|1240->113|1278->114|1309->119|1353->138|1390->167|1429->169|1460->174|1525->213|1573->245|1613->247|1650->257|1660->258|1689->266|1730->277|1758->278|1794->284|1823->287|1862->317|1901->318|1933->323|2003->366|2017->371|2051->384|2083->389|2121->397|2154->404|2168->410|2241->474|2281->476|2309->478|2321->482|2352->492|2380->493|2436->523|2565->631|2593->632|2656->669|2791->783|2819->784|2956->891|2988->893
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|38->7|38->7|38->7|39->8|41->10|41->10|41->10|42->11|42->11|42->11|43->12|44->13|45->14|47->16|47->16|47->16|48->17|49->18|49->18|49->18|50->19|51->20|57->26|57->26|57->26|57->26|58->27|58->27|58->27|59->28|60->29|61->30|62->31|64->33|65->34|66->35|71->40|72->41
                  -- GENERATED --
              */
          