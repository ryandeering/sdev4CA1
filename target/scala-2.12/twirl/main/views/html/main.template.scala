
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.employees.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pagename: String, user: models.employees.User)(content:Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta charset="UTF-8"/>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="icon" type="image/png" href=""""),_display_(/*8.42*/routes/*8.48*/.Assets.versioned("images/favicon.png")),format.raw/*8.87*/("""">	
<style>
	    .footer """),format.raw/*10.14*/("""{"""),format.raw/*10.15*/(""" """),format.raw/*10.16*/("""font-weight: bold; color: white; background-color: black; i"""),format.raw/*10.75*/("""}"""),format.raw/*10.76*/("""
	    """),format.raw/*11.6*/(""".sidecol """),format.raw/*11.15*/("""{"""),format.raw/*11.16*/(""" """),format.raw/*11.17*/("""font-weight: bold; background-color: steelblue; """),format.raw/*11.65*/("""}"""),format.raw/*11.66*/("""
	    """),format.raw/*12.6*/(""".sidecol h2 """),format.raw/*12.18*/("""{"""),format.raw/*12.19*/(""" """),format.raw/*12.20*/("""font-weight: bold; """),format.raw/*12.39*/("""}"""),format.raw/*12.40*/("""
	    """),format.raw/*13.6*/(""".midcol h1 """),format.raw/*13.17*/("""{"""),format.raw/*13.18*/(""" """),format.raw/*13.19*/("""margin-top: 2em; text-align: center; font-weight: bold; """),format.raw/*13.75*/("""}"""),format.raw/*13.76*/("""
	    """),format.raw/*14.6*/(""".midcol h3 """),format.raw/*14.17*/("""{"""),format.raw/*14.18*/(""" """),format.raw/*14.19*/("""text-align: center; color: steelblue; """),format.raw/*14.57*/("""}"""),format.raw/*14.58*/("""
	    """),format.raw/*15.6*/(""".redtext """),format.raw/*15.15*/("""{"""),format.raw/*15.16*/(""" """),format.raw/*15.17*/("""color: red; """),format.raw/*15.29*/("""}"""),format.raw/*15.30*/("""
	"""),format.raw/*16.2*/("""</style>
	<title>OFM """),_display_(/*17.14*/pagename),format.raw/*17.22*/("""</title>
    </head>
    <body>
	<nav class="navbar navbar-inverse">
	    <div class="container-fluid">
		<div class="navbar-header">
		    <a class="navbar-brand" href="#">WebSiteName</a>
		</div>
		<ul class="nav navbar-nav">
		    <li """),_display_(/*26.12*/if(pagename == "Home")/*26.34*/{_display_(Seq[Any](format.raw/*26.35*/("""class="active"""")))}),format.raw/*26.50*/("""><a href=""""),_display_(/*26.61*/routes/*26.67*/.HomeController.index()),format.raw/*26.90*/("""">Home</a></li>
		    <li """),_display_(/*27.12*/if(pagename == "On Sale")/*27.37*/{_display_(Seq[Any](format.raw/*27.38*/("""class="active"""")))}),format.raw/*27.53*/("""><a href=""""),_display_(/*27.64*/routes/*27.70*/.HomeController.index()),format.raw/*27.93*/("""">Products</a></li>
		    <li """),_display_(/*28.12*/if(pagename == "About Us")/*28.38*/{_display_(Seq[Any](format.raw/*28.39*/("""class="active"""")))}),format.raw/*28.54*/("""><a href=""""),_display_(/*28.65*/routes/*28.71*/.HomeController.index()),format.raw/*28.94*/("""">About us</a></li>
		</ul>
	    </div>
	</nav>
	<div class="container-fluid">
	    <div class="row">
		<div class="col-sm-3">
		    <div class="well sidecol">
			<h2>News</h2>
			<h3>New product sub-category</h3>
			<p>Following the sudden and unprecedented volumes of trade in fashion paper bags, our <span class="redtext">bags</span> category has been extended to include a seventh subcategory, <span class="redtext">paper handbags</span>.
		    </div>
		</div>
		<div class="col-sm-6">
		    <div class="midcol">
			"""),_display_(/*43.5*/content),format.raw/*43.12*/("""
		    """),format.raw/*44.7*/("""</div>
		</div>
		<div class="col-sm-3">
		    <div class="well sidecol">
			<h2>Events</h2>
			<h3>The 153rd Meet for Real event</h3>
			<p>The popular <span class="redtext">Meet for Real</span> event takes place this Sunday at the Square Park, from 7am until 1pm. It will yet again give flea-market enthusiasts a chance to engage in a bit of live bartering and banter with their fellow sitesters.</p>
		    </div>
		</div>
	    </div>
	    <div class="row">
		<div class="col-sm-12">
		    <div class="well footer">
			Website created by ABC Sights
		    </div>
		</div>
	    </div>
	</div>


    </body>
</html>


"""))
      }
    }
  }

  def render(pagename:String,user:models.employees.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pagename,user)(content)

  def f:((String,models.employees.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pagename,user) => (content) => apply(pagename,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 15 12:24:44 GMT 2019
                  SOURCE: /home/ryan/Documents/a/sdev4CA1/app/views/main.scala.html
                  HASH: 30cd393ce2ff5e213e995cac7b7343cef129a0d5
                  MATRIX: 974->1|1129->63|1429->337|1443->343|1502->382|1555->407|1584->408|1613->409|1700->468|1729->469|1762->475|1799->484|1828->485|1857->486|1933->534|1962->535|1995->541|2035->553|2064->554|2093->555|2140->574|2169->575|2202->581|2241->592|2270->593|2299->594|2383->650|2412->651|2445->657|2484->668|2513->669|2542->670|2608->708|2637->709|2670->715|2707->724|2736->725|2765->726|2805->738|2834->739|2863->741|2912->763|2941->771|3207->1010|3238->1032|3277->1033|3323->1048|3361->1059|3376->1065|3420->1088|3474->1115|3508->1140|3547->1141|3593->1156|3631->1167|3646->1173|3690->1196|3748->1227|3783->1253|3822->1254|3868->1269|3906->1280|3921->1286|3965->1309|4512->1830|4540->1837|4574->1844
                  LINES: 28->1|33->2|39->8|39->8|39->8|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|45->14|46->15|46->15|46->15|46->15|46->15|46->15|47->16|48->17|48->17|57->26|57->26|57->26|57->26|57->26|57->26|57->26|58->27|58->27|58->27|58->27|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|59->28|74->43|74->43|75->44
                  -- GENERATED --
              */
          