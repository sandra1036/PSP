package Ejercicios;

public class Ejercicio1 extends Thread{
	
	public static void main(String[] args) {

		Hilo1 hilo1=new Hilo1();
		hilo1.start();
		
		Hilo2 hilo2=new Hilo2();
		hilo2.start();
		
		
		
	}

	
	
	
}
