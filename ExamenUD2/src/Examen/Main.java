package Examen;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner tcl=new Scanner(System.in);
		System.out.println("¿Qué eres un alumno/profesor?");
		String op=tcl.nextLine();
		
			
		if(op.equals("alumno")) {//aqui entra el alumno
			
			PrimerHilo primerHilo=new PrimerHilo();// crea el primer hilo
			primerHilo.start();//ejecuta el run del 1 hilo
		
		}
		
		if(op.equals("profesor")) {//aqui entra el profesor
			
		SegundoHilo segundoHilo=new SegundoHilo();//se crea el segundo hilo
		segundoHilo.start(); //ejecuta el run del segundo hilo
		
		}
		
	}

	
	
	
}
