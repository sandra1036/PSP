package Examen;

import java.util.ArrayList;
import java.util.Scanner;

public class SegundoHilo extends Thread{
	String nombre,apellido,dni;
	ArrayList<Integer>arrayNotas=new ArrayList<Integer>();//donde meto las notas
	Scanner tcl=new Scanner(System.in);
	int num,notas,notM=0;
	String op,op2;
	@Override
	public void run() {
		System.out.println("¿Qué desea instertar datos o notas?");//pido si quiere notas o meter datos
		op=tcl.nextLine();
		
		if(op.equals("datos")) {//para no volver a hacerlo llamo al otro hilo de la otra clase
			PrimerHilo p1=new PrimerHilo();
			p1.start();
		}else {
		
		
		System.out.println("¿Cuantas notas desea insertar?");//pide las notas que deseas insertar
		num=tcl.nextInt();//num de notas
		for (int i = 0; i < num; i++) {
			System.out.println("Nota:");//pido la nota
			notas=tcl.nextInt();//las introduzco
			arrayNotas.add(notas);//y las añado al array
			notM=notM+arrayNotas.get(i);//sumo las notas
		}
		Scanner tcl=new Scanner(System.in);
		System.out.println("¿Quieres hacer la media? s/n");
		op2=tcl.nextLine();
		
		if(op2.equals("s")) {//pido si quiere hacer la media
			
			System.out.println("Nota media: "+notM/2);	//y hago la media		
			
		}else {
			
			System.out.println("Notas: "+arrayNotas);//las visualizo
		}
	  }
	}

}
