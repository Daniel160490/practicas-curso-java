/**
 * 
 */
package es.indra.practica3.main;

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
		
		Limite <Integer> caja1 = new Limite <Integer>();
		caja1.setT(34);
		System.out.println(caja1.getT());
		
		
		Limite <String> caja2 = new Limite <>();
		caja2.setT("Hola");
		System.out.println(caja2.getT());
	}

}
