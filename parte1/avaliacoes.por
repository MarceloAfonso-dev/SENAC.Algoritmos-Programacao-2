programa {
  inclua biblioteca Util

  funcao inicio() {
    inteiro opinioes[150], i, avaliacoes[3]
    cadeia opcoes[3] = {"Atendimento ruim","Atendimento regular","Atendimento excelente"}
    
    para (i = 0; i != 3; i++) {
      avaliacoes[i] = 0
    }

    para (i = 0; i != 150; i++) {
      inteiro j = Util.sorteia(0,2)
      opinioes[i] = j
      avaliacoes[j] += 1
    }

    escreva(opcoes[0] + ": " + (avaliacoes[0]/150)*100+"%\n")
    escreva(opcoes[1] + ": " + (avaliacoes[1]/150)*100+"%\n")
    escreva(opcoes[2] + ": " + (avaliacoes[2]/150)*100+"%\n")
  }

}
