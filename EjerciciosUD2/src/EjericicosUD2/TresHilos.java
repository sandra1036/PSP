package EjericicosUD2;

public class TresHilos extends Thread{

	String texto;
	String cadena;

	public TresHilos(String texto, String cadena) {
		super(texto);
		this.cadena=cadena;
		System.out.println(getName());
	}
	
	public void run() {
			
		
		for (int cont = 0; cont < 5; cont++) {
			System.out.println(cadena+":"+cont);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		TresHilos hilo1=new TresHilos("Creando Hilo1", "Hilo 1C");
		TresHilos hilo2=new TresHilos("Creando Hilo2", "Hilo 2C");
		TresHilos hilo3=new TresHilos("Creando Hilo3", "Hilo 3C");
		hilo1.start();
		hilo2.start();
		hilo3.start();
		System.out.println("Creados 3 Hilos");
	}

}
