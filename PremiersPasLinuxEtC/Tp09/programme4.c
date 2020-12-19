#include <stdio.h>
#include <stdlib.h>
	

int main(int argc, char** argv) {
	if ( argc <= 1 ) {
		printf("Mettre un argument\n");
		exit(1);
	}
	double somme = strtod(argv[1], NULL);
	int x, epargne;
	for ( x=1; x<7; x++ ) {
		epargne=somme+(somme*0.04*7);
	}
		printf("Au bout de %d ans, votre épargne sera de %d euro \n", x, epargne);
	return EXIT_SUCCESS;
}
