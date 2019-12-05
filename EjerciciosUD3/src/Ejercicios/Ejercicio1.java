package Ejercicios;

import java.net.InetAddress;

public class Ejercicio1 {

	public static void main(String[] args) {
		InetAddress dir=null;
		System.out.println("============================================");
		System.out.println("SALIDA PARA LOCALHOST: ");
		try {
			//Localhost
			dir=InetAddress.getByName("localhost");
			pruebaMetodos(dir);
			
			//URL www.google.es
			System.out.println("=======================================");
			System.out.println("Salida para una URL:");
			dir=InetAddress.getByName("www.google.es");
			pruebaMetodos(dir);
			
			//Array de tipo InetAdress con todas las direcciones IP
			//asignadas a google.es
			System.out.println("\tDirecciones IP para: "+dir.getHostName());
			InetAddress[]direcciones=InetAddress.getAllByName(dir.getHostName());
			
			for (int i = 0; i < direcciones.length; i++) {
				System.out.println("\t\t"+direcciones[i].toString());
				
			}
			System.out.println("===========================================");
			
			
		} catch (Exception e) {
			e.printStackTrace();
	}
}



private static void pruebaMetodos(InetAddress dir) {
	System.out.println("\tMetodo getByName(): "+dir);
	InetAddress dir2;
	try {
		dir2=InetAddress.getLocalHost();
		System.out.println("\tMetodo getLocalHost(): "+dir2);
	} catch (Exception e) {
			e.printStackTrace();
	}
	//Usamos métodos de la clase
	System.out.println("\tMetodo getHostName(): "+dir.getHostName());
	System.out.println("\tMetodo getHostAdress(): "+dir.getHostAddress());
	System.out.println("\tMetodo toString(): "+dir.toString());
	System.out.println(" \tMetodo getCanonicalHostName():"+ dir.getCanonicalHostName());
	
	
	
	
	}
}
