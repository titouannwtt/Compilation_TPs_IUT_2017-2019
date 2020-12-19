#include <stdlib.h>
#include <stdio.h>
#include <assert.h>
#include <time.h>

int main(void) {

	char chaine[50] = {'\0'};
	printf("Entrez une chaine de caractères:\n");
	scanf("%s", chaine);
	if ( (chaine[0]=='\0') || (chaine[1]=='\0') ) {
		printf("Chaine trop courte\n");
		exit(1);
	}
	printf("La 2ème lettre est: %c\n", chaine[1]);
	return EXIT_SUCCESS;
}



