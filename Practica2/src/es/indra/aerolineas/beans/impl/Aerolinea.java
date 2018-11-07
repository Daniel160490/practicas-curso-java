/**
 * 
 */
package es.indra.aerolineas.beans.impl;

import java.util.List;

import es.indra.aerolineas.beans.IAerolinea;
import es.indra.aerolineas.services.ReadFile;

/**
 * @author josejarizav
 *
 *
 */
public class Aerolinea implements IAerolinea {
	
	private int id;
	private String nombre;
	private Vuelo[] vuelos = new Vuelo[10];
	
	public Aerolinea() {}

	/**
	 * @param id
	 * @param nombre
	 * @param vuelos
	 */
	public Aerolinea(int id, String nombre, Vuelo[] vuelos) {
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
	public Vuelo[] getVuelos() {
		return vuelos;
	}

	/**
	 * @param vuelos the vuelos to set
	 */
	public void setVuelos(Vuelo[] vuelos) {
		this.vuelos = vuelos;
	}

	
	/*
	 * 
	 * 	SOBRECARGA DE METODOS
	 * 
	 */
	public void consultarVuelos(String origen) {
		
		//System.out.println("Método con SOLO DESTINO: ".concat(origen));
	}
	
	
	/*
	 * Mismo metodo que recibe en este caso dos parámetros
	 */
	public void consultarVuelos(String origen, String destino) {
		
		ReadFile r = new ReadFile();
		r.retornarVuelos();
		List<String> vuelosEncontrados = r.retornarVuelos();
		
		/*
		 * Comprueba que la lista que se recibe no este vacía o nula para imprimir
		 */
		if (vuelosEncontrados != null && !vuelosEncontrados.isEmpty()) {
			/*
			 * Recorre el array de contenido y lo convierte en un String cadena
			 * Al imprimir el contenido lo separa directamente
			 */
			
			System.out.println("+--------------------------------------------------------");
			
			for(String cadena: r.retornarVuelos()) {
				System.out.println("| " .concat(cadena));
			}
			
			System.out.println("+--------------------------------------------------------");
		}
		
		
		
		//System.out.printf("Método de 2 parámetros: %s y %s %n", origen, destino);
	}
	
	
	/*
	 * Método para anular vuelos
	 * Recibe parametros de forma dinámica, y tienen que ser siempre del mismo tipo
	 * Esto se dice con los tres puntos ...
	 */
	public void anularVuelos(String...vuelos) {
		System.out.println("Número de vuelos a anular: " + vuelos.length);
	}
	
	
	

}
