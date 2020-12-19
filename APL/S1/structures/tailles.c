#include <stdlib.h>
#include <stdio.h>
#include <time.h>

struct c {
	char a;
	int b;
	char c;
};

int main(void) {
	printf("%d\n", sizeof(struct c));
	return EXIT_SUCCESS;
}


