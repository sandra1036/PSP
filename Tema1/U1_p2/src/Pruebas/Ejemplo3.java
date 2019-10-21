package Pruebas;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Ejemplo3 {

	public static void main(String[] args) throws IOException {
		//Creamos el objeto File al directorio donde esta ejemplo2
		
		File directorio=new File("/home/sanoro/eclipse-workspace/U1_p2/bin");
		
		//El proceso a ejecutar (Ejemplo2)
		
		ProcessBuilder pb=new ProcessBuilder("java","Pruebas.Ejemplo2Or");
		
		//Se establece el directorio donde se encuentra el ejecutable
		pb.directory(directorio);
		
		System.out.printf("Directorio de trabajo: %s%n",pb.directory());

		//se ejecuta el proceso
		Process p=pb.start();
		
		//obtener la salida devuelta del proceso
		
		try {
			
			InputStream is=p.getInputStream();
			int c;
			
			while((c= is.read()) !=-1) {
				
				System.out.print((char) c);
				
			}
			
			is.close();
		} catch (Exception e) {
			
			 e.printStackTrace();
		}
	}

}
