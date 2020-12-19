#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int resneg, resconj, resdisj;

	resneg = 0xFFFFFFF8;
	resconj = 0x01234567&0xD;
	resdisj = 0xD|0xA;
	printf("\n\nREPONSE EXECRICE DES OPERATIONS BIT-A-BIT\n\n");
	printf("La Negation de 0xFFFFFFF8 vaut: %d en decimal, et 0x%x en hexadecimal\n", resneg, resneg);
	printf("La Conjection de 0x01234567 et 0xD vaut: %d en decimal, et 0x%x en hexadecimal\n", resconj, resconj);
	printf("La Disjonction de 0xD et 0xA vaut: %d en décimal, et 0x%x en hexadecimal\n\n", resdisj, resdisj);

}
