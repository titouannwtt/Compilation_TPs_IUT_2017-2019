#include<stdio.h>
#include<stdlib.h>
int main(int argc,char **argv) {
	int x;
	short y;
	char v;
	char u;
	printf("addr(u)=%p\naddr(v)=%p\naddr(y)=%p\naddr(x)=%p\n",&u,&v,&y,&x);
	exit(0);
}
