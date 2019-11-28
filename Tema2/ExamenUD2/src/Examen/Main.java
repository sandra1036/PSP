package Examen;

import java.util.Scanner;

public class Main extends Thread{

	
	public static void main(String[] args) {
		
		Scanner tcl=new Scanner(System.in);
		System.out.println("¿Qué eres un alumno/profesor?");
		String op=tcl.nextLine();
		
			
		if(op.equals("alumno")) {
			
			PrimerHilo primerHilo=new PrimerHilo();
			primerHilo.start();
		
		}
		
		if(op.equals("profesor")) {
			
		SegundoHilo segundoHilo=new SegundoHilo();
		segundoHilo.start();
		
		}
		
	}

	
	
	
}
