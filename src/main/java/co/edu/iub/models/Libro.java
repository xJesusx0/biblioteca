package co.edu.iub.models;

import co.edu.iub.excepciones.PrestamoException;
import co.edu.iub.interfaces.Prestable;

public class Libro extends Material implements Prestable {
	private String editorial;
	private String año;

	public Libro(Integer id, String nombre, String descripcion, String autor, Integer stock, String editorial, String año) {
		super(id, nombre, descripcion, autor, stock);
		this.editorial = editorial;
		this.año = año;
	}

	public Libro(String editorial, String año) {
		this.editorial = editorial;
		this.año = año;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getAño() {
		return año;
	}

	public void setAño(String año) {
		this.año = año;
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
		return "Editorial: " + editorial + "\n"
				+ "Año: " + año;
	}
}
