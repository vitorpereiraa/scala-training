package currying

enum LogLevel:
  case DEBUG, INFO, ERROR
  
object CurriedLogMsg {
  def log(logLevel: LogLevel, messagePrefix: String)(timestamp: String, message: String): String = {
    // Construct the log message
    s"[$timestamp] [$logLevel] [$messagePrefix] - $message"
  }
}
