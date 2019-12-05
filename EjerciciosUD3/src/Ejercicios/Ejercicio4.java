package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Ejercicio4 {

	public static void main(String[] args) {
		URL url=null;
		URLConnection urlCon;
		try {
			url=new URL("http://www.elaltozano.es");
			urlCon=url.openConnection();
			
			BufferedReader in;
			InputStream inputStrem=urlCon.getInputStream();
			in=new BufferedReader(new InputStreamReader(inputStrem));
			String inputLine;
			
			while((inputLine=in.readLine()) !=null) {
				System.out.println(inputLine);
			}
			in.close();
			
			
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
