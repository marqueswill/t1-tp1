class Texto extends Dominios:

  private override def validar(valor: String): Unit =
    val validLetters = ('a' to 'z') ++ ('A' to 'Z')
    val validNumbers = ('0' to '9')
    val validSymbols = ('@', '#', '$', '%', '&', ' ')
    val validPonctuation = ('.', ',', ';', '?', '!', ':', '-')
    val validCharacters =
      validLetters ++ validNumbers ++ validSymbols ++ validPonctuation

    if !((valor.length() >= 10) && (valor.length() <= 20)) then
      throw new Exception("Texto deve conter de 10 a 20 caracteres")

    if (valor.contains("  "))
      throw new Exception(
        "Texto não deve conter espaços em branco em Listuência"
      )

    for (ch <- validCharacters)
      if !(valor.contains(ch)) then
        throw new Exception("Texto não deve conter acentuacao")

end Texto
