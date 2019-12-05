package EjericicosUD2;

public class CincoHilos extends Thread{
	
		String texto;
		String cadena;
	
		public CincoHilos(String texto,String cadena) {
			super(texto);
			this.cadena=cadena;
			System.out.println(getName());
			
		}
	
	
		public void run() {
			
			for (int cont = 0; cont < 2; cont++) {
				System.out.println(cadena+":"+cont);
			}
		}
	

	public static void main(String[] args) {
		CincoHilos hilo1=new CincoHilos("Creando Hilo1", "Hilo 1C");
		CincoHilos hilo2=new CincoHilos("Creando Hilo2", "Hilo 2C");
		CincoHilos hilo3=new CincoHilos("Creando Hilo3", "Hilo 3C");
		CincoHilos hilo4=new CincoHilos("Creando Hilo4","Hilo 4C");
		CincoHilos hilo5=new CincoHilos("Creando Hilo5","Hilo 5Cs");
		hilo1.start();
		hilo2.start();
		hilo3.start();
		hilo4.start();
		hilo5.start();
	}

}
