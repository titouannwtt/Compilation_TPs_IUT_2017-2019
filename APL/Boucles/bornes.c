#include<stdio.h>
#include<stdlib.h>

int main(int argc, char** argv){

	int x;
	int y;
	int z;
	x=0;
	y=0;
	z=0;
	while(x>=0){
		printf("Rentrez un entier : ");
		scanf("%d", &x);
		if (x!=-1){
			if (x<=y) {
				y=x;		
			}
			else {
				z=x;
			}
		}
	}
	printf("Max %d, Min %d", z, y);
	return EXIT_SUCCESS;
}


