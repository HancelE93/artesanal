package com.krakedev.artesanal.testJUnit;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.NegocioMejorado;

public class TestPruebaRecupearMaquinaUnit {
	@Test
    public void testRecuperarMaquinaExistente() {
        NegocioMejorado negocio = new NegocioMejorado();

        negocio.agregarMaquina("Pilsener", "Cerveza rubia", 0.05);
        String codigo = negocio.getMaquinas().get(0).getCodigo();

        Maquina resultado = negocio.recuperarMaquina(codigo);

        assertNotNull(resultado);
        assertEquals(codigo, resultado.getCodigo());
    }

    @Test
    public void testRecuperarMaquinaNoExistente() {
        NegocioMejorado negocio = new NegocioMejorado();

        Maquina resultado = negocio.recuperarMaquina("M-999");

        assertNull(resultado);
    }
}
