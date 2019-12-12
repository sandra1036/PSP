package Ejercicios;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Servidor {

	public static void main(String[] args) throws IOException {
		System.out.println("Estoy en el servidor");
		byte[]byt=new byte[200];
		DatagramPacket pack=new DatagramPacket(byt, byt.length);
		DatagramSocket sock=new DatagramSocket(6000);
		sock.receive(pack);
		
		String mensaje=new String(pack.getData());
		System.out.println("Mensaje del Cliente: "+mensaje);
		
		System.out.println("El puerto del Cliente: "+pack.getPort());
		
		System.out.println("El IP del Cliente: "+pack.getAddress());
		
		int cont=0;
		for (int i = 0; i < mensaje.length(); i++) {
			if(mensaje.charAt(i)=='e') {
				cont++;
			}
				
		}
		System.out.println("Veces que aparece la letra e=> "+cont);
		sock.close();
		

	}

}
