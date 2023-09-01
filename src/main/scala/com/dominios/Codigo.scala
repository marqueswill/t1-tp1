class Codigo extends Dominios:

  protected override def validar(valor: String): Unit =
    if valor.length() != 6 then
      throw new Exception("Tamanho de codigo invalido")

    for (i <- 0 to 5)
      if (i < 3) then
        if (!valor(i).isLetter) then
          throw new Exception(
            "Os tres caracteres iniciais do codigo devem ser letras"
          )
      else if (!(valor(i).isDigit)) then
        throw new Exception(
          "Os tres ultimos caracteres do codigo devem ser digitos"
        )

end Codigo
