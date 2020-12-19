#include <stdio.h>
#include <stdlib.h>

void main(void) {
	int x;
	printf("Entrer un entier:\n");
	scanf("%d", &x);
	char y = (char) x;
	printf("%hhd\n", y);
	exit(0);
	}



