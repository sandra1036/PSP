#include <stdlib.h>
#include <stdio.h>
void main(){
 pid_t pid, Hijo_pid2,Hijo2_pid;
pid=fork();//Soy el Abuelo,creo a Hijo

if(pid==-1){
  printf("NO se ha podido crear el priceso hijo...");
  eixit(-1);

}
if(pid==0){
 pid2=fork();//Soy el Hijo, creo a nieto
 switch(pid2){
   case -1://error
     printf("NO se ha podido crear el proceso hijo en el hijo");
     exit(-1);
     break;
   case 0;//proceso hijo
     printf("\t\tSoy el proceso NIeto %d, MI padre es= %d\n",getpid(),getppid());
     break;

   default://proceso padre
    Hijo_pid2=wait(NULL);
    printf("\tSoy el proceso Hijo %d,MI padre es:%d\n",getpid(),getppid());

}

}
else //Nos encontramos en Proceso padre
{

Hijo_pid=wait(NULL)//espera la finalización del proceso hijo
printf("Soy el proceso Abuelo: %d, MI HIjo: %d termino\n",getpid(),pid);

}
exit(0);






}

