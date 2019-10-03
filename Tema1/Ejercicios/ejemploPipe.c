#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main(){

	int fd[2];
	char buffer[30];
	pid_t pid;
 
	pipe(fd);

	pid=fork();

	switch (pid){
	   case -1: //ERROR
		printf("No se ha podido crear el hijo...");
		exit(-1);
		break;

	   case 0://Hijo
		printf("El Hijo escribe en el pipe...\n");
		write(fd[1],"Hola papi",10);
		break;

	  default ://Padre
		wait(NULL); //espera que finalice proceso hijo
		printf("El padre lee del pipe...\n");
		read(fd[0],buffer,10);
		printf("\tMensaje leido:%s\n",buffer);
		break;		


	}


}
