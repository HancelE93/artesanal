package com.krakedev.artesanal.test;

import com.krakedev.artesanal.NegocioMejorado;

public class TestCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NegocioMejorado nM = new NegocioMejorado();
		
		nM.registrarCLientes("Paul", "Mosquera");
		System.out.println(nM);
	}

}
