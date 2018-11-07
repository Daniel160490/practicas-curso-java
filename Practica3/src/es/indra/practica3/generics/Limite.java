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
	
	public <U extends Number> void revision(U u) {
		System.out.println("T es de tipo " + t.getClass().getName());
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("+---------- EJEMPLO DE LIMITE  -- GENERICS -------------+");
		Limite <Integer> caja1 = new Limite <Integer>();
		caja1.setT(34);
		caja1.revision(35);
		System.out.println(caja1.getT());
		
		
		Limite <Double> caja11 = new Limite <Double>();
		caja11.setT(34d);
		caja11.revision(35d);
		System.out.println(caja11.getT());
		
		
		Limite <String> caja2 = new Limite <>();
		caja2.setT("Hola");
		caja2.revision(22d);
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
