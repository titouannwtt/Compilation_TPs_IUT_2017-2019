#include<stdlib.h>
#include<stdio.h>
#include<sys/stat.h>
#include<fcntl.h>
#include<unistd.h>
#include<sys/types.h>

/*
Prend 2 entiers dans un fichier, les divises, et mets le résultat dans un autre fichier.
*/

int main(int argc, char ** argv) {
	int z, y, x, fd, p, count, countbis, resultat, reste;
	reste=0;
	resultat=0;
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

	fscanf(infile, "%d", &x);
	fscanf(infile, "%d", &y);

/*
	z=x/y;
	printf("%d/%d=%d\n", x, y , z);
	printf("%d%%%d=%d\n", x, y, p);
	p=x%y;
*/
	count=0;
	while (x<y) {
		y=y<<1;
		count++;
	}

	countbis=0;
	while (count != countbis) { /* Se fait executer, tant de fois, qu'on a décallé pour que ce soit plus grand */
		if (y>x) { /* usleep */ /*créer de nouveau type, dont on besoin toutes les factions */
				/* Avoir une fonction qui dit: "Stop c'est assez dur" */
			resultat=


		countbis++;
	}
	if ( x >
	y=y>>1; /*Diviseur décallé vers la droite*/
	x=x<<1; /*Quotient décallé vers la gauche*/


	write(fd, &z, 4);
	write(fd, &p, 4);
	return EXIT_SUCCESS;
}
