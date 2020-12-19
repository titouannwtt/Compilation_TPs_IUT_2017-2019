#include <stdlib.h>
#include <stdio.h>

size_t strlen(const char* chaine);
/* size_test un type spécial qui signifie que la fonction renvoie un nombre correspondant à une taille. */

char* inverse(const char* s) {
	char letter;
	letter = s[0];
	printf("%d\n", strlen(s));
	printf("%s\n", letter);
}

int main(int argc, const char ** argv) {
	int count;
	if (argc==1) {
		printf("Usage: %s <chaine1> <chaine2> <...>\n", argv[0]);
		exit(1);
	}
	count=0;
	while (count != argc-1) {
		count++;
		inverse(argv[count]);
	}
	return EXIT_SUCCESS;
}
