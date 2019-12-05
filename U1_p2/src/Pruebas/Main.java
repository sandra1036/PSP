package Pruebas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static final int NUM_PROCESOS=4;
    static final String PREFIJO_FICHEROS="fich";


    public static void lanzarSumador(
                    int n1, int n2,String fichResultados) throws IOException{
            String comando;
            comando="Pruebas.Sumador";

            File directorioSumador;
            directorioSumador=new File("/home/sanoro/eclipse-workspace/U1_p2/bin");
            File fichResultado=new File(fichResultados);
            ProcessBuilder pb;
            pb=new ProcessBuilder("java",comando,String.valueOf(n1),String.valueOf(n2));
            
            pb.directory(directorioSumador);//Donde coge la ruta
            pb.redirectOutput(fichResultado);//Es donde se crea el fichero 
            
            pb.start();//Crea el proceso
    }

    public static int getResultadoFichero(
                    String nombreFichero){

            int suma=0;
            
            try {
                    FileInputStream fichero=
                                    new FileInputStream(
                                                    nombreFichero);//Inserta valores en los ficheros
                    InputStreamReader fir=
                                    new InputStreamReader(
                                                    fichero); //Lee esos valores del fichero
                    BufferedReader br=new BufferedReader(fir);
                    String linea=br.readLine();//lee los valores introducidos en una nueva linea
                    suma= new Integer(linea);
                    return suma;
                    
            } catch (FileNotFoundException e){
            	
                    System.out.println("No se pudo abrir "+nombreFichero);
                    

            } catch (IOException e) {
            	
                    System.out.println("No hay nada en "+nombreFichero);
                    
            }
            
            return suma;
    }


    public static int getSumaTotal(int numFicheros){
    	
            int sumaTotal=0;
            for (int i=1; i<=NUM_PROCESOS;i++){
            	
                    sumaTotal+=getResultadoFichero(PREFIJO_FICHEROS+String.valueOf(i));
            }
            
            return sumaTotal;
    }

    /* Recibe dos parámetros y hará
     * la suma de los valores comprendidos
     * entre ambos parametros
     */
    public static void main(String[] args) throws IOException, InterruptedException{
    	
            int n1=Integer.parseInt(args[0]);
            int n2=Integer.parseInt(args[1]);
            
            int salto=( n2 / NUM_PROCESOS ) - 1;
            
            for (int i=1;i<=NUM_PROCESOS; i++){
            	
                    System.out.println("n1:"+n1);
                    int resultadoSumaConSalto=n1+salto;
                    System.out.println("n2:"+resultadoSumaConSalto);
                    lanzarSumador(n1, n1+salto ,PREFIJO_FICHEROS+String.valueOf(i));
                    n1=n1 + salto + 1;
                    System.out.println("Suma lanzada...");
                    
            }
            
            Thread.sleep(5000); // El proceso se para temporalmente
            int sumaTotal=getSumaTotal(NUM_PROCESOS);
            System.out.println("La suma total es:"+ sumaTotal);
    }
}
