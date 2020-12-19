#include <stdlib.h>
#include <stdio.h>

unsigned int gcd(unsigned int a, unsigned int b) {
	unsigned int c,r;
	if (a<b) {
		c=a;
		a=b;
		b=c;
	}
	while(b!=0) {
		r=a%b;
		a=b;
		b=r;
	}
	return a;
}

unsigned int modif_gcd(unsigned int a, unsigned int b) {
	unsigned c,r;
	if (a>=b) goto loop1;
		c=a;
		a=b;
		b=c;
	loop1:
		if (!(b!=0)) goto end;
		r=a%b;
		a=b;
		b=r;
		goto loop1;
	end:
	return a;
}

int main (int argc, char ** argv) {
	unsigned int a, b;
	a=(unsigned int) strtod(argv[1], 0);
	b=(unsigned int) strtod(argv[2], 0);
	printf("gcd=%d\n", gcd(a,b));
	printf("modif_gcd=%d\n", modif_gcd(a,b));
	return EXIT_SUCCESS;
}
