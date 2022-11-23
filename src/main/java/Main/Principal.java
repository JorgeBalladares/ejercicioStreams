package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import ejercicioprueba.prueba1.Domain.Entity.Comprador;
import ejercicioprueba.prueba1.Domain.Entity.Dni;
import ejercicioprueba.prueba1.Domain.Entity.Producto;

public class Principal {
	
	public static void main(String[] args) {
		int a;
		List<Comprador> compradores = creaListCompradores();
		
		do{
            a = muestraOpciones();

            switch (a) {
                case 1:
                	mostarCompradores(compradores);
                	break;
                case 2:
                	mostrarCompradorDni(compradores);
                	break;
                case 3: 
                	anadirProductoComprador(compradores);
                	break;
                case 4: 
                	mostrarTotalProductoDni(compradores);
                	break;
                case 5: 
                	mostrarMaxCompradores(compradores);
                	break;
                case 6: 
                	mostrarUltimoComprador(compradores);
                	break;
                case 7: 
                	System.out.println("ADIOS!!!");
                	break;

                default: 
                	System.out.println("This options is not allowed");
            }
        }while(a!=7);
		
		
		
	}
	
	public static List<Comprador> creaListCompradores(){
		
		List<Comprador> compradores = new ArrayList<>();
		
		Dni dni1 = new Dni(12345, "Madrid");
		Dni dni2 = new Dni(123456, "Málaga");
		Dni dni3 = new Dni(12345678, "Córdoba");
		
		Comprador c1 = new Comprador("Jorge", "Balladares", dni1, new ArrayList<>());
		Comprador c2 = new Comprador("Juan", "Martinez", dni2, new ArrayList<>());
		Comprador c3 = new Comprador("Pedro", "Ruiz", dni3, new ArrayList<>());
		
		compradores.add(c1);
		compradores.add(c2);
		compradores.add(c3);
		return compradores;
	}
	
	public static int muestraOpciones() {
		
		Scanner scan = new Scanner(System.in);
		int salida = 0;
		
		System.out.println("--------Menu--------");
		System.out.println("1. Mostrar lista de compradores");
		System.out.println("2. Mostrar comprador asociado al dni");
		System.out.println("3. Añadir producto a comprador asociado a dni");
		System.out.println("4. Mostrar el total de productos asociados a un dni de comprador");
		System.out.println("5. Obtener compradores con más productos comprados (mínimo 3 productos)");
		System.out.println("6. Muestra último compardor: ");
		System.out.println("7. Salir: ");
		System.out.print("Introduce tu opción: ");
		
		salida = scan.nextInt();
		return salida;
		
	}
	
	public static void mostarCompradores(List<Comprador> compradores) {
		
		Stream<Comprador> compradoresStream = compradores.stream();
		compradoresStream.forEach(singleComprador -> System.out.println(singleComprador));
		
	}
	
	
	
	public static void mostrarCompradorDni(List<Comprador> compradores) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el dni (valor numérico): ");
		int numero = scan.nextInt();
		
		Stream<Comprador> compradoresStream = compradores.stream();
		compradoresStream.filter(singleComprador -> singleComprador.getDni().getNumero() == numero).
		forEach(singleComprador -> System.out.println(singleComprador));
		
	}
	
	
	public static void anadirProductoComprador(List<Comprador> compradores) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el dni del comprador (valor numérico): ");
		int numero = scan.nextInt();
		System.out.println("Introduce el nombre del producto: ");
		String nombreProducto = scan.next();
		Producto p = new Producto(nombreProducto);
		
		Stream<Comprador> compradoresStream = compradores.stream();
		
		compradoresStream.filter(singleComprador -> singleComprador.getDni().getNumero() == numero).
		forEach(singleComprador -> {
			if(singleComprador.getProductos().isEmpty()) {
				List<Producto> producto = new ArrayList<>();
				singleComprador.setProductos(producto);
				producto.add(p);
			}else {
				List<Producto> producto = singleComprador.getProductos();
				producto.add(p);
			}
			
			System.out.println(singleComprador.getProductos());
		});
	}
	
	
	public static void mostrarTotalProductoDni(List<Comprador> compradores) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el dni del comprador (valor numérico): ");
		int numero = scan.nextInt();
		
		Stream<Comprador> compradoresStream = compradores.stream();
		
		compradoresStream.filter(singleComprador -> singleComprador.getDni().getNumero() == numero).
		forEach(singleComprador -> {
			if(singleComprador.getProductos().isEmpty()) {
				System.out.println("Este comprador no comprado aún productos");
			}else {
				System.out.println(singleComprador.getProductos());
			}
		
		});
		
	}
	
	
	public static void mostrarMaxCompradores(List<Comprador> compradores) {
		
		Stream<Comprador> compradoresStream = compradores.stream();
		compradoresStream.forEach(singleComprador -> {
			if(singleComprador.getProductos().isEmpty()) {
			}else {
				if(singleComprador.getProductos().size()>3) {
					System.out.println("El comprador "+singleComprador.getNombre()+ " ha realizado más de 3 compras, un total de "+singleComprador.getProductos().size());
				}
			}
		});
			
	}
	
	
	public static void mostrarUltimoComprador(List<Comprador> compradores) {
		
		Stream<Comprador> compradoresStream = compradores.stream();
		compradoresStream.skip((compradores.size()-1)).forEach(singleComprador -> System.out.println(singleComprador));
	}
	
}
