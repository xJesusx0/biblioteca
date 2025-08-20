package co.edu.iub.interfaces;

import co.edu.iub.excepciones.PrestamoException;

/**
 * Interfaz que define el comportamiento de los materiales que pueden ser prestados y devueltos.
 */
public interface Prestable {

	void prestar() throws PrestamoException;
	void devolver();
	boolean disponible();

}
