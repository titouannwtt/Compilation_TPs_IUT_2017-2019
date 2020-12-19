#include <stdio.h>
#include <stdlib.h>

unsigned int size;
int* t;
int fst, lst, empty, full;

void init(void) {
	empty=1;
	full=0;
	fst=1;
	lst=0;
}

void enq(int v) {
	empty=0;
	if (!full) {
		lst=(lst+1)%size;
		t[lst]=v;
		if (fst==(lst+1)%size) {
			full=1;
		}
	}
	else {
		printf("la file est pleine\n");
		return;
	}
}

int deq(void) {
	int v;
	if(!empty) {
		v=t[fst];
		fst=(fst+1)%size;
		if(fst==(lst+1)%size) {
			empty=1;
		}
		full=0;
	}
	else{
		printf("file vide\n");
		return -1;
	}
	return v;
}

void show_q(void){
	int i;
	for(i=0; i<size; i++) {
		if(fst<=lst) {
			if (i<fst || i>lst) {
				printf("*_");
			}
			if (i>=fst && i<=lst) {
				printf("%d_",t[i]);
			}
		}
		if(fst>lst) {
			if (i>lst && i<fst) {
				printf("*_");
			}
			if (i<=lst || i>=fst) {
				printf("%d_", t[i]);
			}
		}
	}
}

int is_in(int x){
	int i;
	for(i=0; i<size; i++) {
		if (t[i]==x) {
			return 1;
		}
	}
}

int main(int argc, char * argv[]) {
	size = (unsigned) strtoul(argv[1], NULL, 0);
	t = (int*) malloc(size*sizeof(int));
	init();
	enq(1);
	enq(18);
	enq(9);
	enq(3);
	enq(7);
	show_q();
	return EXIT_SUCCESS;
}