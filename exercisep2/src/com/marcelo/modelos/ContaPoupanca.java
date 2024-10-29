package com.marcelo.modelos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

import com.marcelo.juros.CDI;

public class ContaPoupanca extends Conta {
	
    public ContaPoupanca() {
        super();
    }

	public BigDecimal renderJuros() {
	    BigDecimal juros = consultarSaldo().multiply(consultarSaldo());
	    depositar(juros);
		return juros;
	}
	
	public BigDecimal consultarTaxaJuros() {
		return CDI.getTaxaJuros();
	}
}
