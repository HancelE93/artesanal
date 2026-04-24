package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Cliente;
import com.krakedev.artesanal.NegocioMejorado;

public class testConsultarValorVendidoUnit {
	@Test
	public void testConsultarValorVendido() {

	    NegocioMejorado negocio = new NegocioMejorado();

	  
	    negocio.agregarMaquina("Pilsener", "Rubia", 0.05);
	    negocio.cargarMaquinas();

	    String codigoMaquina = negocio.getMaquinas().get(0).getCodigo();

	
	    Cliente c1 = negocio.registrarCLientes("Juan", "123");
	    Cliente c2 = negocio.registrarCLientes("Pedro", "456");


	    negocio.consumirCerveza(c1.getCodigo(), codigoMaquina, 100); // 5
	    negocio.consumirCerveza(c2.getCodigo(), codigoMaquina, 200); // 10

	
	    double esperado = 15;

	
	    assertEquals(esperado, negocio.consultarValorVendido(), 0.001);
	}
}
