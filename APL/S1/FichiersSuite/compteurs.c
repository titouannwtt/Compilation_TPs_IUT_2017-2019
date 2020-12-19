#include<stdlib.h>
#include<stdio.h>
#include<sys/stat.h>
#include<fcntl.h>
#include<unistd.h>
#include<sys/types.h>

int main(void) {
	unsigned int count;
	FILE * fd;
	fd=fopen(".count", "r+");
	if (fd==NULL) {
		printf("Fichier n'existe pas, création du fichier\n");
		fd=fopen(".count", "w");
		count=1;
		fwrite(&count, 4, 1, fd);
	}
	printf("Lecture de la valeur dans le fichier...\n");
	fread(&count, 4, 1, fd);
	printf("Count=%d\n", count);
	count++;
	fwrite(&count, 4, 1, fd);
	printf("%d\n", count);
	fclose(fd);
	return EXIT_SUCCESS;
}
