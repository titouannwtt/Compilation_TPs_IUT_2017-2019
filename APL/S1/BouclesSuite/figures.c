#include<stdlib.h>
#include<stdio.h>

int main(void) {
	unsigned int hauteur;
	char mode;
	while( (mode!='q')) {
		if ((mode!='t') || (mode!='c')) {
			printf("------------\n");
			printf(" t) Triangle\n");
			printf(" c) Carré\n");
			printf(" q) Quitter\n");
			printf("Votre Choix ? ");
			scanf("%s", &mode);
			printf("\n");
		}
		if ((mode=='t') || (mode=='c')) {
			printf("\nHauteur ? ");
			scanf("%d", &hauteur);
			printf("\n");
			if (mode=='t') {
				
			}
			if (mode=='c') {
	
			}
		}	
			
	}
	printf("Au revoir...");
	return EXIT_SUCCESS;
}
