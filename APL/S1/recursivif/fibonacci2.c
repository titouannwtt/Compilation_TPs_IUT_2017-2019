
#include <stdio.h>
#include <stdlib.h>

unsigned int sfibonacci(unsigned n) {
  unsigned int x;
  unsigned int y;
  if (n==0) {
  	return 0;
  }
  if (n==1) {
  	return 1;
  }
  if (n >= 2) {
  	x=sfibonacci(n-2);
  	y=sfibonacci(n-1);
  	printf("%d+%d=%d\n", x, y, x+y);
    return x+y;
  }
}


void main(int argc, char ** argv) {
	unsigned int x;
	if (argc!=2) {
		printf("Usage: %s <n>\n", argv[0]);
		exit(1);
	}
	x=strtod(argv[1], NULL);
	if (x>=2) {
		sfibonacci(x);
	}
	else {
		printf("n>=2\n");
	}
}