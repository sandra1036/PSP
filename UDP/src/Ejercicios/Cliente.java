package Ejercicios;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Cliente {

	public static void main(String[] args) throws IOException {
		System.out.println("Estoy en el cliente");
		byte[]byt = new byte[200];
		String mensaje="Escribiendo desde el cliente";
		InetAddress ip = InetAddress.getByName("localhost");
		byt=mensaje.getBytes();
		
		DatagramPacket dat=new DatagramPacket(byt, byt.length, ip, 6000);
		DatagramSocket sock=new DatagramSocket();
		System.out.println("Enviando datagrama");
		
		int cont=0;
		byte[] mensajecont=mensaje.getBytes();
		cont=mensajecont[0];
		
		System.out.println("Caracteres que son e => "+cont);
		
		
		sock.send(dat);
		sock.close();
		


	}

}

