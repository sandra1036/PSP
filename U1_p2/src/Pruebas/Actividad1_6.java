package Pruebas;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class Actividad1_6 {
	public static void main(String []args) {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		File directorio=new File("/home/sanoro/eclipse-workspace/U1_p2/bin");
		Process p;
		ProcessBuilder processBuilder=new ProcessBuilder("java","Pruebas.EjemploLectura");
		processBuilder.directory(directorio);
		
	try {
		p=processBuilder.start();
		int resul=0;
		System.out.println("Intoduce los numeros a SUMAR");
		System.out.println("Intoduce el primer número: ");
		int num1=Integer.parseInt(br.readLine());
		System.out.println("Intoduce el segundo número: ");
		int num2=Integer.parseInt(br.readLine());
		
		resul=num1 +num2;
		
		System.out.println("El resultado es: "+resul);
		
	}catch(Exception e){
		e.printStackTrace();
	}
		
		
	}
}
