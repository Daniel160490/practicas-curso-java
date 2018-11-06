package es.indra.aerolineas.beans.impl;

public abstract class Persona {

	protected String nombre;
	protected String apellido;
	protected String dni;
	protected int id;
	
	
	public Persona(String nombre, String apellido, String dni, int id) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.id = id;
	}

	public Persona() {}

	public abstract String solicitarInformacion();
	
	
	/**
	 * @return the nombre
	 * Escribe en mayúsculas el nombre de los pasajeros
	 */
	public String getNombre() {
		return nombre.toUpperCase();
	}
	
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido.toUpperCase();
	}


	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
}
