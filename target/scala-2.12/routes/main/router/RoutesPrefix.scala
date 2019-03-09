// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ryan/Documents/sdev4CA1/conf/routes
// @DATE:Sat Mar 09 20:31:00 GMT 2019


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
