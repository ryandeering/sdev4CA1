// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ryan/Documents/a/sdev4CA1/conf/routes
// @DATE:Sat Mar 16 15:06:08 GMT 2019


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
