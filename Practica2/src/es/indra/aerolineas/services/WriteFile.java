/**
 * 
 */
package es.indra.aerolineas.services;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * @author Daniel Garcia
 *
 */
public class WriteFile {

	public void escribirFichero() {
		
		FileWriter fichero = null;
        PrintWriter pw = null;

        try
        {
        	fichero = new FileWriter("pasajeros.txt");
           	pw = new PrintWriter(fichero);
 
           	System.out.println("Guardando pasajeros.txt");
           	for (int i = 0; i < 10; i++)
        	   pw.println("Linea " + i);
 
        } catch (Exception e) {
        	e.printStackTrace();
        } finally {
        	try {
    			// Finally se va a encargar de comprobar que se cierra el fichero
        		if (null != fichero)
        			fichero.close();
        	} catch (Exception e2) {
        		e2.printStackTrace();
        	}
        }
	}
}
