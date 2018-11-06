/**
 * 
 */
package es.indra.aerolineas.beans.impl;

/**
 * @author P.era-1
 *
 */
public class Empleado extends Persona {

	
	/**
	 * @return the nombre
	 * Sobreescribe el metodo de getNombre de persona
	 */
	@Override
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * @return the apellido
	 * Sobreescribe el método de getApellido de persona
	 */
	@Override
	public String getApellido() {
		return apellido;
	}

	@Override
	public String solicitarInformacion() {
	
		return "";
	}
}
