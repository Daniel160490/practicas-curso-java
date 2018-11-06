/**
 * 
 */
package es.indra.aerolineas.beans;

/**
 * @author josejarizav
 *
 *
 */
public class Pasajero extends Persona {
	
	
	private int id;
	
	private Vuelo[] vuelos;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Vuelo[] getVuelos() {
		return vuelos;
	}

	public void setVuelos(Vuelo[] vuelos) {
		this.vuelos = vuelos;
	}
	
	

}
