package co.edu.iub.models;

import co.edu.iub.excepciones.PrestamoException;
import co.edu.iub.interfaces.Prestable;

/**
 * Representa un cómic en la biblioteca.
 * Extiende Material e implementa la interfaz Prestable.
 * Incluye atributos de género y edición.
 */
public class Comic extends Material implements Prestable {

	private String genero;
	private String edicion;

	public Comic(Integer id, String nombre, String descripcion, String autor, Integer stock, String genero, String edicion) {
		super(id, nombre, descripcion, autor, stock);
		this.genero = genero;
		this.edicion = edicion;
	}

	public Comic(String genero, String edicion) {
		this.genero = genero;
		this.edicion = edicion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	@Override
	public void prestar() throws PrestamoException {
		if(this.disponible()){
			setStock(getStock() - 1);
		} else {
			throw new PrestamoException("No hay stock disponible para prestar este libro.");
		}
	}

	@Override
	public void devolver() {
		setStock(getStock() + 1);
	}

	@Override
	public boolean disponible() {
		return getStock() > 0;
	}

	@Override
	public String mostrarDetalles() {
		return "Edicion: " + edicion + "\n"
				+ "Genero: " + genero;
	}
}
