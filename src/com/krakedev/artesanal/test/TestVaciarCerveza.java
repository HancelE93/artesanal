package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.Negocio;

public class TestVaciarCerveza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maquina maquinaA = new Maquina ("cerveza club","Cerveza fria",0.02,8000,"001",0.05);
		Negocio negocioA = new Negocio("Mi necogio",maquinaA);
		
		maquinaA.vaciarMaquina();
		maquinaA.imprimir();
		
		Maquina maquinaB = new Maquina ("cerveza Brama","Cerveza caliente",0.02,8000,"001",0.2);
		Negocio negocioB = new Negocio("Mi necogio",maquinaB);
		
		maquinaB.vaciarMaquina();
		maquinaB.imprimir();
		
		
		
		
		

	}

}
