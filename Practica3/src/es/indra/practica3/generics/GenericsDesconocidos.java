/**
 * 
 */
package es.indra.practica3.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author P.era-1
 *
 */
public class GenericsDesconocidos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> listado = new ArrayList();
		listado.add(23);
		listado.add(45);
		
		
		List<Number> listadoDesconocido = new ArrayList();
		listadoDesconocido.add(new Integer(34));
		listadoDesconocido.add(23.12);
	}

}
