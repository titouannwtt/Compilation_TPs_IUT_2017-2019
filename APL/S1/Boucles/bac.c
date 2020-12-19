#include<stdio.h>
#include<stdlib.h>
int main(void) {
	double note;
	note=0;
	while((note>=20)|(note<=10)) {
		note=0;
		printf("Quelle était votre moyenne au Bac ?\n");
		scanf("%lf", &note);
	}
	if (note < 10) {
		printf("Vous n'êtes pas diplomé\n");
		return EXIT_SUCCESS; 
	}
	else if (note >= 16) {
		printf("Vous êtes admis avec la mention ""Très Bien""\n");
		return EXIT_SUCCESS;
	}
	else if (note >= 14 && note <=20) {
		printf("Vous êtes admis avec la mention ""Bien""\n");
		return EXIT_SUCCESS;
	}
	else if (note >= 12 && note <=20) {
		printf("Vous êtes admis avec la mention ""Assez bien""\n");
		return EXIT_SUCCESS;
	}
	else if (note >= 10 && note <=20) {
		printf("Vous êtes admis\n");
		return EXIT_SUCCESS; 
	}
	else {
		/*Toutes les eventualités ont été considérées, donc afficher
		une erreur */
		printf("Erreur\n");
		exit(1);
	}
}
	
