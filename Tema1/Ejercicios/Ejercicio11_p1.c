#include <stdio.h>
#include <stdlib.h>

void main(){

  pid_t pid, hijo_pid;
  int var=6;//definimos una variable entera del valor 6

  printf("Valor inicial: %d\n",var);
  pid=fork();//Soy el padre, creo al hijo

 if(pid==-1){//Error
    printf("No se ha podido crear el proceso hijo...");
    eixit(-1);

}
if(pid==0){
  var=var-5;//El hijo restará 5 a la variable
  printf("Variable en proceso hijo: %d\n",var);

}else{
   hijo_pid=wait(NULL);//espera finalización del proceso hijo
   var=var+5;
  printf("Variable en proceso padre: %d\n",var);

}
exit(0);

}


