#include <stdio.h>
#include <stdlib.h>

void main(){

  pid_t pid_abuelo,pid_hijo,pid_nieto;	
  pid_abuelo=fork();

  if(pid_abuelo==-1)//Ha ocurrido un errror
  {

    printf("No se ha podido crear el proceso hijo...");
    exit(-1);
  }
  if(pid_abuelo==0){//Nos encontramos en Poceso hijo
    
    printf("Soy el proceso hijo\n Mi PID es: %d, El PID de mi padre es: %d\n",getpid(),getppid());
    pid_hijo=fork();

    if(pid_hijo==-1){//Ha ocurrido un error

	printf("No se ha podido crear el proceso nieto...");
	exit(-1);
    }
    if(pid_hijo==0){//Nos encontramos en Poceso Nieto

	printf("Soy el proceso nieto\n Mi PID es: %d, El PID de mi padre es: %d\n",getpid(),getppid());
    }else{//Nos encontramos en el Hijo
	pid_nieto=wait(NULL);
   }
     exit(0);

   
  }else{//Nos encontramos en el Proceso Abuelo
	pid_hijo=wait(NULL);
	printf("Soy el proceso Abuelo\n, Mi PID es: %d,El PID de mi hijo es: %d, El de mi nieto es: %d",getpid(),getppid(),pid_hijo);

}

exit(0);





}





