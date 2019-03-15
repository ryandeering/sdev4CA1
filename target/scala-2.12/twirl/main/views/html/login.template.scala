
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.employees.Login],models.employees.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.employees.Login], user:models.employees.User):play.twirl.api.HtmlFormat.Appendable = {
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
    """),_display_(/*33.6*/inputPassword(loginForm("password"), '_label -> "",
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

  def render(loginForm:Form[models.employees.Login],user:models.employees.User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.employees.Login],models.employees.User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 15 12:24:44 GMT 2019
                  SOURCE: /home/ryan/Documents/a/sdev4CA1/app/views/login.scala.html
                  HASH: afe6d89801da05765cb4c5407cd2f23dfc3b8f58
                  MATRIX: 992->1|1134->72|1178->88|1205->90|1232->109|1270->110|1301->115|1345->134|1382->163|1421->165|1452->170|1517->209|1565->241|1605->243|1642->253|1652->254|1681->262|1722->273|1750->274|1786->280|1815->283|1854->313|1893->314|1925->319|1995->362|2009->367|2043->380|2075->385|2113->393|2146->400|2160->406|2233->470|2273->472|2301->474|2313->478|2344->488|2372->489|2428->519|2557->627|2585->628|2648->665|2787->783|2815->784|2952->891|2984->893
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|38->7|38->7|38->7|39->8|41->10|41->10|41->10|42->11|42->11|42->11|43->12|44->13|45->14|47->16|47->16|47->16|48->17|49->18|49->18|49->18|50->19|51->20|57->26|57->26|57->26|57->26|58->27|58->27|58->27|59->28|60->29|61->30|62->31|64->33|65->34|66->35|71->40|72->41
                  -- GENERATED --
              */
          