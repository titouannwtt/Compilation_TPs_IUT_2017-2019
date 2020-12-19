#include <stdio.h>
#include <stdlib.h>

struct maillon {
	char valeur;
	struct maillon * suivant;
};
typedef struct {
	struct maillon * premier;
	struct maillon * dernier;
}file;

typedef enum { false, true } bool;

void test(int x) {
	printf("test %d\n", x);
}

void enqueue(file *pp, char nouveau) {
	struct maillon * tmp = (struct maillon *) malloc(sizeof (struct maillon));
	tmp->valeur=nouveau;
	tmp->suivant=NULL;
	if (pp->dernier!=NULL) {
		pp->dernier->suivant=tmp;
	} else {
		pp->premier=tmp;
	}
	pp->dernier=tmp;
}

char dequeue(file *pp) {
	struct maillon tmp = *pp->dernier;
	free(pp->dernier);
	pp->dernier=tmp.suivant;
	return tmp.valeur;
}

int clear(file *pp) {
	return EXIT_SUCCESS;
}

int see(file *pp) {
	return EXIT_SUCCESS;
}

int empty(file pp) {
	return EXIT_SUCCESS;
}

int main(void) {
	char entree[3];
	bool leave;
	file liste={NULL, NULL};
	printf("La file attend vos ordres (Tapez ""h"" pour afficher l'aide)\n");
	leave=false;
	while(leave==false) {
		scanf("%2s", entree);
		if (entree[0]=='+') {
			enqueue(&liste, entree[1]);
			printf("Le caractère %c a été ajoutationné\n", entree[1]);
		}
		if (entree[0]=='h'){
			printf("======== AIDE ========\n  -  | Retire le premier élement\n  +x | Ajoute un élement\n  c  | Nettoie la file\n  s  | Renvoie l'élement de fin de file\n  q  | Quitte le programme.\n");
		}
		if (entree[0]=='-') {
			if (empty(liste)==1) { printf("Il n'y a pas d'élement à retirationner\n");}
			else { printf("Le caractère %c a été retirationné\n", dequeue(&liste));}
		}
		if (entree[0]=='c') {
			if (empty(liste)==1) { printf("Il n'y a pas d'élement à nettoyationner\n"); }
			else { clear(&liste); printf("La file a été néttoyationnée\n"); }
		}
		if (entree[0]=='s') {
			if (empty(liste)==1) { printf("Il n'y a pas d'élement dans la file\n"); }
			else { printf("Le caractère de fin de file est %c\n", see(&liste)); }
		}
		if (entree[0]=='q') {
			leave=true;
			printf("Au revoir\n");
		}
	}
	return EXIT_SUCCESS;
}
