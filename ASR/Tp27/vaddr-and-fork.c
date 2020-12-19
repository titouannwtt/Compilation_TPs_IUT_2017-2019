#include <stdlib.h>
#include <stdio.h>
#include <unistd.h>

int main(void){
	int x;
	int z;
	int pid;

	z=0;
	x=fork();

	if (x<0) {
		perror("Problème fork\n");
	}
	if (x==0) {
		/*Processus fils*/
		z=1;
		pid=getpid();
	}
	if (x>0) {
		/*Processus père*/
		z=2;
		pid=getpid();
	}
	printf("\n====== PID: %d ======\n", pid);
	printf("Adresse de z: %p\n", &z);
	printf("Valeur de z : %d\n", z);
	getchar();
	if (x==0) {
		printf("\nFermeture par le fils...\n");
		return EXIT_SUCCESS;
	}
	else {
		printf("\nFermeture par le père...\n");
		return EXIT_SUCCESS;
	}
}
