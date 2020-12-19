#include <stdio.h>
#include <stdlib.h>

int main(void) {
	char premier, second;
	printf("Entrez votre prénom : ");
	premier = getchar();
	second = getchar();
	printf("Vous avez tapé %c et %c\n", premier, second);

}
