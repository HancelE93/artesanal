package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Maquina;

public class TestServirCervezaIA {
	
	

	// 🔹 CASO 1: Sirve correctamente cuando hay suficiente cerveza
    @Test
    public void testServirCervezaCorrectamente() {
        Maquina maquina = new Maquina("Pilsener", "Rubia", 0.05, 10000,"001");

        maquina.recargarCerveza(5000);

        double valor = maquina.servirCerveza(1000);

        assertEquals(50, valor, 0.001);
        assertEquals(4000, maquina.getCantidadActual(), 0.001);
    }

    // 🔹 CASO 2: No sirve si no hay suficiente cerveza
    @Test
    public void testNoSirvePorFaltaDeCerveza() {
        Maquina maquina = new Maquina("Pilsener", "Rubia", 0.05, 10000,"001");

        maquina.recargarCerveza(500);

        double valor = maquina.servirCerveza(1000);

        assertEquals(0, valor, 0.001);
        assertEquals(500, maquina.getCantidadActual(), 0.001);
    }

    // 🔹 CASO 3: Sirve exactamente toda la cantidad disponible
    @Test
    public void testServirCantidadExacta() {
        Maquina maquina = new Maquina("Pilsener", "Rubia", 0.05, 10000,"001");

        maquina.recargarCerveza(1000);

        double valor = maquina.servirCerveza(1000);

        assertEquals(50, valor, 0.001);
        assertEquals(0, maquina.getCantidadActual(), 0.001);
    }

    // 🔹 CASO 4: Usando el segundo constructor
    @Test
    public void testServirConConstructorSimple() {
        Maquina maquina = new Maquina("Corona", "Clara", 0.10,"002");

        maquina.recargarCerveza(2000);

        double valor = maquina.servirCerveza(500);

        assertEquals(50, valor, 0.001);
        assertEquals(1500, maquina.getCantidadActual(), 0.001);
    }

    // 🔹 CASO 5: Intentar servir cuando no hay nada
    @Test
    public void testServirSinCerveza() {
        Maquina maquina = new Maquina("Budweiser", "Lager", 0.08, 8000,"003");

        double valor = maquina.servirCerveza(500);

        assertEquals(0, valor, 0.001);
        assertEquals(0, maquina.getCantidadActual(), 0.001);
    }
}

