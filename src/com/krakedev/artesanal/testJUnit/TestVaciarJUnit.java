package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Maquina;

public class TestVaciarJUnit {
	@Test
    public void testVaciarMaquina() {
        
        // Crear máquina
        Maquina maquina = new Maquina("Pilsener", "Rubia", 0.002, 8000, "001", 0);

        // Llenar máquina (queda en 7800)
        maquina.llenarMaquina();

        // Vaciar máquina
        maquina.vaciarMaquina();

        // Verificar
        assertEquals(0, maquina.getCantidadActual());
        assertEquals(7800, maquina.getCantidadDesperdicio());
    }
}

