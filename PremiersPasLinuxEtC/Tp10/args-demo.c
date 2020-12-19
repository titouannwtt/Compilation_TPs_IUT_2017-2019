#include <stdio.h>
#include <stdlib.h>

void main(int argc,char ** argv) {
	if (argc!=4) {
		printf("Usage: %s <str1> <str2> <str3>\n",argv[0]);
		exit(1);
	}
	printf("argc=%d\n",argc);
	printf("argv[0]=\"%s\" argv[1]=\"%s\" argv[2]=\"%s\" argv[3]=\"%s\"\n",
		argv[0],argv[1],argv[2],argv[3]);
	exit(0);
	}
	
