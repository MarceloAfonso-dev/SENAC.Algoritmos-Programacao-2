package com.marcelo.juros;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class CDI {
	
    private static final BigDecimal TAXA_JUROS = gerarTaxaJuros();

    private static BigDecimal gerarTaxaJuros() {
        Random random = new Random();
        int taxa = random.nextInt(1, 88);
        return BigDecimal.valueOf(taxa).divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP);
    }

    public static BigDecimal getTaxaJuros() {
        return TAXA_JUROS;
    }
}