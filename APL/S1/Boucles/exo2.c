#include<stdlib.h>
#include<stdio.h>


void main(int argc, char ** argv) {
	char n;
	char m;
	n=90;
	m=65;
	while(n>=m) {
		printf("%c ", n);
		n--;
	}
	printf("\n");
	n=122;
	m=97;
	while(n>=m) {
		printf("%c ", n);
		n--;
	}
	printf("\n");
}	
