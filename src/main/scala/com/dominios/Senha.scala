class Senha extends Dominios:

  protected override def validar(valor: String): Unit =
    val validLetters: Seq[Char] = ('a' to 'z') ++ ('A' to 'Z')
    val validNumbers: Seq[Char] = ('0' to '9')
    val validSymbols = Seq('@', '#', '$', '%', '&')
    val validCharacters =
      validLetters ++ validNumbers ++ validSymbols

    if ((valor.length() != 6)) then
      throw new Exception("Senha deve conter 6 caracteres")

    for (ch <- valor)
      if !((validCharacters.contains(ch)) && (valor.count(_ == ch) == 1)) then
        throw new Exception("Senha invalida")

end Senha
