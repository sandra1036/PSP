package Ejercicio1;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {
    private static DataInputStream is;
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket cli = new Socket("localhost",9999);
        System.out.println("Conectado con el servidor");
        
        String c ="Un saludo";
        
        DataOutputStream op= new DataOutputStream(cli.getOutputStream());
        op.writeUTF(c);
        is= new DataInputStream(cli.getInputStream());
        System.out.println("Mensaje recibido:"+is.readUTF());
        cli.close();
    }
	
}
