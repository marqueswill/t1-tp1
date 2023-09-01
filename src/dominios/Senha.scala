class Senha extends Dominios:

  private override def validar(valor: String): Unit =
    val validLetters = ('a' to 'z') ++ ('A' to 'Z')
    val validNumbers = ('0' to '9')
    val validSymbols = ('@', '#', '$', '%', '&')
    val validCharacters =
      validLetters ++ validNumbers ++ validSymbols

    if ((valor.length() != 6)) then
      throw new Exception("Senha deve conter 6 caracteres")

    for (ch <- validCharacters)
      if !((valor.contains(ch)) && (valor.count(ch) == 1)) then
        throw new Exception("Senha invalida")

end Senha
