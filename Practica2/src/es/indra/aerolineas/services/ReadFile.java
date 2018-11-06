/**
 * 
 */
package es.indra.aerolineas.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author P.era-1
 *
 */
public class ReadFile {

	/*
	 * Método para leer información de un fichero
	 * Utiliza la sentencia try/catch para contemplar posibles errores.
	 * 
	 */
	public void retornarVuelos() {
		
		Path path = Paths.get("C:/Users/P.era-1/repositorios/CursoJava/vuelos.txt");
		try {
			
			//Recorre el contenido del fichero que hemos seleccionado anteriormente
			List <String> contenido = Files.readAllLines(path);
			System.out.println(contenido);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	public static void main(String []args) {
		ReadFile r = new ReadFile();
		r.retornarVuelos();
	}*/
}
