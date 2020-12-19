
#include <stdio.h>
#include <stdlib.h>

unsigned int fibonacci(unsigned n) {
  if (n==0) {
  	return 0;
  }
  if (n==1) {
  	return 1;
  }
  if (n >= 2) {
    return fibonacci(n-2)+fibonacci(n-1);
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
		printf("%d\n", fibonacci(x));
	}
	else {
		printf("n>=2\n");
	}
}