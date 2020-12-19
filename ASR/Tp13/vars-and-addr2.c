#include<stdio.h>
#include<stdlib.h>
int main(int argc,char **argv) {
	int x;
	short y;
	char v;
	char u;
	char * adr;
	int i;
	u='A';
	v='z';
	x=0x11223344;
	y=0xaabb;
	adr=(void*)&u;
	for (i=0;i<8;i++)
		printf("%#hhx ",*(adr+i));
	putchar('\n');
	printf("addr(u)=%p\naddr(v)=%p\naddr(y)=%p\naddr(x)=%p\n",&u,&v,&y,&x);
	exit(0);
}
