// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ryan/Documents/College_Projects/sdev4CA1/conf/routes
// @DATE:Mon Feb 11 19:20:01 GMT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
