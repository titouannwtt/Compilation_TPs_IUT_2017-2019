#include<stdio.h>
#include<stdlib.h>

int main(int argc, char** argv){
	int x;
	int i;
	x=1;
	while (x>=0) {
		printf("Rentrez un entier : ");
		scanf("%d", &x);
		if (x<0) {
			exit(1);
		}
		for (i=1; i<=10; i++){
			printf("%d x %3d = %3d\n", x, i, x*i);
		}
	}
	return EXIT_SUCCESS;
}


