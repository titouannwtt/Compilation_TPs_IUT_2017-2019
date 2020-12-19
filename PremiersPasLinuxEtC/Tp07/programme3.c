#include <stdio.h>
#include <stdlib.h>

int main(void) {
	printf("Unicode (UTF-8) : [%c%c]\n", '\xC3', '\xAE');
	printf("Unicode (UTF-16) : [%c%c]\n", '\x00', '\xEE');
	printf("Latin 1 : [%c]\n", '\xEE');
	printf("%c\n", 'î');

}
