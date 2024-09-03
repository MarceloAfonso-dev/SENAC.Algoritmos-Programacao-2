programa {
  inclua biblioteca Util

  funcao inicio() {
      inteiro Q[5], i
      real P[5], faturamento = 0

      para (i = 1; i != 5; i++) {
        escreva("Digite a quantidade: ")
        leia(Q[i])
        escreva("Digite o preço: ")
        leia(P[i])
      faturamento += Q[i]*P[i]
      }

      escrevalS("\nFaturamento do mês")
      escreva("R$" + faturamento)
  }

  funcao escrevalS(cadeia texto) {
        escreva(texto)
        escreva("\n")
    }

    funcao escrevalI(inteiro numero) {
        escreva(numero)
        escreva("\n")
    }

    funcao escrevalD(real numeroReal) {
        escreva(numeroReal)
        escreva("\n")
    }
}
