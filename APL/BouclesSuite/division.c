#include<stdlib.h>
#include<stdio.h>
#define CLEAR(x) memset(x,'\0',1000)

int main(void) {
	int x;
	int y;
	int z=0;
	int w=0;
	do {
		if (z!=0) {
			printf("Vous avez entré %d, entrez une ", x);
		}
		printf("Valeur entière positive ou nulle:\n");
		scanf("%u",&x);
		z++;
		printf("\n");
	} while (x<0);
	z=0;
	do {
		if (z!=0) {
			printf("Vous avez entré %d, entrez une ", y);
		}
		printf("Valeur entière positive:\n");
		scanf("%u",&y);
		z++;
		printf("\n");
	} while (y<=0);
	z=x;
	while(x>=y) {
		x-=y;
		w++;
	}
	printf("--> %d = %d x %d + %d\n", z, y, w, x);
	return EXIT_SUCCESS;
}
