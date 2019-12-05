package Ejercicios;

public class Hilo1 extends Thread{

	@Override
	public void run() {

		int n;
			for ( n = 0; n < 10; n++) {
				if(n%2==0) {
				System.out.println("Numero par: "+n);
				}
			}
		
	}


}

