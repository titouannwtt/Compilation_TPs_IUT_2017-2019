#include<stdio.h>
#include<stdlib.h>
int main(void) {
	short n;
	n=0x0102;
	if (*(char)&n)=0x01 {
		printf("Big Endian");
	}
	else
		printf("Little Endian");	
}	
