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
	printf("%#llx\n",*((unsigned long*)(&u)));
	printf("%#x\n",*((unsigned int*)(&u)));
	printf("%#lx\n",*((unsigned short*)(&u)));
	printf("%li\n",*((long long*)(&u)));
	printf("%d\n", *((int*)(&u)));
	printf("%hd\n",*((short*)(&u)));
	printf("addr(u)=%p\naddr(v)=%p\naddr(y)=%p\naddr(x)=%p\n",&u,&v,&y,&x);
	exit(0);
}
