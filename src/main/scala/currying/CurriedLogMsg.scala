package currying

object CurriedLogMsg {
  def log(logLevel: String, messagePrefix: String)(timestamp: String, message: String): String = {
    // Construct the log message
    s"[$timestamp] [$logLevel] [$messagePrefix] - $message"
  }
}
