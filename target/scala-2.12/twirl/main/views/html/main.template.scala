
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
	<title> """),_display_(/*17.11*/pagename),format.raw/*17.19*/("""</title>
    </head>
    <body>
	<nav class="navbar navbar-inverse">
	    <div class="container-fluid">
		<div class="navbar-header">
		    <a class="navbar-brand" href=""""),_display_(/*23.38*/routes/*23.44*/.HomeController.index(0)),format.raw/*23.68*/("""">Durandal Industries</a>
		</div>
			<ul class="nav navbar-nav">
				"""),_display_(/*26.6*/if(user != null)/*26.22*/ {_display_(Seq[Any](format.raw/*26.24*/("""
					"""),format.raw/*27.6*/("""<li """),_display_(/*27.11*/if(pagename=="Employees")/*27.36*/{_display_(Seq[Any](format.raw/*27.37*/("""class="active"""")))}),format.raw/*27.52*/(""">
						<a href="/">Home</a>
					</li>

					<li """),_display_(/*31.11*/if(pagename=="Departments")/*31.38*/{_display_(Seq[Any](format.raw/*31.39*/("""class="active"""")))}),format.raw/*31.54*/(""">
						<a href=""""),_display_(/*32.17*/routes/*32.23*/.HomeController.departments),format.raw/*32.50*/("""">Departments</a>
					</li>

					"""),_display_(/*35.7*/if(user.getRole == "manager")/*35.36*/ {_display_(Seq[Any](format.raw/*35.38*/("""

						"""),format.raw/*37.7*/("""<li """),_display_(/*37.12*/if(pagename=="Employee Projects")/*37.45*/{_display_(Seq[Any](format.raw/*37.46*/("""class="active"""")))}),format.raw/*37.61*/(""">
							<a href=""""),_display_(/*38.18*/routes/*38.24*/.HomeController.projects),format.raw/*38.48*/("""">Projects</a>
						</li>
					""")))}),format.raw/*40.7*/("""
				""")))}),format.raw/*41.6*/("""
			"""),format.raw/*42.4*/("""<li """),_display_(/*42.9*/if(pagename=="Login")/*42.30*/{_display_(Seq[Any](format.raw/*42.31*/("""class="active"""")))}),format.raw/*42.46*/(""">
			"""),_display_(/*43.5*/if(user != null)/*43.21*/ {_display_(Seq[Any](format.raw/*43.23*/("""
				"""),format.raw/*44.5*/("""<a href=""""),_display_(/*44.15*/routes/*44.21*/.LoginController.logout()),format.raw/*44.46*/("""">Logout """),_display_(/*44.56*/user/*44.60*/.getName()),format.raw/*44.70*/("""</a>
			""")))}/*45.6*/else/*45.11*/{_display_(Seq[Any](format.raw/*45.12*/("""
				"""),format.raw/*46.5*/("""<a href=""""),_display_(/*46.15*/routes/*46.21*/.LoginController.login()),format.raw/*46.45*/("""">Login</a>
			""")))}),format.raw/*47.5*/("""

			"""),format.raw/*49.4*/("""</li>
			</ul>

		</div>
	</nav>

	<div class="container-fluid">
		<div class="col-sm-6">
		    <div class="midcol">
			"""),_display_(/*58.5*/content),format.raw/*58.12*/("""
		    """),format.raw/*59.7*/("""</div>

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
                  DATE: Sat Mar 16 14:50:05 GMT 2019
                  SOURCE: /home/ryan/Documents/a/sdev4CA1/app/views/main.scala.html
                  HASH: a52d270f9ab294ad2d97abd31190818b24c534f9
                  MATRIX: 974->1|1129->63|1429->337|1443->343|1502->382|1554->406|1583->407|1612->408|1699->467|1728->468|1761->474|1798->483|1827->484|1856->485|1932->533|1961->534|1994->540|2034->552|2063->553|2092->554|2139->573|2168->574|2201->580|2240->591|2269->592|2298->593|2382->649|2411->650|2444->656|2483->667|2512->668|2541->669|2607->707|2636->708|2669->714|2706->723|2735->724|2764->725|2804->737|2833->738|2862->740|2908->759|2937->767|3135->938|3150->944|3195->968|3292->1039|3317->1055|3357->1057|3390->1063|3422->1068|3456->1093|3495->1094|3541->1109|3619->1160|3655->1187|3694->1188|3740->1203|3785->1221|3800->1227|3848->1254|3910->1290|3948->1319|3988->1321|4023->1329|4055->1334|4097->1367|4136->1368|4182->1383|4228->1402|4243->1408|4288->1432|4351->1465|4387->1471|4418->1475|4449->1480|4479->1501|4518->1502|4564->1517|4596->1523|4621->1539|4661->1541|4693->1546|4730->1556|4745->1562|4791->1587|4828->1597|4841->1601|4872->1611|4899->1621|4912->1626|4951->1627|4983->1632|5020->1642|5035->1648|5080->1672|5126->1688|5158->1693|5305->1814|5333->1821|5367->1828
                  LINES: 28->1|33->2|39->8|39->8|39->8|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|45->14|46->15|46->15|46->15|46->15|46->15|46->15|47->16|48->17|48->17|54->23|54->23|54->23|57->26|57->26|57->26|58->27|58->27|58->27|58->27|58->27|62->31|62->31|62->31|62->31|63->32|63->32|63->32|66->35|66->35|66->35|68->37|68->37|68->37|68->37|68->37|69->38|69->38|69->38|71->40|72->41|73->42|73->42|73->42|73->42|73->42|74->43|74->43|74->43|75->44|75->44|75->44|75->44|75->44|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|77->46|78->47|80->49|89->58|89->58|90->59
                  -- GENERATED --
              */
          