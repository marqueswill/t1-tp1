class Texto extends Dominios:

  protected override def validar(valor: String): Unit =
    val validLetters: Seq[Char] = ('a' to 'z') ++ ('A' to 'Z')
    val validNumbers: Seq[Char] = ('0' to '9')
    val validSymbols: Seq[Char] = Seq('@', '#', '$', '%', '&', ' ')
    val validPonctuation = Seq('.', ',', ';', '?', '!', ':', '-')
    val validCharacters =
      validLetters ++ validNumbers ++ validSymbols ++ validPonctuation

    if !((valor.length() >= 10) && (valor.length() <= 20)) then
      throw new Exception("Texto deve conter de 10 a 20 caracteres")

    if (valor.contains("  "))
      throw new Exception(
        "Texto não deve conter espaços em branco em Sequencia"
      )

    for (ch <- valor)
      if (!validCharacters.contains(ch)) then
        throw new Exception("Texto não deve conter acentuacao")

end Texto
