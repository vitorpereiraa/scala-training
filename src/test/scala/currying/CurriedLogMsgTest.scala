package currying

import org.scalatest.funsuite.AnyFunSuiteLike

import java.time.LocalTime
import java.time.format.DateTimeFormatter

class CurriedLogMsgTest extends AnyFunSuiteLike {

  def getTimestampStr: String = {
    LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"))
  }

  test("testLogMessagePartialFunctionCall") {
    val logMsgFun: (String, String) => String = ??? // partial call

    val timestamp_1 = getTimestampStr
    assert(logMsgFun(timestamp_1, "Application is running.") == s"[$timestamp_1] [DEBUG] [MyApp] - Application is running.")

    val timestamp_2 = getTimestampStr
    assert(logMsgFun(timestamp_2, "Application processed data.") == s"[$timestamp_2] [DEBUG] [MyApp] - Application processed data.")
  }

  test("testLogMessageFunctionCall") {
    val timestamp = getTimestampStr

    val logMsg: String = ???

    assert(logMsg == s"[$timestamp] [INFO] [MyApp] - Application is starting up.")
  }



}
