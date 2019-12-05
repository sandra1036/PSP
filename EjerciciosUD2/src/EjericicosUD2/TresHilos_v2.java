package EjericicosUD2;

public class TresHilos_v2 extends Thread{
	
	String  texto;
	String cadena;

	public TresHilos_v2(String texto, String cadena) {
		super(texto);
		this.cadena=cadena;
		System.out.println(getName());
	}
	
	public void run() {
			
		
		for (int cont = 0; cont < 5; cont++) {
			System.out.println(cadena+":"+cont);
		}
	}
	
}
