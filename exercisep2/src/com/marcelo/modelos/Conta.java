package com.marcelo.modelos;

import java.math.BigDecimal;

public class Conta {
	private Integer numero;
	private BigDecimal saldo = BigDecimal.ZERO;
	private String nome;
	
    public boolean depositar(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) > 0) {
            saldo = saldo.add(valor);
            return true;
        }
        return false;
    }

    public boolean sacar(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) > 0 && saldo.compareTo(valor) >= 0) {
            saldo = saldo.subtract(valor);
            return true;
        }
        return false;
    }

    public BigDecimal consultarSaldo() {
        return this.saldo;
    }

    public boolean transferir(BigDecimal valor, Conta contaDestino) {
        if (sacar(valor)) {
            contaDestino.depositar(valor);
            return true;
        }
        return false;
    }
}
