package co.edu.iub.interfaces;

import co.edu.iub.excepciones.PrestamoException;

public interface Prestable {

	void prestar() throws PrestamoException;
	void devolver();
	boolean disponible();

}
