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
	 * M�todo para leer informaci�n de un fichero
	 * Utiliza la sentencia try/catch para contemplar posibles errores.
	 * 
	 */
	public void retornarVuelos() {
		
		//Ruta en Windows: C:/Users/P.era-1/repositorios/CursoJava/vuelos.txt
		//Ruta en Mac: /Users/daniel/Desktop/Curso/practicas-curso-java
		Path path = Paths.get("C:/Users/P.era-1/repositorios/CursoJava/vuelos.txt");
		
		
		try {
		
			//Recorre el contenido del fichero que hemos seleccionado anteriormente
			List <String> contenido = Files.readAllLines(path);
			
			/*
			 * Recorre el array de contenido y lo convierte en un String cadena
			 * Al imprimir el contenido lo separa directamente
			 */
			for(String cadena: contenido) {
				System.out.println(cadena);
			}
			
			//System.out.println(contenido.split());
			
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
