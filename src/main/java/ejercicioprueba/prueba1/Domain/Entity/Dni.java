package ejercicioprueba.prueba1.Domain.Entity;

public class Dni {
	
	private int numero;
	private int localidad;
	
	public Dni(int numero, int localidad) {
		super();
		this.numero = numero;
		this.localidad = localidad;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getLocalidad() {
		return localidad;
	}

	public void setLocalidad(int localidad) {
		this.localidad = localidad;
	}

	@Override
	public String toString() {
		return "Dni [numero=" + numero + ", localidad=" + localidad + "]";
	}

	
	
	
	
}
