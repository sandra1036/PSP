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
		close(fd[1]);
		wait(NULL);
		printf("El Hijo lee en el pipe...\n");
		read(fd[0],buffer,10);
		printf("\tMensaje leido:%s\n",buffer);
		break;

	  default ://Padre
		close(fd[0]);
		printf("El padre escribe en el pipe...\n");
		write(fd[1],"hola hijo",10);

		break;		
	}
}
