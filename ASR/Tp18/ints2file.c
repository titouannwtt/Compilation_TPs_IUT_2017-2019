#include<stdlib.h>
#include<stdio.h>
#include<sys/stat.h>
#include<fcntl.h>
#include<unistd.h>
#include<sys/types.h>

/*
Etant donné une liste d'entier, dans un fichier
La convertir en format machine.
-> ASCII to OCTET
*/

int main(int argc, char ** argv) {
	int z, x, fd;
	FILE * infile;
	if (argc != 3) {
		exit(1);
	}
	infile=fopen(argv[1], "r");
	if ( infile ==  NULL ) {
		perror("fopen");
		exit(2);
	}
	fd=open(argv[2], O_WRONLY|O_CREAT|O_TRUNC,0644);
	if ( fd == -1 ) {
		perror("open");
		exit(3);
	}
	while (1) {
		z=fscanf(infile, "%d", &x);
		if ( z==EOF || z==0) {
			break;
		}
		write(fd, &x, 4);
	}
	return EXIT_SUCCESS;
}
