#include <stdlib.h>
#include <stdio.h>
#include <unistd.h>
#include <sys/stat.h>
#include <fcntl.h>


int main (int argc, char * argv[]) {
	int nb;
	int fd;
	int count;
	int t[4];
	fd=open(argv[1], O_RDONLY);
	if(fd==1) {
		perror("pb");
		exit(1);
	}
	nb=read(fd, t, 4*sizeof(int));
	if (nb!=16) {
		printf("pb2");
		exit(2);
	}
	count=0;
	while (count!=4) {
		printf("\n%d", t[count]);
		count++;
	}
	printf("\n");
	return EXIT_SUCCESS;
}
	
