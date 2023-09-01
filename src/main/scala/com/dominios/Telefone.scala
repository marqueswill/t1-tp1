class Telefone extends Dominios:

  protected override def validar(valor: String): Unit =
    if !(valor.startsWith("+")) then
      throw new Exception("Numero de telefone deve conter + no inicio")

    if (valor.length() < 8 || valor.length() > 16) then
      throw new Exception("Numero de telefone deve de 7 a 16 digitos")

    for (i <- 1 to valor.length() - 1)
      if (!valor(i).isDigit) then
        throw new Exception("Numero de telefone deve conter apenas digitos")

end Telefone
