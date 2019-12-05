package Examen;

import java.util.ArrayList;
import java.util.Scanner;


public class PrimerHilo extends Thread{
	String nombre,apellido,dni;
	Scanner tcl=new Scanner(System.in);
	public static ArrayList<String>array=new ArrayList<String>();//creo un array para guardar los datos que me introduce
	@Override
	public void run() {
	
			System.out.println("Introduce tu nombre: ");
			nombre=tcl.nextLine();//pido el nombre
			System.out.println("Introduce tu apellido");
			apellido=tcl.nextLine();//pido el apellido
			System.out.println("Introduce tu dni:");
			dni=tcl.nextLine();//pido el dni
			
			array.add(nombre);
			array.add(apellido);
			array.add(dni);
			
			System.out.println(array);
			
	}
	

}
