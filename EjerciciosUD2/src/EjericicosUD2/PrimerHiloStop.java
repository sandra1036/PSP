package EjericicosUD2;

public class PrimerHiloStop extends Thread{

		boolean entry=true;
		
		
		@Override
		public void run() {
		  while(entry) {	
			for (int i = 0; i <=5; i++) {
				System.out.println("En el hilo..."+i);
				
			}
			
		}
		  
	}
		public  void detener() {
		    entry = false;
		    System.out.println("se ha detenido el hilo");
		}
		
		
		public static void main(String[] args) {
			PrimerHiloStop hilo=new PrimerHiloStop();
			hilo.start();
			hilo.detener();
		}

	}


