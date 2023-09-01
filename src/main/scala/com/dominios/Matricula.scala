class Matricula extends Dominios:

  protected override def validar(valor: String): Unit =
    if (valor.length() != 7) then
      throw new Exception("Numero de matricula deve conter 7 digitos")

    if (!valor.forall(_.isDigit)) then
      throw new Exception("Matricula deve conter apenas digitos")

    var digitoVerificador = valor(6).asDigit
    var soma = 0
    var digitoEncontrado = 0
    var fator = 1

    for (i <- 0 to 5)
      soma += fator * valor(i).asDigit
      fator = if (i % 2 == 0) 2 else 1

    soma = soma % 10
    digitoEncontrado = if (soma != 0) (10 - soma) else 0

    if digitoVerificador != digitoEncontrado then
      throw new Exception("Digito verificador invalido")

end Matricula
