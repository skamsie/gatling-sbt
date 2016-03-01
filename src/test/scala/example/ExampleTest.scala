package example

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._


class ExampleTest extends Simulation {

  val site = "http://example.com"
  val url = http.baseURL(site)
  val scenarioTitle = s"$site load simulation."
  val exampleTest = exec {
      http("Example gatling test simulation")
        .get("/")
        .check(status.is(200))
  }

  val scn = scenario(scenarioTitle).exec(exampleTest)

  setUp(
    scn.inject(
      rampUsers(10) over(5 seconds),
      constantUsersPerSec(3) during(10 seconds)
    ).protocols(url)
  )
}
