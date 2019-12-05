package Ejercicios;

public class Hilo2 extends Thread{

	@Override
	public void run() {
	 int n;

		for (n=1;n<=10;n++){
			if (n % 2 != 0)
			 System.out.print("Numero Impar:"+n+"\n");
		}
	}
}
