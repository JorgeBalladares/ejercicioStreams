package ejercicioprueba.prueba1.Domain.Entity;

import java.time.LocalDate;

public class Comprador {
	
	private String nombre;
	private String apellido;
	private LocalDate date;
	private Dni dni;
	
	public Comprador() {
		super();
	}

	public Comprador(String nombre, String apellido, LocalDate date, Dni dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.date = date;
		this.dni = dni;
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

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Dni getDni() {
		return dni;
	}

	public void setDni(Dni dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Comprador [nombre=" + nombre + ", apellido=" + apellido + ", date=" + date + ", dni=" + dni + "]";
	}
	
	
	
		
}
