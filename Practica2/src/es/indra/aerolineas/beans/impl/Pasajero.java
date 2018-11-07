/**
 * 
 */
package es.indra.aerolineas.beans.impl;

/**
 * @author josejarizav
 *
 *
 */
public class Pasajero extends Persona {
	
	
	private int id;
	
	private Vuelo[] vuelos;
	
	private Billetes[] billete;
	
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
	
	public Billetes[] getBillete() {
		return billete;
	}
	
	public void setBillete(Billetes[] billete) {
		this.billete = billete;
	}

	@Override
	public String solicitarInformacion() {
		
		return "";
	}
	
	

}
