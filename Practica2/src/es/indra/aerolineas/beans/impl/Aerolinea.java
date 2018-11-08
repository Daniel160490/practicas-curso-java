/**
 * 
 */
package es.indra.aerolineas.beans.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import es.indra.aerolineas.beans.IAerolinea;
import es.indra.aerolineas.exceptions.ErrorLecturaDeVuelosException;
import es.indra.aerolineas.services.ReadFile;

/**
 * @author Daniel Garcia
 *
 *
 */
public class Aerolinea implements IAerolinea {
	
	private int id;
	private String nombre;
	private List<Vuelo> vuelos = new ArrayList<>();
	private Map<String, List<Billetes>> billetes;
	
	
	public Aerolinea() {	
		
	}

	/**
	 * @param id
	 * @param nombre
	 * @param vuelos
	 */
	public Aerolinea(int id, String nombre, List<Vuelo> vuelos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.vuelos = vuelos;
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
	 * @return the nombre
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the vuelos
	 */
	@Override
	public List<Vuelo> getVuelos() {
		return vuelos;
	}

	/**
	 * @param vuelos the vuelos to set
	 */
	public void setVuelos(List<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}

	/**
	 * @return the billetes
	 */
	public Map<String, List<Billetes>> getBilletes() {
		return billetes;
	}

	/**
	 * @param billetes the billetes to set
	 */
	public void setBilletes(Map<String, List<Billetes>> billetes) {
		this.billetes = billetes;
	}

	/* (non-Javadoc)
	 * @see es.indra.aerolineas.beans.IAerolinea#consultarVuelos(java.lang.String)
	 */
	@Override
	public void consultarVuelos(String origen) {
		ReadFile read = new ReadFile();
		List<String> vuelosEncontrados = new ArrayList<String>();
		try {
			vuelosEncontrados = read.retornarVuelos();
			if (vuelosEncontrados != null && !vuelosEncontrados.isEmpty()) {
				for (String vuelo : vuelosEncontrados) {
					System.out.println(vuelo);
				}
			} else {
				System.out.println("No se encontraron vuelos");
			}
		} catch (ErrorLecturaDeVuelosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Aerolinea [nombre=" + nombre + "]";
	}

	
	
	/*
	 * Mismo metodo que recibe en este caso dos parametros
	 */
	public void consultarVuelos(String origen, String destino) throws IOException, ErrorLecturaDeVuelosException {
		
		ReadFile read = new ReadFile();
		List<String> vuelosEncontrados = new ArrayList<String>();
		try {
			vuelosEncontrados = read.retornarVuelos();
			if (vuelosEncontrados != null && !vuelosEncontrados.isEmpty()) {
				for (String vuelo : vuelosEncontrados) {
					System.out.println(vuelo);
				}
			} else {
				System.out.println("No se encontraron vuelos");
			}
		} catch (ErrorLecturaDeVuelosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	/*
	 * Metodo para anular vuelos
	 * Recibe parametros de forma dinamica, y tienen que ser siempre del mismo tipo
	 * Esto se dice con los tres puntos ...
	 */
	public void anularVuelos(String...vuelos) {
		System.out.println("Numero de vuelos a anular: " + vuelos.length);
	}
	
	@Override
	public void verBilletesPorFecha(String fechaBillete) {
		
		List<Billetes> billetePorDia = this.billetes.get(fechaBillete);
		System.out.println("+--------- IMPRESION DE BILLETES ---------+");
		for (Billetes b : billetePorDia) {
			System.out.println("|\t" + b);
		}
		System.out.println("+-----------------------------------------+");
		
		
	}
	

}
