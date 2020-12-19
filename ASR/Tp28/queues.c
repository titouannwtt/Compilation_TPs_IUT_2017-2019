#include <stdlib.h>
#include <stdio.h>

#define SIZE 50;

int tab[SIZE] 8;
unsigned int fst;
unsigned int lst;
unsigned short empty;
unsigned short full;

int main(void) {
	show_queue();
	if(is_in(5)) printf("5 is in\n"); else printf("5 isn't in\n");
	enq(3);
	enq(5);
	enq(7);
	show_queue();
	if (is_in(5)) printf("5 is in\n"); else printf("5 isn't in\n");
	z=deq();
	printf("dequeued %d\n", z);
	show_queue();
	z=deq();
	printf("dequeued %d\n", z);
	show_queue();
	enq(2);
	enq(4);
	enq(6);
	show_queue();
	if (is_in(5)) printf("5 is in\n"); else printf("5 isn't in\n");
	enq(8);
	enq(9);
	enq(3);
	show_queue;
	enq(5);
	show_queue;
	enq(7);
	printf("dequeued %d\n", deq());
	show_queue();
	printf("dequeued %d\n", deq());
	printf("dequeued %d\n", deq());
	printf("dequeued %d\n", deq());
	printf("dequeued %d\n", deq());
	show_queue();
	printf("dequeued %d\n", deq());
	show_queue();
	printf("dequeued %d\n", deq());
	show_queue();
	printf("dequeued %d\n", deq());
	show_queue();
	z=deq();
	exit(0);
}

void show_queue(void) {
	int i;
	for(i=0; i < SIZE ; i++) {
		if ( tab[i] == 0 ) {
			printf("*");
		}
		else {
			printf("%d", tab[i]);
		}
		if ( (i+1) != SIZE ) {
			printf("_");
		}
	}
	printf("\n");
}

int is_in(int find) {
	int ok;
	int i;
	ok=0;
	for(i=0; i < SIZE ; i++) {
		if(tab[i]==find) {
			ok=1;
			i=SIZE;
		}
	}
	if(ok==1) {
		return 1;
	}
	else {
		return 0;
	}
}

void enq() {
	

}

void deq() {


}
