package com.krakedev.artesanal;

import java.util.ArrayList;

public class NegocioMejorado {

	ArrayList<Maquina> maquinas;
	ArrayList<Cliente> clientes;

	private int ultimoCodigo = 1000;
	
	
	public NegocioMejorado() {
		maquinas = new ArrayList<>();
		//clientes = new ArrayList<>();
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

	public boolean agregarMaquina(String nombreCerveza, String descripcion, double precioPorMl) {
		String codigo = generarCodigo(); // llamamos el metodo generar codigo y le guardamos en una variable

		if ( recuperarMaquina(codigo)!=null) {
			return false;
		}
		Maquina maquina = new Maquina(nombreCerveza, descripcion, precioPorMl, codigo);
		// se crea el objeto maquina y con los valores que recibe
		maquinas.add(maquina); // agregamps el objeto

		return true;
	}

	public void cargarMaquinas() {
		for (int i = 0; i < maquinas.size(); i++) {
			// recorre la lista desde la posición 0 hasta la última

			maquinas.get(i).llenarMaquina();
			// toma cada máquina y ejecuta llenarMaquina()
		}
	}

	public Maquina recuperarMaquina(String codigo) {
		for (int i = 0; i < maquinas.size(); i++) {

			Maquina m = maquinas.get(i); // obtiene una máquina de la lista

			if (m.getCodigo().equals(codigo)) {
				// compara el texto del código (no usar ==)

				return m; // si coincide, devuelve esa máquina
			}
		}
		return null; // si no encuentra ninguna, retorna null
	}

	public Cliente  registrarCLientes(String nombre, String cedula) {
		
		 // 1. Generar código con ultimoCodigo
	    
		String codigo = "A-" + ultimoCodigo;

	    // 2. Incrementar para el siguiente cliente
	    ultimoCodigo++;

	    // 3. Crear el cliente
	    Cliente cliente = new Cliente();
	    cliente.setNombre(nombre);
	    cliente.setCedula(cedula);
	    // (si tu clase Cliente tiene atributo codigo, también lo asignas aquí)

	    // 4. Guardarlo en la lista
	    clientes.add(cliente);

	    // 5. Retornar el cliente creado (opcional pero recomendado)
	    return cliente;
	}
}
