#include <stdlib.h>
#include <stdio.h>
#include <assert.h>
#include <time.h>

char* fchaine(void);

int main(void) {

	char chaine[50] = {'\0'};
	fchaine();



}

char* fchaine(void) {
	int count;
	char chaine[50];
	printf("Entrez une chaine de caractères:\n");
	scanf("%s", chaine);
	count=0;
	while ( chaine[count] != '\0') {
		printf("%c\n", chaine[count]);
		count++;
	}
	return EXIT_SUCCESS;
}



