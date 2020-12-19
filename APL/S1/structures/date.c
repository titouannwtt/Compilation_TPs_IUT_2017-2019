#include <stdlib.h>
#include <stdio.h>
#include <time.h>

int sansadress(void);
int avecadress(void);

void main(void) {
	sansadress();
	avecadress();
}

int sansadress(void) {
	printf("Sans adresse: ");
	time_t var = time(NULL);
	struct tm temps = *localtime(&var);
	printf("%d-%d-%d\n", temps.tm_year+1900, temps.tm_mon+1, temps.tm_mday);
	return EXIT_SUCCESS;
}



int avecadress(void) {
	printf("Avec adresse: ");
	time_t var = time(NULL);
	struct tm *temps = localtime(&var);
	printf("%d-%d-%d\n", temps->tm_year+1900, temps->tm_mon+1, temps->tm_mday);
	return EXIT_SUCCESS;
}
