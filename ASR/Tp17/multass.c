#include <stdlib.h>
#include <stdio.h>

unsigned int mult(unsigned short a, unsigned short b) {
	unsigned int i, m, aa;

	m=0;
	aa=a;
	i=0;

	loop1:
		if(i>=16) goto end1;
			if (b&1) m=m+aa;
			i++;
			aa=aa<<1;
			b=b>>1;
			goto loop1;

	end1:
		return m;
}



int main (int argc, char ** argv) {
	unsigned short a, b;
	a=(unsigned short) strtod(argv[1], 0);
	b=(unsigned short) strtod(argv[2], 0);
	printf("%d\n", mult(a, b));
	return EXIT_SUCCESS;
}
