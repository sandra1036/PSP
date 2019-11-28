package Ejercicio1;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	
	 private static DataOutputStream op;
	    private static DataInputStream is;
	    public static void main(String[] args) throws IOException {
	        ServerSocket server= new ServerSocket(9999);
	        System.out.println("Esperando comunicacion del cliente");
	        Socket s=server.accept();
	        is= new DataInputStream(s.getInputStream());
	        String st=is.readUTF();
	        
	        op= new DataOutputStream(s.getOutputStream());
	        op.writeUTF(st.toUpperCase());
	        
	        server.close();
	    }
}


