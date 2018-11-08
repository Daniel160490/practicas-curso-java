/**
 * 
 */
package es.indra.aerolineas.beans.impl;

import java.util.HashMap;
import java.util.Map;

/**
 * @author daniel
 *
 */
public class Billetes {

	private int id;
	private Vuelo vuelo;
	private Pasajero pasajero;
	private String asiento;
	private String fecha;
	
		
	/**
	 * 
	 */
	public Billetes() {
		super();
	}



	/**
	 * @param id
	 * @param vuelo
	 * @param pasajero
	 * @param asiento
	 * @param fecha
	 */
	public Billetes(int id, Vuelo vuelo, Pasajero pasajero, String asiento, String fecha) {
		super();
		this.id = id;
		this.vuelo = vuelo;
		this.pasajero = pasajero;
		this.asiento = asiento;
		this.fecha = fecha;
	}

	

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the vuelo
	 */
	public Vuelo getVuelo() {
		return vuelo;
	}


	/**
	 * @param vuelo the vuelo to set
	 */
	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}


	/**
	 * @return the pasajero
	 */
	public Pasajero getPasajero() {
		return pasajero;
	}


	/**
	 * @param pasajero the pasajero to set
	 */
	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	/**
	 * @return the asiento
	 */
	public String getAsiento() {
		return asiento;
	}


	/**
	 * @param asiento the asiento to set
	 */
	public void setAsiento(String asiento) {
		this.asiento = asiento;
	}

	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Billetes [id=" + id + ", vuelo=" + vuelo + ", pasajero=" + pasajero + ", asiento=" + asiento
				+ ", fecha=" + fecha + "]";
	}


}
