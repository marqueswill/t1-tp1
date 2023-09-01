abstract class Dominios:
  protected var valor: String

  protected def validar(valor: String): Unit

  def setValor(valor: String): Unit =
    validar(valor)
    this.valor = valor

  def getValor(): String = valor

end Dominios
