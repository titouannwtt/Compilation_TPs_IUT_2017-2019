#include <stdio.h>
#include <stdlib.h>

void main(void) {
	double visiteur = (double) 0;
	int x;
	int count=0;
	char *jour;
	while (jour != "vendredi")
	{
		count++;
		if (count==1) { jour = "lundi"; }
		if (count==2) { jour = "mardi"; }
		if (count==3) { jour = "mercredi"; }
		if (count==4) { jour = "jeudi"; }
		if (count==5) { jour =  "vendredi"; }
		printf("Combien de visiteur le %s ?\n", jour);
		scanf("%d", &x);
		visiteur += x;
	}
	double f = (double) visiteur/5;
	printf("La fréquence de visiteur au cours d'une semaine est de %f\n", f);
	exit(0);
}



