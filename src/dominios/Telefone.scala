class Telefone extends Dominios

private override def validar(valor: String): Unit =
  if !(valor.startsWith('+')) then
    throw new Exception("Numero de telefone deve conter + no inicio")

  if !(valor.length() >= 8 && valor.length() <= 16) then
    throw new Exception("Numero de telefone deve de 7 a 16 digitos")

  if !(valor.forall(_.isDigit())) then
    throw new Exception("Numero de telefone deve conter apenas digitos")

end Telefone
