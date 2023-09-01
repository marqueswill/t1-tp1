class TUClasse extends munit.FunSuite:
  val VALOR_VALIDO = "FUMACA"
  val VALOR_INVALIDO = "fumaca"

  val dominio = new Classe()
  test("testarValorValido"):
    dominio.setValor(VALOR_VALIDO)
    assertEquals(dominio.getValor(), VALOR_VALIDO)

  test("testarValorInvalido"):
    val exception = intercept[Exception]:
      dominio.setValor(VALOR_INVALIDO)

class TUCodigo extends munit.FunSuite:
  val VALOR_VALIDO = "UnB231"
  val VALOR_INVALIDO = "123ABC"

  val dominio = new Codigo()
  test("testarValorValido"):
    dominio.setValor(VALOR_VALIDO)
    assertEquals(dominio.getValor(), VALOR_VALIDO)

  test("testarValorInvalido"):
    val exception = intercept[Exception]:
      dominio.setValor(VALOR_INVALIDO)

class TUData extends munit.FunSuite:
  val VALOR_VALIDO = "29/FEV/2020"
  val VALOR_INVALIDO = "29/FEV/2021"

  val dominio = new Data()
  test("testarValorValido"):
    dominio.setValor(VALOR_VALIDO)
    assertEquals(dominio.getValor(), VALOR_VALIDO)

  test("testarValorInvalido"):
    val exception = intercept[Exception]:
      dominio.setValor(VALOR_INVALIDO)

class TUMatricula extends munit.FunSuite:
  val VALOR_VALIDO = "1234567"
  val VALOR_INVALIDO = "1234568"

  val dominio = new Matricula()
  test("testarValorValido"):
    dominio.setValor(VALOR_VALIDO)
    assertEquals(dominio.getValor(), VALOR_VALIDO)

  test("testarValorInvalido"):
    val exception = intercept[Exception]:
      dominio.setValor(VALOR_INVALIDO)

class TUResultado extends munit.FunSuite:
  val VALOR_VALIDO = "APROVADO"
  val VALOR_INVALIDO = "aprovado"

  val dominio = new Resultado()
  test("testarValorValido"):
    dominio.setValor(VALOR_VALIDO)
    assertEquals(dominio.getValor(), VALOR_VALIDO)

  test("testarValorInvalido"):
    val exception = intercept[Exception]:
      dominio.setValor(VALOR_INVALIDO)

class TUSenha extends munit.FunSuite:
  val VALOR_VALIDO = "w1Ly4n"
  val VALOR_INVALIDO = "minhasenha123"

  val dominio = new Senha()
  test("testarValorValido"):
    dominio.setValor(VALOR_VALIDO)
    assertEquals(dominio.getValor(), VALOR_VALIDO)

  test("testarValorInvalido"):
    val exception = intercept[Exception]:
      dominio.setValor(VALOR_INVALIDO)

class TUTelefone extends munit.FunSuite:
  val VALOR_VALIDO = "+1234567890123"
  val VALOR_INVALIDO = "123456789012345"

  val dominio = new Telefone()
  test("testarValorValido"):
    dominio.setValor(VALOR_VALIDO)
    assertEquals(dominio.getValor(), VALOR_VALIDO)

  test("testarValorInvalido"):
    val exception = intercept[Exception]:
      dominio.setValor(VALOR_INVALIDO)

class TUTexto extends munit.FunSuite:
  val VALOR_VALIDO = "TP1 - JLW 2023"
  val VALOR_INVALIDO = "abc123"

  val dominio = new Texto()
  test("testarValorValido"):
    dominio.setValor(VALOR_VALIDO)
    assertEquals(dominio.getValor(), VALOR_VALIDO)

  test("testarValorInvalido"):
    val exception = intercept[Exception]:
      dominio.setValor(VALOR_INVALIDO)
