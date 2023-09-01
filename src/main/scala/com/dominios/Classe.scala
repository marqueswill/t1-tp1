class Classe extends Dominios:

  protected override def validar(valor: String): Unit =
    val formatosValidos = List(
      "UNIDADE",
      "INTEGRACAO",
      "FUMACA",
      "SISTEMA",
      "REGRESSAO",
      "ACEITACAO"
    )

    if !formatosValidos.contains(valor) then
      throw new Exception("Classe inválida")

end Classe
