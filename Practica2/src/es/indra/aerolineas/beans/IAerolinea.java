/**
 * 
 */
package es.indra.aerolineas.beans;

import java.io.IOException;

import es.indra.aerolineas.beans.impl.Vuelo;
import es.indra.aerolineas.exceptions.ErrorLecturaDeVuelosException;

/**
 * @author Daniel Garcia
 *
 */
public interface IAerolinea {
	
	void consultarVuelos(String origen);
	
	void consultarVuelos(String origen, String destino) throws IOException, ErrorLecturaDeVuelosException;
	
	void anularVuelos(String...vuelos);
	
	public String getNombre();
	
	public Vuelo[] getVuelos();

}
