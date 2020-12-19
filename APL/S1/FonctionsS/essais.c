#include <stdlib.h>
#include <stdio.h>
#include <assert.h>
#include <time.h>

int rng(int min, int max);

int main(int argc, char ** argv) {
	int a;
	int b;
	int x;
	if ( argc != 3 ) {
		printf("Usage: %s <min> <max>\n", argv[0]);
		exit(1);
	}
	a=(int) strtol(argv[1], NULL, 0);
	b=(int) strtol(argv[2], NULL, 0);
	x=rng(a,b);
	if ( x == -1 ) {
		printf("Erreur min = max\n");
		exit(2);
	}
	else
		printf("%d\n", x);
	return EXIT_SUCCESS;
}



int rng(int min, int max) {
  int res;
  int x;
  if ( min > max ) {
	x=max;
	max=min;
	min=x;
  }
  else if ( min == max ) {
	res=-1;
  }
  else {
 	 srand((unsigned) time(NULL));
 	 assert(min < max);
 	 res = min + rand()%(max + 1 - min);
 	 assert((min <= res) && (res < max));
  }
  return res;
}
