package ejercicioprueba.prueba1.Domain.Entity;

public class Producto {
	

	private String nombre;
	

	
	public Producto() {
		super();
	}

	public Producto(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + "]";
	}
	
	
	
	
	
}
