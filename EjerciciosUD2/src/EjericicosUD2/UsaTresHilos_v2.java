package EjericicosUD2;

public class UsaTresHilos_v2 extends Thread{

	public static void main(String[] args) {
		TresHilos_v2 hilo1=new TresHilos_v2("Creando Hilo1", "Hilo 1C");
		TresHilos_v2 hilo2=new TresHilos_v2("Creando Hilo2", "Hilo 2C");
		TresHilos_v2 hilo3=new TresHilos_v2("Creando Hilo3", "Hilo 3C");
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
		System.out.println("Creados 3 Hilos");
	}
	
}
