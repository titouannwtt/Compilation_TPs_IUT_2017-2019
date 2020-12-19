#include <stdlib.h>
#include <stdio.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <unistd.h>
#include <sys/types.h>

int main(int argc, char ** argv) {
	char ligne[250];
	FILE * file;

	if ( argc != 2 ) {
		printf("Usage: %s <fichier à lire>\n", argv[0]);
		exit(1);
	}

	file=fopen(argv[1], "r");
	if ( file ==  NULL ) {
		printf("Impossible d'ouvrir le fichier %s\n", argv[1]);
		exit(2);
	}

	while (fgets(ligne, 250, file)!=NULL) {
		/* http://kos.enix.org/pipermail/sos/2007-February/000905.html */
		printf("\033[31m%s\033[0m\n", ligne);
	}

	fclose(file);
	return EXIT_SUCCESS;
}
