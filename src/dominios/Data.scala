class Data extends Dominios:

  private override def validar(valor: String): Unit =
    val mesValido = List(
      "JAN",
      "FEV",
      "MAR",
      "ABR",
      "MAI",
      "JUN",
      "JUL",
      "AGO",
      "SET",
      "OUT",
      "NOV",
      "DEZ"
    )

    val diasMes =
      List(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

    if (valor.count('/') != 2) then
      throw new Exception("Formato de data invalido")

    var dia, mes, ano: String
    var data = valor.split("/")

    try
      dia = data(0).toInt()
      mes = data(1)
      ano = data(2).toInt()
    catch
      case _ -> NumberFormatException => throw new Exception("Data invalida")

    if !(ano >= 2000 && ano <= 2999) then
      throw new Exception("Ano deve estar entre 2000 e 2999")

    if !(mesValido.contains(mes)) then
      throw new Exception("Sigla do mes invalida")

    if (mes == "FEV") then
      if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0))
        diasMes(1) = 29

    var pos: Int = mesValido.indexOf(mes)
    if !(dia >= 1 && dia <= diasMes(pos)) then
      throw new Exception("Dia do mes invalido")

end Data
