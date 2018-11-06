/**
 * 
 */
package es.indra.aerolineas.beans;

import es.indra.aerolineas.beans.impl.Vuelo;

/**
 * @author P.era-1
 *
 */
public interface IAerolinea {
	
	void consultarVuelos(String origen);
	
	void consultarVuelos(String origen, String destino);
	
	void anularVuelos(String...vuelos);
	
	public String getNombre();
	
	public Vuelo[] getVuelos();

}
