#include <math.h>
#include <stdio.h>
#include <stdlib.h>

int main(int argc, char ** argv) {

	double x, y, d, a;

	d = strtod(argv[1], NULL);
	a = strtod(argv[2], NULL);

	x = d*cos(a);
	y = d*sin(a);

	printf("Le point se trouve aux coordonnées (%f, %f)\n", x, y);
	return EXIT_SUCCESS;
}
