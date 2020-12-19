#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

#define TIME 3

/* Probleme:
	Quand quelqu'un à une seconde chance, ça le supprime, lui plus celui d'après en une fois, au lieu de simplement lui enlever sa seconde chance
*/

unsigned int size;
int* t;
int* s;
int fst, lst, empty, full;

void rem();
int deq(void);

void init(void) {
	int i;
	empty=1;
	full=0;
	fst=1;
	lst=0;
	for(i=0; i<size; i++) {
		s[i]=0;
	}
}

void enq(int v) {
	empty=0;
	int i;
	for(i=0; i<size; i++) {
		if (t[i]==v) {
			s[i]=1;
			return;
		}
	}
	if (!full) {
		lst=(lst+1)%size;
		t[lst]=v;
		if (fst==(lst+1)%size) {
			full=1;
		}
	}
	else {
		printf("la file est pleine, donc:\n");
		deq();
		return;
	}
}

int deq(void) {
	int v;
	if(!empty) {
		if (s[fst]==1) {
			s[fst]=0;
			fst=(fst+1)%size;
		}
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
	printf("\n");
	printf("Second chance: ");
	for(i=0; i<size; i++) {
		if (s[i]==1) {
			printf(" +  ");
		}
		if (s[i]==0) {
			printf("    ");
		}
	}
	printf("\nFile:          ");
	for(i=0; i<size; i++) {
		if(fst<=lst) {
			if (i<fst || i>lst) {
				printf(" * _");
			}
			if (i>=fst && i<=lst) {
				printf("%03d_",t[i]);
			}
		}
		if(fst>lst) {
			if (i>lst && i<fst) {
				printf(" * _");
			}
			if (i<=lst || i>=fst) {
				printf("%03d_", t[i]);
			}
		}
	}
	printf("\nCurseur:       ");
	for(i=0; i<size; i++) {
		if(lst==i) {
			printf(" |  ");
		}
		else {
			printf("    ");
		}
	}
	printf("\n\n");
}

int is_in(int x){
	int i;
	for(i=0; i<size; i++) {
		if (t[i]==x) {
			return 1;
		}
	}
}

void add(int v) {
	printf("\nEnqueue %d...\n", v);
	enq(v);
	show_q();
	sleep(TIME);
}

void rem() {
	printf("\nDequeue...\n");
	deq();
	show_q();
	sleep(TIME);
}

int main(int argc, char * argv[]) {
	size = (unsigned) strtoul(argv[1], NULL, 0);
	t = (int*) malloc(size*sizeof(int));
	s = (int*) malloc(size*sizeof(int));
	init();
	add(1);
	add(18);
	add(9);
	add(3);
	add(7);
	add(9);
	add(8);
	add(14);
	add(39);
	add(48);
	add(2);
	add(1);
	add(7);
	add(9);
	add(7);
	add(22);
	add(15);
	add(22);
	add(15);
	add(15);
	add(9);
	add(9);
	add(9);
	add(6);
	show_q();
	return EXIT_SUCCESS;
}