#include <stdio.h>
#include <stdlib.h>

void main(int argc,char ** argv) {
	if (argc!=3) {
		printf("Usage: %s <str1> <str2>\n",argv[0]);
		exit(1);
	}
	
	long x, y;
	x=strtol(argv[1], NULL, 0);
	y=strtol(argv[2], NULL, 0);
	if (x<y) {
		printf("%ld\n", y);
	}
	else {
		printf("%ld\n", x);
	}
	exit(0);
	}



