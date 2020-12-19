#include<stdlib.h>
#include<stdio.h>
#include<sys/stat.h>
#include<fcntl.h>
#include<unistd.h>
#include<sys/types.h>
#include<graph.h>

int main(void) {
	int largeur, hauteur;
	InitialiserGraphique();
	FILE * fd;
	fd=fopen("image.bin", "r");
	fread(&largeur, 4, 1, fd);
	fread(&hauteur, 4, 1, fd);
	CreerFenetre(0, 0, largeur, hauteur);
	while (1) {


	}
	fclose(fd);
	FermerGraphique();
	return EXIT_SUCCESS;
}
