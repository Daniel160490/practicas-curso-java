/**
 * 
 */
package flujos;

import java.util.Scanner;
/**
 * @author Daniel Garcia
 *
 */
public class ScannerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor, introduzca su nombre: ");
		
		String nombre = scanner.nextLine();
		System.out.println("\nMuchas gracias, " + nombre + ".");
		
		System.out.println("Introduzca su edad: ");
		int edad = scanner.nextInt();
		
		System.out.println("Introduzca su saldo disponible: ");
		double disponible = scanner.nextDouble();
		
		System.out.println("-- IMPRESION DE DATOS RECOGIDOS --");
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Saldo disponible: " + disponible);
		System.out.println("");
		
	}

}
