#include <math.h>
#include <stdio.h>
#include <stdlib.h>

void main(void) {
	double x, y, z, n, m, l;
	x = sqrt(fabs(log(0.5)));
	y = sin(M_PI/6);
	z = atan(13^2);
	n = pow(exp(-1), 4);
	m = log(-3);
	l = pow(sqrt(2), 2);
	printf("x=%e y=%e z=%e n=%e m=%e l=%e", x, y, z, n, m, l); 
}
