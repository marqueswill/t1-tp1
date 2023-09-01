class Resultado extends Dominios:

  protected override def validar(valor: String): Unit =
    val formatosValidos = List(
      "APROVADO",
      "REPROVADO"
    )

    if !formatosValidos.contains(valor) then
      throw new Exception("Resultado inválido")

end Resultado
