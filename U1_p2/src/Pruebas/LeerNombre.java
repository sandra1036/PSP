package Pruebas;
/*Crea un programa Java llamado LeerNombre.java que reciba desde argumentos de main()
 * un  nombre y lo visualice en pantalla. Utiliza System.exit(1) para una finalización correcta del 
 * programa y System.exit(-1)para el caso que no se hayan introducido los argumentos correctos en 
 * main()
 * 
 * A continuación, haz un programa parecido a Ejemplo3.java para ejecutar LeerNombre.java.
 * Utiliza el método waitFor() para comprobar el valor de salida del proceso que se ejecuta. Prueba
 * la ejecución del programa dando valor a los argumentos de main() y sin darle valor. ¿Qué valor
 * devuelve waitFor() en un caso y en el otro?
 * 
 */

public class LeerNombre {

	  
	public static void main(String[] args){
           
		  System.out.println(args[0]);
		   
		System.exit(1);
		
	   }
}
	
	
	
	
	
	
	
	
	
	
	
