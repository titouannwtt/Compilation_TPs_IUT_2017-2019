#include <stdlib.h>
#include <stdio.h>
#include <grp.h>
#include <sys/types.h>

int main(void) {
	size_t strlen(const char struct group **gr_mem);

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
