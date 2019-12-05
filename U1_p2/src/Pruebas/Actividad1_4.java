package Pruebas;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Actividad1_4 {

   public static void main(String[]args) throws IOException {
	   
	  Process p;
	  File directorio=new File("/home/sanoro/eclipse-workspace/U1_p2/bin");
	  ProcessBuilder pb=new ProcessBuilder("java","Pruebas.LeerNombre","hola");
	   
	  pb.directory(directorio);
	  
	  p=pb.start();
	  
	 try {
		 
		 InputStream in=p.getInputStream();
		 
		 int c;
		 
		 while((c=in.read()) !=-1){
			 
			 System.out.print((char) c);
			 
		 }
		 
		 in.close();
		 
	 } catch (Exception e) {
		 
		e.printStackTrace();
		
	 } 
	  
	   
   }
	
}
