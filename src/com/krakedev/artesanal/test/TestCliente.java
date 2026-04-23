package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Cliente;
import com.krakedev.artesanal.NegocioMejorado;

public class TestCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NegocioMejorado nM = new NegocioMejorado();
		
		Cliente cliente = nM.registrarCLientes("Paul", "123");
		System.out.println("Funciona correctamente");
	}

}
