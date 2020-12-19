#include<stdlib.h>
#include<stdio.h>

void show_bits(long int x, int l) {
	unsigned long mask = 0x8000000000000000;
	mask = mask>>(64-l);
	int i;
	for (i=0; i<l; i++) {
		if ((x&mask)==0) {
			putchar('0');
		}
		else {
			putchar('1');
		}
	mask = mask>>1;
	}
}
void main(int argc, char ** argv) {
	if (argc!=3) {
		printf("Usage: %s <entier> <entier>\n", argv[0]);
		exit(1);
	}
	long int x;
	int l;
	x=strtol(argv[1], NULL, 0);
	l=(int) strtol(argv[2], NULL, 0);
	show_bits(x, l);
	printf("\n");
}
