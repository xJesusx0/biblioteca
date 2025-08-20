package co.edu.iub.models;

/**
 * Clase base para los materiales de la biblioteca.
 * Contiene atributos comunes como id, nombre, descripción, autor y stock.
 */
public abstract class Material {

	private Integer id;
	private String nombre;
	private String descripcion;
	private String autor;
	private Integer stock;

	protected Material(Integer id, String nombre, String descripcion, String autor, Integer stock) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.autor = autor;
		this.stock = stock;
	}

	protected Material() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public abstract String mostrarDetalles();

	@Override
	public String toString() {
		return this.getNombre();
	}
}
