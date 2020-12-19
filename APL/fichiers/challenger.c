#include<stdlib.h>
#include<stdio.h>
#include<sys/stat.h>
#include<fcntl.h>
#include<unistd.h>
#include<sys/types.h>

int main(int argc, char ** argv) {
	int score, Wscore;
	char sigle[3], Wsigle[3];
	FILE * file;
	int count;

	if ( argc != 4 ) {
		printf("Usage: %s <fichier à lire> <score> <'sigle'>\n", argv[0]);
		exit(1);
	}

	file=fopen(argv[1], "rw");
	if ( file ==  NULL ) {
		printf("Impossible d'ouvrir ou écrire dans le fichier %s\n", argv[1]);
		exit(2);
	}
	Wscore=strtol(
	fwrite(&Wscore

	count=0;
	while(count != 10) {
		count++;
		fread(&score, sizeof(int), 1, file);
		fread(sigle, sizeof(char), 3, file);
		printf("%09d %s\n", score, sigle);
	}
	fclose(file);
	return EXIT_SUCCESS;
}
