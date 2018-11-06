/**
 * 
 */
package es.indra.aerolineas.beans;

/**
 * @author P.era-1
 *
 */
public interface IAerolinea {
	
	void consultarVuelos(String origen);
	
	void consultarVuelos(String origen, String destino);
	
	void anularVuelos(String...vuelos);

}
