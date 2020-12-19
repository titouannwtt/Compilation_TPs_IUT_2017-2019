#include<stdio.h>
#include<stdlib.h>

int main(int argc, char** argv){

	int x;
	int i;

	printf("Rentrez un entier : ");
	scanf("%d", &x);

	for (i=1; i<=10; i++){
		printf("%d x %2d = %2d\n", x, i, x*i);
	}

	return EXIT_SUCCESS;
}


