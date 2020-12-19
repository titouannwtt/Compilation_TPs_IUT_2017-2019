#include <stdio.h>
#include <stdlib.h>

unsigned binoco(unsigned n, unsigned k){
	unsigned x1, x2;
	if(k == 0) goto L;
	if(n == k) goto L;
	n = n-1;
	x1 = binoco(n, k);
	k = k-1;
	x2 = binoco(n, k);
	k = k+1;
	return x1 + x2;
L : 
	x1 = 1;
	return x1;
}

int main(int argc, char** argv){
	unsigned n, k, res;
	if(argc != 3){
		printf("Usage : %s <unsigned> <unsigned>\n", argv[0]);
		exit(1);
	}
	n = (unsigned) strtoul(argv[1], NULL, 0);
	k = (unsigned) strtoul(argv[2], NULL, 0);
	if((n<0) || (k<0) || (n>k)){
		printf("Fonction non définie\n");
		exit(1);
	}
	res = binoco(n, k);
	printf("Résultat : %u\n", res);
}
