#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int maj, min, lettre;
	printf("Ecrivez une lettre : ");
	lettre = getchar();
	if ( 0x40 < lettre ) { 
		if ( lettre < 0x5B) {
			maj = lettre;
			min = lettre+0x20;
			printf("Vous avez tapé la majuscule %c, qui a pour minuscule %c\n", maj, min);
			exit(0);
		}
		else if ( lettre > 0x7A ) {
			printf("Le Caractère que vous avez rentré n'est pas une lettre\n");
			exit(1);
		}
		else if ( lettre > 0x60 ) {
			maj = lettre-0x20;
			min = lettre;
			printf("Vous avez tapé la minuscule %c, qui a pour majuscule %c\n", min, maj);
			exit(0);
		}
		else {
			printf("Le Caractère que vous avez rentré n'est pas une lettre\n");
			exit(1);
		}
	}
	else {
		printf("Le Caractère que vous avez rentré n'est pas une lettre\n");
		exit(1);
	}	
	return EXIT_SUCCESS;
}
