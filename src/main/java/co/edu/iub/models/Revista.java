package co.edu.iub.models;

/**
 * Representa una revista en la biblioteca.
 * Extiende Material e implementa la interfaz Prestable.
 */
public class Revista extends Material {

	private String edicion;
	private String periodicidad;

	public Revista() {}

	public Revista(Integer id, String nombre, String descripcion, String autor, Integer stock, String edicion, String periodicidad) {
		super(id, nombre, descripcion, autor, stock);
		this.edicion = edicion;
		this.periodicidad = periodicidad;
	}

	public Revista(String edicion, String periodicidad) {
		this.edicion = edicion;
		this.periodicidad = periodicidad;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public String getPeriodicidad() {
		return periodicidad;
	}

	public void setPeriodicidad(String periodicidad) {
		this.periodicidad = periodicidad;
	}

	@Override
	public String mostrarDetalles() {
		return "Edicion: " + edicion + "\n"
				+ "Periodicidad: " + periodicidad;
	}
}
