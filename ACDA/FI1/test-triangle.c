#include<stdlib.h>
#include<stdio.h>
#include<time.h>

#define MAXTEST 1000000;
#define MAXSIZE 1000;

enum triangle {PASUNTRIANGLE, EQUI, ISO, QUE};


int estTriangle(int a, int b, int c)
{
	if((a < 0) || (b < 0) || (c < 0))
	{
		return 0;
	}
	if((a <= (b + c)) && (b <= (a + c)) && (c <= (a + b)))
	{
		return 1;
	}
	return 0;
}

int estEqui(int a, int b, int c)
{
	if(estTriangle(a,b,c))
	{
		if((a == b) && (b == c))
		{ 
			return 1;
		}
	}
	return 0;
}

int estIso(int a, int b, int c)
{
	if(estTriangle(a,b,c))
	{
		if(!estEqui(a,b,c))
		{
			if((a == b) || (a == c) || (b == c))
			{
				return 1;
			}
		}
	}
	return 0;
}

int estQue(int a, int b, int c)
{
	if(estTriangle(a,b,c))
	{
		if((!estEqui(a,b,c)) && (!estIso(a,b,c)))
		{
			return 1;
		}
	}
	return 0;
}

enum triangle typeTriangle(int a, int b, int c)
{
	if(estEqui(a,b,c))
	{
		return EQUI;
	}
	if(estIso(a,b,c))
	{
		return ISO;
	}
	if(estQue(a,b,c))
	{
		return QUE;
	}
	return PASUNTRIANGLE;
}


int gen_iso(void) {
	int x, y, z;
	int end;
	int i=0;
	int r;
	end=0;
	for(i=0; i<1000; i++) {
		x=rand()%MAXSIZE+1; /*x est le maximum*/
		y=rand()%x+1;
		z=x;
		while( (x=z) && (x=y) ){
			x=rand()%MAXSIZE+1; /*x est le maximum*/
			y=rand()%x+1;
			z=x;
		}
		r=typeTriangle(x, y, z);
		if (r!=2) {
			printf("x=%d y=%d z=%d i=%d r=%d | ERROR ISO\n", x, y, z, i, r);
			end=1;
		}
	}
	return end;
}

int gen_que(void) {
	int x, y, z;
	int i=0;
	int end;
	int r;
	end=0;
	for(i=0; i<100000; i++) {
		do {
			x=rand()%MAXSIZE+1;
			while(x==0){
				x=rand()%MAXSIZE+1;
			}
			y=rand()%(x-1)+1;
			z=x-y;
			r=typeTriangle(x, y, z);
		} while(r==2);
		if (r!=3) {
			printf("x=%d y=%d z=%d i=%d | ERROR QUE\n", x, y, z, i);
			end=1;
		}
	}
	return end;
}

int gen_equi(void) {
	int x;
	int end;
	int i=0;
	int r;
	end=0;
	for(i=0; i<1000; i++) {
		x=rand()%MAXSIZE;
		r=typeTriangle(x, x, x);
		if (r!=1) {
			printf("x=%d y=%d z=%d i=%d | ERROR EQUI\n", x, x, x, i);
			end=1;
		}
	}
	return end;
}

int main(void) {
	srand(time(NULL));
	gen_que();
	gen_iso();
	gen_equi();
	return EXIT_SUCCESS;
}