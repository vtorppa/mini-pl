package minipl.errors

final case class MiniPLSyntaxError(msg: String) extends Exception

final case class MiniPLSemanticError(msg: String) extends Exception

final case class MiniPLAssertionError() extends Exception

final case class MiniPLNullPointerError() extends Exception