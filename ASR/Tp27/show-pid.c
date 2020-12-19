#include <stdlib.h>
#include <stdio.h>
#include <unistd.h>

int get_one_letter(void){
	int x;
	x=fork();
	if (x==0)
		printf("Fils: %d\n", getpid());
	else
		printf("Père: %d\n", getpid());
	int c,first;
	first=c=getchar();
	printf("test: %d\n", getpid());
	while (c!='\n'&&c!=EOF)
		c=getchar();
	return(first);
}

int main(void) {
	int x;
	x=getpid();
	printf("Main: %d\n", x);
	get_one_letter();
}
