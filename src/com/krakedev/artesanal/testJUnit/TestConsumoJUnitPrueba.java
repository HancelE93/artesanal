package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Cliente;
import com.krakedev.artesanal.NegocioMejorado;

public class TestConsumoJUnitPrueba {
	 @Test
	    public void testConsumirCerveza() {

	        // 🔹 Crear negocio
	        NegocioMejorado negocio = new NegocioMejorado();

	        // 🔹 Agregar máquina
	        negocio.agregarMaquina("Pilsener", "Rubia", 0.05);

	        // 🔹 Llenar máquina (IMPORTANTE)
	        negocio.cargarMaquinas();

	        // 🔹 Obtener código de la máquina
	        String codigoMaquina = negocio.getMaquinas().get(0).getCodigo();

	        // 🔹 Registrar cliente
	        Cliente cliente = negocio.registrarCLientes("Juan", "123");
	        int codigoCliente = cliente.getCodigo();

	        // 🔹 Ejecutar consumo
	        negocio.consumirCerveza(codigoCliente, codigoMaquina, 100);

	        // 🔹 Validar cliente actualizado
	        assertTrue(cliente.getTotalConsumido() > 0);

	        // 🔹 Validar valores correctos
	        double esperado = 100 * 0.05;
	        assertEquals(esperado, cliente.getTotalConsumido(), 0.001);

	        // 🔹 Validar máquina afectada
	        assertTrue(negocio.getMaquinas().get(0).getCantidadActual() < 10000);
	    }
}
