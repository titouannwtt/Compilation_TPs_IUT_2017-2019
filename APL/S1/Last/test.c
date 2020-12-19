#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int jour(struct tm* temps_s) {

}

int main(int argc, char** argv) {
	/* */
	time_t* sec;
	*sec = time(NULL);
	struct tm* temps_s = localtime(sec);
	printf("%d-%d-%.2d\n", (temps_s->tm_year)+1900, (temps_s->tm_mon)+1, temps_s->tm_mday);
}
