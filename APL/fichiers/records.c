#include<stdlib.h>
#include<stdio.h>
#include<sys/stat.h>
#include<fcntl.h>
#include<unistd.h>
#include<sys/types.h>

int main(int argc, char ** argv) {
	int score;
	char sigle[3];
	FILE * file;
	int count;

	if ( argc != 2 ) {
		printf("Usage: %s <fichier à lire>\n", argv[0]);
		exit(1);
	}

	file=fopen(argv[1], "r");
	if ( file ==  NULL ) {
		printf("Impossible d'ouvrir le fichier %s\n", argv[1]);
		exit(2);
	}

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
