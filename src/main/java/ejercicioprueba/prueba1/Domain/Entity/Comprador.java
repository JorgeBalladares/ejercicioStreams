package ejercicioprueba.prueba1.Domain.Entity;

import java.util.List;

public class Comprador {
	
	private String nombre;
	private String apellido;
	private Dni dni;
	private List<Producto> productos;
	
	public Comprador() {
		super();
	}

	public Comprador(String nombre, String apellido, Dni dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	

	public Comprador(String nombre, String apellido, Dni dni, List<Producto> productos) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.productos = productos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Dni getDni() {
		return dni;
	}

	public void setDni(Dni dni) {
		this.dni = dni;
	}
	
	

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "Comprador [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
	}

	
	
	
	
		
}
