/**
 * 
 */
package hilos;

/**
 * @author Daniel Garcia
 *
 */
public class Implementando implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		
		System.out.println("Dentro de un run de runnable");
		
	}

	public static void main(String[] args) {
		
		Implementando i = new Implementando();
		i.run();
	}
}
