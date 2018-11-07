/**
 * 
 */
package es.indra.practica3.generics;

/**
 * @author Daniel Garcia
 * Ejemplo de Generics
 *
 */
public class Limite<T> {

	private T t;
	
	
	public T getT() {
		return t;
	}
	
	public void setT(T t) {
		this.t = t;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("+---------- EJEMPLO DE LIMITE  -- GENERICS -------------+");
		Limite <Integer> caja1 = new Limite <Integer>();
		caja1.setT(34);
		System.out.println(caja1.getT());
		
		
		Limite <String> caja2 = new Limite <>();
		caja2.setT("Hola");
		System.out.println(caja2.getT());
		
		
		/*
		 * 
		 * MAIN DE LA CLASE PAIR
		 * 
		 */
		System.out.println("+---------- EJEMPLO DE PAIR  -- GENERICS -------------+");
		Pair <Integer, String> p1 = new OrderedPair<>(1, "Rojo");
		System.out.println(p1.getValue());
		Pair <Float, String> p2 = new OrderedPair<>(2f, "Azul");
		System.out.println(p2.getValue());
	}

}
