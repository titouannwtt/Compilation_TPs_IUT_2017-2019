#include <stdlib.h>
#include <stdio.h>

unsigned int mult(unsigned short a, unsigned short b) {
	int i;
	unsigned int m=0;
	unsigned int aa=a;
	for(i=0; i<16;i++) {
		if (b&1) {
			m=m+aa;
		}
		aa=aa<<1;
		b=b>>1;
	}
	return m;
}

int main (int argc, char ** argv) {
	unsigned short a, b;
	a=(unsigned short) strtod(argv[1], 0);
	b=(unsigned short) strtod(argv[2], 0);
	printf("%d\n", mult(a, b));
	return EXIT_SUCCESS;
}
