package EjericicosUD2;

public class PrimerHilo extends Thread{

	
	
	
	@Override
	public void run() {
		for (int i = 0; i <=5; i++) {
			System.out.println("En el hilo..."+i);
			
		}
	}
	
	
	public static void main(String[] args) {
		PrimerHilo hilo=new PrimerHilo();
		hilo.start();

	}



}
