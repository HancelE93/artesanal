package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Cliente;
import com.krakedev.artesanal.NegocioMejorado;

public class TestConsumoJUnitPrueba {
	
    @Test
    public void testConsumirCerveza() {


        NegocioMejorado negocio = new NegocioMejorado();

     
        negocio.agregarMaquina("Pilsener", "Rubia", 0.05);

        negocio.cargarMaquinas();

        String codigoMaquina = negocio.getMaquinas().get(0).getCodigo();

        Cliente cliente = negocio.registrarCLientes("Juan", "123");
        int codigoCliente = cliente.getCodigo();

        negocio.consumirCerveza(codigoCliente, codigoMaquina, 100);

        assertTrue(cliente.getTotalConsumido() > 0);

        double esperado = 100 * 0.05;
        assertEquals(esperado, cliente.getTotalConsumido(), 0.001);

        assertTrue(negocio.getMaquinas().get(0).getCantidadActual() < 10000);
    }

}
