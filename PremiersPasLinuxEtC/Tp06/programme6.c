#define FACTEUR 5
#include <stdio.h>
#include <stdlib.h>


int main(void) {
	int resultat, reste, valeur = 26;

	resultat = valeur/FACTEUR;
	reste = valeur%FACTEUR;
	printf("%d reste %d \n",resultat,reste);
}
