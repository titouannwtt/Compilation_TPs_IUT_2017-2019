#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int main(void) {
	int tab[10] = {-50, -40, -30, -20, -10, 10, 20, 30, 40, 50};
	int* adresse= &tab[0];
	int count=0;
	int max=-50;
	srand(time(NULL));
	while (count!=10) {
		tab[count] = ((rand()%100+0)-50);
		count++;
	}

	count=0;
	while (count!=10) {
		if (tab[count]>max) {
			max=tab[count];
		}
		printf("%d", *(adresse+count));
		printf("\n");
		count++;
	}
	printf("\nmax=%d\n", max);
	return EXIT_SUCCESS;
}
