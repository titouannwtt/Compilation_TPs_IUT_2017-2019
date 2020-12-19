#include<stdlib.h>
#include<stdio.h>

long int perm07(long int x) {
	unsigned long int y =x;
	unsigned  long int fort;
	unsigned long int faible;
	fort=(y&0xff00000000000000)>>56;
	faible=(y&0x00000000000000ff)<<56;
	y=(y&0x00ffffffffffff00);
	return (y|fort|faible);
	

}
void main(int argc, char ** argv) {
	if (argc!=2) {
		printf("Usage: %s <entier>\n", argv[0]);
		exit(1);
	}
	long int x;
	x=strtoul(argv[1], NULL, 0);
	printf("%lx\n",x);
	x=perm07(x);
	printf("%lx\n",x);
	printf("\n");
}
