#include<stdio.h>
#include<stdlib.h>
int main(void) {
	long long int x;
	long long int y;
	long long int z;
	char *valeur = "w";
	while(valeur != "z") {
		if (valeur=="y") {valeur="z"; }
		if (valeur=="x") {valeur="y"; }
		if (valeur=="w") {valeur="x"; }
		printf("Entrer la valeur de %s:\n", valeur);
		if (valeur=="x") {scanf("%lli", &x);}
		if (valeur=="y") {scanf("%lli", &y);}
		if (valeur=="z") {scanf("%lli", &z);}
	}
	# x=3 | y = 4 | z = 5
	if (x<y) {
		premier=x
		deuxieme=y
	else
		deuxieme=x
		premier=y
	if (y<z)
		if deuxieme=y
			troisieme=z
		else
			if (x<z)
				troisieme=z
			else
				troisieme=x
				deuxieme=z
	else
		if (x<z)
			premier=x
			deuxieme=z
			troisieme=y
		else
			premier=z
			deuxieme=x
			troisieme=y
		
	
	
	if(y<z)
	else (y>z)

	if(x<z)
	else (x>z)
}
