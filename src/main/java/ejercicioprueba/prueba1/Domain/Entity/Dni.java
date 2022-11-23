package ejercicioprueba.prueba1.Domain.Entity;

public class Dni {
	
	private int numero;
	private String localidad;
	
	public Dni(int numero, String localidad) {
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

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	@Override
	public String toString() {
		return "Dni [numero=" + numero + ", localidad=" + localidad + "]";
	}

	
	
	
	
}
