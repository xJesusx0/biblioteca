package co.edu.iub.services;

import co.edu.iub.models.Comic;
import co.edu.iub.models.Libro;
import co.edu.iub.models.Material;
import co.edu.iub.models.Revista;

import java.util.ArrayList;
import java.util.List;

public class ServicioMaterial {

	private static ServicioMaterial instancia;
	private final List<Material> materiales = new ArrayList<>();

	private ServicioMaterial() {
		Libro libro = new Libro(
				1,
				"El Principito",
				"Un libro sobre un niño que viaja por el universo",
				"Antoine de Saint-Exupéry",
				10,
				"Editorial ABC",
				"1943"
		);

		Comic comic = new Comic(
				2,
				"Spiderman",
				"Un comic sobre un superhéroe arácnido",
				"Stan Lee",
				5,
				"Superhéroe",
				"Edición Especial 2023"
		);

		Revista revista = new Revista(
				3,
				"National Geographic",
				"Revista sobre naturaleza y ciencia",
				"National Geographic Society",
				15,
				"Edición de Octubre 2023",
				"Mensual"
		);

		materiales.addAll(List.of(libro, comic, revista));
	}

	public static ServicioMaterial getInstancia() {
		if (instancia == null) {
			instancia = new ServicioMaterial();
		}
		return instancia;
	}

	public List<Material> getMateriales() {
		return materiales;
	}

	public List<Material> buscarPorNombre(String nombre){
		return materiales.stream()
				.filter(material ->
						material.getNombre().toLowerCase()
								.contains(nombre.toLowerCase()))
				.toList();
	}

	public List<Material> buscarPorAutor(String autor) {
		return materiales.stream()
				.filter(material ->
						material.getAutor().toLowerCase()
								.contains(autor.toLowerCase()))
				.toList();
	}

	public List<Material> buscarPorNombreYAutor(String nombre, String autor){
		return materiales.stream()
				.filter(material ->
						material.getNombre()
								.toLowerCase().contains(nombre.toLowerCase()) &&
						material.getAutor().toLowerCase()
								.contains(autor.toLowerCase()))
				.toList();
	}

}