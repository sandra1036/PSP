package Pruebas;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Ejemplo2 {

	public static void main(String[] args) throws IOException{
        ProcessBuilder pb=new ProcessBuilder("/bin/bash","-c","dir");
		Process p = null;
		try {
			
			File fichResulEje2=new File("/home/sanoro/eclipse-workspace/U1_p2/bin");
			pb.redirectError(new File("fiErrorEje2.txt"));
			pb.redirectOutput(new File("ficResultEje2.txt"));
			 p=pb.start();
			
			InputStream is=p.getInputStream();
			
			int c;
			
			while ((c =is.read()) !=-1){
				
				System.out.print((char) c);
			}
			
			is.close();
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		int exitVal;
		
		try {
			
			exitVal = p.waitFor();//Recoge la salida del System.exit()
			System.out.println("Valor de salida "+ exitVal);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
