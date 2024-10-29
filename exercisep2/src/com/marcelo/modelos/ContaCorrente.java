package com.marcelo.modelos;

import java.math.BigDecimal;

public class ContaCorrente extends Conta {
	private BigDecimal limite;
	
	public ContaCorrente(BigDecimal limite) {
		super();
		this.limite = limite;
	}

	@Override
	public boolean sacar(BigDecimal valor) {
	//	saldo + limite
		return true;
	}
	
	public BigDecimal consultarLimite() {
		return this.limite;
	}
}
