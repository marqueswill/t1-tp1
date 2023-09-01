class Matricula extends Dominios:

  protected override def validar(valor: String): Unit =
    if (valor.length() != 7) then
      throw new Exception("Numero de matricula deve conter 7 digitos")

    if (!valor.forall(_.isDigit)) then
      throw new Exception("Matricula deve conter apenas digitos")

    var listaValores = valor.toList.map(_.asDigit)
    var digitoVerificador = listaValores.last

    listaValores = listaValores.init // remove o ultimo
    listaValores = listaValores.reverse // inverte a lista

    for (i <- 0 to 5)
      if (i % 2 == 0) then
        listaValores = listaValores.updated(i, listaValores(i) * 2)

    var soma: Int = 0
    for (valor <- listaValores)
      if (valor >= 10) then
        var digitoUnidade = valor % 10
        var digitoDezena = (valor - digitoUnidade) / 10
        soma += digitoDezena + digitoUnidade
      else soma += valor

    var resto: Int = soma % 10
    var resultado = if (resto != 0) then (10 - resto) else 0
