package Pruebas;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Ejemplo2Or {



		public static void main(String[] args) throws IOException{
	        ProcessBuilder pb=new ProcessBuilder("/bin/bash","-c","dir");
			Process p = null;
			try {
				

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
	
	
	
	
	

