
/* LIBRAIRIES */
#include <stdlib.h>
#include <stdio.h>
#include <graph.h>

int main(int argc, char ** argv) {
	int n;
	n=strtod(argv[1], NULL);
	InitialiserGraphique();
	CreerFenetre(10, 10, 500, 500);
	ChoisirTitreFenetre("Triangle");
	DessinerSegment(0,500,250,0);
	while(1) {

	}





}