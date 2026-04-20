package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Cliente;
import com.krakedev.artesanal.Negocio;

public class TestAsignarCodigoCliente {

	@Test
	public void asignarCodigo() {
		
		Negocio barDeMoe =  new Negocio ();
		
		Cliente Mario = new Cliente ("Mario","123456789");
		Cliente Andres = new Cliente ("Andres","123456788");
		
		barDeMoe.asignarCodigoCLiente(Mario);
		barDeMoe.asignarCodigoCLiente(Andres);
		
		//assertEquals es prueba si vale o  no
		//primer parametro lo q se espera el segundo lo q se tiene q dar
		assertEquals(100,Mario.getCodigo());
		assertEquals(101,Andres.getCodigo());
		
		
		
		
	}
}
