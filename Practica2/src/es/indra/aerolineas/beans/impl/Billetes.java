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
public class Billetes extends Persona {

	int id;
	String numAsiento;
	String numBillete;
	String FechaEmision;
	
	
	/**
	 * @param nombre
	 * @param apellido
	 * @param dni
	 * @param id
	 * @param id2
	 * @param numAsiento
	 * @param numBillete
	 * @param fechaEmision
	 */
	public Billetes(String nombre, String apellido, String dni, int id, int id2, String numAsiento, String numBillete,
			String fechaEmision) {
		super(nombre, apellido, dni, id);
		id = id2;
		this.numAsiento = numAsiento;
		this.numBillete = numBillete;
		FechaEmision = fechaEmision;
	}
	
	
	/**
	 * 
	 */
	public Billetes() {
		super();
	}



	/**
	 * @param nombre
	 * @param apellido
	 * @param dni
	 * @param id
	 */
	public Billetes(String nombre, String apellido, String dni, int id) {
		super(nombre, apellido, dni, id);
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
	 * @return the numAsiento
	 */
	public String getNumAsiento() {
		return numAsiento;
	}

	/**
	 * @param numAsiento the numAsiento to set
	 */
	public void setNumAsiento(String numAsiento) {
		this.numAsiento = numAsiento;
	}

	/**
	 * @return the fechaEmision
	 */
	public String getFechaEmision() {
		return FechaEmision;
	}

	/**
	 * @param fechaEmision the fechaEmision to set
	 */
	public void setFechaEmision(String fechaEmision) {
		FechaEmision = fechaEmision;
	}

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
	 * Sobreescribe el metodo de getApellido de persona
	 */
	@Override
	public String getApellido() {
		return apellido;
	}
	
	
	@Override
	public String solicitarInformacion() {
		
		return " ";
	}
	
	public void verBilletesPorFecha() {
	
		Map<String, String> billetes = new HashMap<>();
		
		billetes.put("07/11/18","74739532C");
		billetes.put("06/11/18","74739532C");
		billetes.put("07/11/18","70000032C");
		billetes.put("11/11/11","70220032C");
		
		for (Map.Entry<String, String> elemento: billetes.entrySet() ) {
			System.out.println("|\tBillete con fecha: " + elemento.getKey() + " con pasajero: " + elemento.getValue());
		}
	}

}
