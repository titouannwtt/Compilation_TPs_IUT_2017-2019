#include<stdlib.h>
#include<stdio.h>

void showbits(float x) {
	unsigned int *y=(unsigned int *)&x;
	unsigned long mask= 0x80000000;
	int i;
	for (i=0; i<32; i++) {
		if ((i==1) | (i==9)) { putchar(' '); }
		if ((mask&*y)==0) {
			putchar('0');
		}
		else {
			putchar('1');
		}
		mask = mask>>1;
	}
}
void main(int argc, char ** argv) {
	if (argc!=2) {
		printf("Usage: %s <float>\n", argv[0]);
		exit(1);
	}
	long int x;
	x=strtof(argv[1], NULL);
	showbits(x);
	printf("\n");
}
