#include <stdlib.h>
#include <stdio.h>

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
	int z, count, countbis;
	double *tab;
	char entree[100];

	count=0;
	while (1) {
		printf("Entrez une valeur:\n"); }
		scanf("%s", &entree);
		if (entree == 'q') {
			break;
		}
		else {
			tab[count]=strtol(entree, NULL, 0);
			count++;
	}
	count--;
	free(entree);
	result(tab, count);
	free(tab);
}
