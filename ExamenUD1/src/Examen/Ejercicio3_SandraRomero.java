package Examen;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Ejercicio3_SandraRomero {

	public static void main(String[] args,File fileSal) throws IOException {
		File directorio =new File("/home/sanoro/eclipse-workspace/ExamenUD1/Examen");
		Process p;
		File classpath=new File("/home/sanoro/eclipse-workspace/ExamenUD1/Examen.Ejercicio3_SandraRomero");
		ProcessBuilder pb=new ProcessBuilder("\bin\bash","-c","classpath","ps");

		p=pb.start();
		pb.directory();//para decirle donde esta el fichero
		pb.redirectInput(fileSal);//para que lo ponga en el fichero		
		

	}

}
