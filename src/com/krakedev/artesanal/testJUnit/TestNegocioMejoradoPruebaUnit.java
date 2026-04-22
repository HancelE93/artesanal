package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.NegocioMejorado;

public class TestNegocioMejoradoPruebaUnit {
	 @Test
	    public void testGenerarCodigoFormato() {
	        NegocioMejorado negocio = new NegocioMejorado();

	        String codigo = negocio.generarCodigo();

	        // ✔ No debe ser null
	        assertNotNull(codigo);

	        // ✔ Debe empezar con "M-"
	        assertTrue(codigo.startsWith("M-"));
	    }

	    @Test
	    public void testGenerarCodigoRango() {
	        NegocioMejorado negocio = new NegocioMejorado();

	        String codigo = negocio.generarCodigo();

	        // Extraer el número
	        String numeroStr = codigo.substring(2);
	        int numero = Integer.parseInt(numeroStr);

	        // ✔ Debe estar entre 1 y 100
	        assertTrue(numero >= 1 && numero <= 100);
	    }
}
