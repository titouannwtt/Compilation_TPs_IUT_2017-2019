#include <stdlib.h>
#include <stdio.h>

int getreel(void) {
	int x;
	printf("Combien de réel(s) voulez-vous entrez ?\n");
	scanf("%d", &x);
	return x;
}

void result(double *tab, int nb) {
	int z=0;
	int count=0;
        int countbis=0;
        while (count < nb ) {
                count++;
                z=0;
		countbis=0;
                while (countbis < nb ) {
                        countbis++;
                        if (count != countbis ) {
                                if (tab[count]==tab[countbis]) {
                                        z++;
                                }
                        }
                }
                if (z==0) {
                        printf("%lf\n", tab[count]);
                }
        }
}

int main(void) {
	int z, nb, count, countbis;
	double *tab;

	nb=getreel();

	tab = (double *) malloc ((nb)*sizeof(double));

	count=0;
	while (count < nb) {
		count++;
		if ( count == 1 ) {
			printf("Entrez votre 1ere valeur:\n"); }
		else {
			printf("Entrez votre %dème valeur:\n",  count); }
		scanf("%lf", &tab[count]);
	}
	result(tab, nb);
	free(tab);
}
