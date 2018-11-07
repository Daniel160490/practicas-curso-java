/**
 * 
 */
package es.indra.aerolineas.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author P.era-1
 *
 */
public class ReadFile {

	/*
	 * Metodo para leer informacion de un fichero
	 * Utiliza la sentencia try/catch para contemplar posibles errores.
	 * 
	 */
	public List<String> retornarVuelos() {
		
		List<String> vuelos = new ArrayList();
		//Ruta en Windows: C:/Users/P.era-1/repositorios/CursoJava/vuelos.txt
		//Ruta en Mac: /Users/daniel/Desktop/Curso/practicas-curso-java
		Path path = Paths.get("C:/Users/P.era-1/repositorios/CursoJava/vuelos.txt");
		
		
		try {
			
			vuelos = Files.readAllLines(path);
			return vuelos;
			//List <String> contenido = Files.readAllLines(path);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return vuelos;
	}
	
	/*
	public static void main(String []args) {
		ReadFile r = new ReadFile();
		r.retornarVuelos();
	}*/
}
