#include <stdlib.h>
#include <stdio.h>

int affichage(double *tab, int taille) {
	if (taille<4) {
		printf("%d\n", tab[taille]);
		affichage(tab+1, taille+1);
	}
}

void main() {
	double tab[4];
	tab[0]=10.0;
	tab[1]=12.5;
	tab[2]=7.75;
	tab[3]=0.50;
	affichage(tab,0);
}