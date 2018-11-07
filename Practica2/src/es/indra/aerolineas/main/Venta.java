/**
 * 
 */
package es.indra.aerolineas.main;

import java.io.IOException;

import es.indra.aerolineas.beans.IAerolinea;
import es.indra.aerolineas.beans.impl.Aerolinea;
import es.indra.aerolineas.beans.impl.Empleado;
import es.indra.aerolineas.beans.impl.Pasajero;
import es.indra.aerolineas.beans.impl.Vuelo;
import es.indra.aerolineas.exceptions.ErrorLecturaDeVuelosException;

/**
 * @author Daniel Garcia
 *
 */
public class Venta {
	
	private static Vuelo[] creaVuelos() {
		
		Vuelo[] vuelos = new Vuelo[10];
		
		for (int i = 0; i < vuelos.length; i++) {	
			int a = (int) (Math.random()*10+1);
			vuelos[i] = new Vuelo(i,"SD" + a, "MAD","VLC", i * 10, true   );
		}
		
		return vuelos;
	}

	/**
	 * @param args
	 * @throws ErrorLecturaDeVuelosException 
	 */
	public static void main(String[] args) throws ErrorLecturaDeVuelosException {

		String origen = null;
		String destino = null;
		
		Vuelo[] vuelos = creaVuelos();
		
		//Uso de la interface que contiene la clase de Aerolinea
		IAerolinea aa = new Aerolinea(10, "American Airlines",vuelos);
		
		aa.consultarVuelos("MAD");
		
		try {
			aa.consultarVuelos("MAD", "NY");
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		//aa.anularVuelos();
		//aa.anularVuelos("UX22");
		//aa.anularVuelos("SD32","DF33");
		
		Pasajero p = new Pasajero();
		
		Vuelo[] vuelosPasajero = {vuelos[0], vuelos[4]};
		
		p.setId(10);
		p.setNombre("Jose Julian");
		p.setApellido("Ariza Valderrama");
		p.setVuelos(vuelosPasajero);
		
		Empleado e = new Empleado();
		e.setNombre("Daniel");
		e.setApellido("García");
		
		
		System.out.println("*************************************************************************");
		
		System.out.println("|\tBienvenidos a aerolineas ".concat(aa.getNombre()));
		
		System.out.printf("|\tTenemos %s vuelos disponibles%n",aa.getVuelos().length);
		
		System.out.printf("|\t%s, gracias por confiar en nosotros. Tienes %s vuelos comprados %n", p.getNombre(), p.getVuelos().length );
		
		System.out.println("|\tLe atiende: " .concat(e.getNombre() .concat(" ") .concat(e.getApellido())));
		
		System.out.println("*************************************************************************");
		

	}

}
