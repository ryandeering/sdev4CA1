
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.employees.Employee,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pagename: String, user: models.employees.Employee)(content:Html):play.twirl.api.HtmlFormat.Appendable = {
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

  def render(pagename:String,user:models.employees.Employee,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pagename,user)(content)

  def f:((String,models.employees.Employee) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pagename,user) => (content) => apply(pagename,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Feb 15 14:38:41 GMT 2019
                  SOURCE: /home/ryan/Documents/sdev4CA1/app/views/main.scala.html
                  HASH: e85a75e5886a56d737859a256e53e655ae136a38
                  MATRIX: 978->1|1137->67|1437->341|1451->347|1510->386|1563->411|1592->412|1621->413|1708->472|1737->473|1770->479|1807->488|1836->489|1865->490|1941->538|1970->539|2003->545|2043->557|2072->558|2101->559|2148->578|2177->579|2210->585|2249->596|2278->597|2307->598|2391->654|2420->655|2453->661|2492->672|2521->673|2550->674|2616->712|2645->713|2678->719|2715->728|2744->729|2773->730|2813->742|2842->743|2871->745|2920->767|2949->775|3215->1014|3246->1036|3285->1037|3331->1052|3369->1063|3384->1069|3428->1092|3482->1119|3516->1144|3555->1145|3601->1160|3639->1171|3654->1177|3698->1200|3756->1231|3791->1257|3830->1258|3876->1273|3914->1284|3929->1290|3973->1313|4520->1834|4548->1841|4582->1848
                  LINES: 28->1|33->2|39->8|39->8|39->8|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|45->14|46->15|46->15|46->15|46->15|46->15|46->15|47->16|48->17|48->17|57->26|57->26|57->26|57->26|57->26|57->26|57->26|58->27|58->27|58->27|58->27|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|59->28|74->43|74->43|75->44
                  -- GENERATED --
              */
          