programa {
    inclua biblioteca Util

    funcao inicio() {
        inteiro i = 100
        inteiro vetor[100], max = 1, min = i
        
        para (inteiro j = 0; j < i; j++) {
            vetor[j] = Util.sorteia(0,100)
            se (min > vetor[j]) {min = vetor[j]}
            se (max < vetor[j]) {max = vetor[j]}
        }
        
        para (inteiro j = 0; j < i; j++) {
            escrevalI(vetor[j])
        }

        escreva("MAX: ")escrevalI(max)
        escreva("MIN: ")escrevalI(min)

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
