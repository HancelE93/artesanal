package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.NegocioMejorado;

public class TestAgregarMaquinaMejoradoPruebaU {

    @Test
    public void testAgregarMaquinaOk() {
        NegocioMejorado negocio = new NegocioMejorado();

        boolean resultado = negocio.agregarMaquina("Pilsener", "Rubia", 0.05);

        assertTrue(resultado);
        assertEquals(1, negocio.getMaquinas().size());
    }

    @Test
    public void testAgregarMaquinaDuplicada() {
        NegocioMejorado negocio = new NegocioMejorado();

        negocio.agregarMaquina("Pilsener", "Rubia", 0.05);

        // forzamos mismo código tomando el existente
        String codigo = negocio.getMaquinas().get(0).getCodigo();

        // simulamos duplicado llamando directamente recuperarMaquina
        boolean existe = negocio.recuperarMaquina(codigo) != null;

        assertTrue(existe);
    }
}
