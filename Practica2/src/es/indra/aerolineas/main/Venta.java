/**
 * 
 */
package es.indra.aerolineas.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import es.indra.aerolineas.beans.IAerolinea;
import es.indra.aerolineas.beans.impl.Aerolinea;
import es.indra.aerolineas.beans.impl.Billetes;
import es.indra.aerolineas.beans.impl.Empleado;
import es.indra.aerolineas.beans.impl.Pasajero;
import es.indra.aerolineas.beans.impl.Vuelo;
import es.indra.aerolineas.exceptions.ErrorLecturaDeVuelosException;

/**
 * @author Daniel Garcia
 *
 */
public class Venta {
	
	private static List<Vuelo> creaVuelos() {
		
		List<Vuelo> vuelos = new ArrayList<>();
		
		for (int i = 0; i < 100; i++) {	
			int a = new Random().nextInt(500);
			vuelos.add(new Vuelo(i,"SD" + a, "MAD","VLC", i * 10, true   ));
		}
		
		return vuelos;
	}
	
	/*
	 * Metodo para generar billetes aleatoriamente
	 * Este metodo los genera con una fecha y asiento ademas de para un pasajero
	 */
	private static List<Billetes> generarBilletes(String fecha, Pasajero p){
		List<Billetes> billetes = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			Billetes billete = new Billetes();
			billete.setId(i);
			billete.setFecha(fecha);
			
			char c1 = (char)new Random().nextInt(50);
			char c2 = (char)new Random().nextInt(50);
			
			/*
			 * 
			 */
			billete.setAsiento("" + c1 + c2 + new Random().nextInt(100) + new Random().nextInt(50));
			billete.setPasajero(p); 
			billete.setVuelo(p.getVuelos().get(new Random().nextInt(p.getVuelos().size())));
			
			billetes.add(billete);
		}
		
		return billetes;
	}
	
	public static String generateString() {
        String uuid = UUID.randomUUID().toString();
        return uuid;
    }

	/**
	 * @param args
	 * @throws ErrorLecturaDeVuelosException 
	 */
	public static void main(String[] args) throws ErrorLecturaDeVuelosException {

		
		List<Vuelo> vuelos = creaVuelos();
		
		//Uso de la interface que contiene la clase de Aerolinea
		IAerolinea aa = new Aerolinea(10, "American Airlines",vuelos);
		
		//aa.consultarVuelos("MAD");
		/*
		try {
			aa.consultarVuelos("MAD", "NY");
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}*/
		
		//aa.anularVuelos();
		//aa.anularVuelos("UX22");
		//aa.anularVuelos("SD32","DF33");
		
		Pasajero p = new Pasajero();
		
		List<Vuelo> vuelosPasajero = new ArrayList<>();
		vuelosPasajero.add(vuelos.get(0));
		vuelosPasajero.add(vuelos.get(4));
		
		p.setId(10);
		p.setNombre("Jose Julian");
		p.setApellido("Ariza Valderrama");
		p.setDni("74375632C");
		p.setVuelos(vuelosPasajero);
		
		Empleado e = new Empleado();
		e.setNombre("Daniel");
		e.setApellido("Garcia");
		
		Map<String, List<Billetes>> billetesEmitidos = new HashMap<>();
		
		billetesEmitidos.put("08/11/2018", generarBilletes("08/11/2018", p));
		billetesEmitidos.put("01/01/2019", generarBilletes("01/01/2019", p));
		
		aa.setBilletes(billetesEmitidos);
		
		aa.verBilletesPorFecha("08/11/2018");
		
		System.out.println("*************************************************************************");
		
		System.out.println("|\tBienvenidos a aerolineas ".concat(aa.getNombre()));
		
		System.out.printf("|\tTenemos %s vuelos disponibles%n",aa.getVuelos().size());
		
		System.out.printf("|\t%s, gracias por confiar en nosotros. Tienes %s vuelos comprados %n", p.getNombre(), p.getVuelos().size());
		
		System.out.println("|\tLe atiende: " .concat(e.getNombre() .concat(" ") .concat(e.getApellido())));
		
		System.out.println("*************************************************************************");
		

	}

}
