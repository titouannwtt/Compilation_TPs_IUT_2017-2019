#include<stdlib.h>
#include<stdio.h>
#include<time.h> // pour rand

int main(void) {
	int i;
	int x;
	srand(time(NULL));
	int nbgen=rand()%100+0; // Entre 0 et 100
	for(i=0; i<5; i++) {
		//printf("Admin Mode=Nbgen=%d\n", nbgen);
		printf("Il vous reste %d essais\n", 5-i);
		scanf("%d", &x);
		if (x<nbgen) { printf("Le nombre est plus grand\n"); }
		else if (x>nbgen) { printf("Le nombre est plus petit\n"); }
		else if (x=nbgen) {
			printf("Gagné!\n");
			i=6; // Termine la boucle for
			exit(0); //Arrête le programme
		}
	}
	printf("Vous avez perdu... le nombre était %d\n", nbgen);
	return EXIT_SUCCESS;
}
