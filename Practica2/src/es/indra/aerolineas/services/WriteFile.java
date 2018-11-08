/**
 * 
 */
package es.indra.aerolineas.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import es.indra.aerolineas.beans.impl.Pasajero;

/**
 * @author Daniel Garcia
 *
 */
public class WriteFile {

	/*
	 * Metodo para generar un fichero .txt
	 */
	public static void escribirFichero() {
		
		Pasajero pasajero;
		FileWriter fichero = null;
        PrintWriter pw = null;

        try
        {
        	/*
        	 * Lo genera en el directorio del proyecto
        	 */
        	fichero = new FileWriter("pasajeros.txt");
           	pw = new PrintWriter(fichero);
 
           	List<Pasajero> p = new ArrayList();
           	
           	System.out.println("Guardando pasajeros.txt");
           	for (int i = 0; i < p.size(); i++) {
        	   pw.println("Pasajero: " + p.get(i).getNombre() + ";");
           	}
 
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
	
	
	
	
	/*
	 * Metodo para leer el fichero generado
	 */
	public static void leerFichero() {
		
		 File archivo = null;
	     FileReader fr = null;
	     BufferedReader br = null;
	 
	     try {
	    	 // Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			archivo = new File ("pasajeros.txt");
			fr = new FileReader (archivo);
			br = new BufferedReader(fr);
	 
			// Lectura del fichero
			System.out.println("Leyendo el contendio del archivo.txt");
			String linea;
			while((linea=br.readLine())!=null)
				System.out.println(linea);
	        }
	        catch(Exception e){
	           e.printStackTrace();
	        }finally{
	           // En el finally cerramos el fichero, para asegurarnos
	           // que se cierra tanto si todo va bien como si salta 
	           // una excepcion.
	           try{
	              if( null != fr ){
	                 fr.close();
	              }
	           }catch (Exception e2){
	              e2.printStackTrace();
	           }
	        }
	    }
}
