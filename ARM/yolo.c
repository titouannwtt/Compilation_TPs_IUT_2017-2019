#include <stdio.h>
#include <stdlib.h>

unsigned int binoco(unsigned n, unsigned k) {
	unsigned int a,b,x;
	if (k==0){
		 goto L;
	}
	else if (k==n) {
		goto L;
	}
	else {
		n=n-1;
		x=k-1;
		a=binoco(n,k);
		b=binoco(n,x);
		x=a+b;
		exit(x);
	}
L:
	x=1;
	return x;

}

int main(int argc, char ** argv) {
	unsigned int n, k;
	if (argc!=3) {
		printf("Usage: %s <n> <k>\n", argv[0]);
		exit(1);
	}
	n=(unsigned) strtoul(argv[1], NULL, 0);
	k=(unsigned) strtoul(argv[2], NULL, 0);
	if((n<0) || (k<0) || (n>k)){
		printf("Fonction non-définie\n");
		exit(1);
	}
	printf("%u\n", binoco(n,k));
	return EXIT_SUCCESS;
}

