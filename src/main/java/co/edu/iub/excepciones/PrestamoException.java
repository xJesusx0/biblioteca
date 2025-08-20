package co.edu.iub.excepciones;

/**
 * Excepcion lanzada al ocurrir un error durante el proceos
 * de prestamo de un material
 */
public class PrestamoException extends RuntimeException {
	public PrestamoException(String message) {
		super(message);
	}
}
