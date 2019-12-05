package Pruebas;

public class PruebaRuta {

	public void ejecutar(String ruta){

        ProcessBuilder pb;
        try {
                pb = new ProcessBuilder(ruta);//Una clase donde crea las caracteristicas del proceso
                pb.start();//Donde se crea el proceso
        } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }

}

public static void main(String[] args) {
        String ruta=
                "/home/sanoro/lampstack-7.3.9-0/manager-linux-x64.run";
        PruebaRuta lp=new PruebaRuta();
        lp.ejecutar(ruta);
        System.out.println("Finalizado");
}

}
