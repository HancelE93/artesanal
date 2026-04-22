package com.krakedev.artesanal;

import java.util.ArrayList;

public class NegocioMejorado {

	ArrayList<Maquina> maquinas;

	public NegocioMejorado() {
		maquinas = new ArrayList<>();
	}

	public ArrayList<Maquina> getMaquinas() {
		return maquinas;
	}

	public void setMaquinas(ArrayList<Maquina> maquinas) {
		this.maquinas = maquinas;
	}

	public String generarCodigo() {

	    int numero = (int) (Math.random() * 100) + 1; 
	    // Math.random() → da un decimal entre 0 y 1
	    // *100 → lo pasa a 0–99
	    // (int) → quita decimales (ej: 25.7 → 25)
	    // +1 → ajusta el rango a 1–100

	    String codigo = "M-" + numero; 
	    // concatena texto + número → ej: "M-" + 25 = "M-25"

	    return codigo; 
	    // devuelve el resultado final
	}
	
	public void agregarMaquina (String nombreCerveza,String descripcion,double precioPorMl) {
		String codigo = generarCodigo(); // llamamos el metodo generar codigo y le guardamos en una variable
		
		Maquina maquina = new Maquina(nombreCerveza,descripcion,precioPorMl,codigo);
		// se crea el objeto maquina y  con los valores que recibe
		
		maquinas.add(maquina); //agregamps el objeto
		
	}
	
	public void cargarMaquinas () {
		 for (int i = 0; i < maquinas.size(); i++) { 
		        // recorre la lista desde la posición 0 hasta la última

		        maquinas.get(i).llenarMaquina(); 
		        // toma cada máquina y ejecuta llenarMaquina()
		    }
	}
	}
