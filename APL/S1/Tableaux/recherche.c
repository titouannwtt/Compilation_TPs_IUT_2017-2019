#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int main(void) {
	int tab[10] = {-50, -40, -30, -20, -10, 10, 20, 30, 40, 50};
	int* adresse= &tab[0];
	int count=0;
	int entree;
	int indice=-1;
	srand(time(NULL));
	while (count!=10) {
		tab[count] = ((rand()%100+0)-50);
		count++;
	}

	count=0;
	while (count!=10) {
		printf("%d", *(adresse+count));
		printf("\n");
		count++;
	}
	printf("\nValeur:\n");
	scanf("%d", &entree);
	count=0;
	while (count!=10) {
		if (tab[count]==entree) {
			indice=count;
		}
		count++;
	}
	printf("Indice: %d\n", indice);
	return EXIT_SUCCESS;
}
