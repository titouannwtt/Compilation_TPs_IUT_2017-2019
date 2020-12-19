#include <stdlib.h>
#include <stdio.h>

void main(void) {
	char a=77; 			printf("\nsigned char:		  %hhd", a);
	unsigned char b=77;		printf("\nunsigned char:		  %hhu", b);
	short int c=77;			printf("\nshort int:		  %hd ", c);
	unsigned short int d=77;	printf("\nunsigned short int:	  %hu", d);
	int e=77;			printf("\nint:			  %d", e);   
	unsigned int f=77;		printf("\nunsigned int:		  %u", f);
	long int g=77;			printf("\nlong int:		  %ld", g);
	unsigned long int h=77;		printf("\nunsigned long int:	  %lu", h);
	long long int i=77;		printf("\nlong long int: 		  %lld", i);
	unsigned long long int j=77;	printf("\nunsigned long long int:   %llu", j);
	double k = (double) 77;		printf("\ndouble:			  %.0f", k);
	long double l=77;		printf("\nlong double: 		  %.0Lf", l);
	printf("\n");
}
