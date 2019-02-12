// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ryan/Documents/sdev4CA1/conf/routes
// @DATE:Tue Feb 12 20:10:27 GMT 2019


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
