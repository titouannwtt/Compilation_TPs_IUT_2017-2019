#include <stdio.h>
#include <stdlib.h>

void main(void) {
	int x=3;
	printf("x=%d addr(x)=%p \n",x,&x);
	printf("x=%d addr(x)=%d \n",x,&x);
	printf("x=%d addr(x)=%ld \n",x,&x);
	exit(0);
}
