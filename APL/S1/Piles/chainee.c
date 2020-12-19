#include <stdio.h>
#include <stdlib.h>

struct maillon {
	char valeur;
	struct maillon * suivant;
};
typedef struct maillon * pile;
typedef enum { false, true } bool;

int empty(pile p) {
	return p==NULL;
}

void push(char n, pile * pp) {
	struct maillon *w = (struct maillon *) malloc(sizeof (struct maillon));
	w->valeur=n;
	w->suivant=*pp;
	*pp=w;
}

char pop(pile *pp) {
	struct maillon tmp = **pp;
	free(*pp);
	*pp=tmp.suivant;
	return tmp.valeur;
}

void clear(pile *pp) {
	while(empty(*pp)==0) {
		struct maillon tmp = **pp;
		free(*pp);
		*pp=tmp.suivant;
	}
}

char top(pile *pp) {
	struct maillon tmp = **pp;
	return tmp.valeur;
}

int main(void) {
	char entree[3];
	bool leave;
	pile liste=NULL;
	printf("La pile attend vos ordres (Tapez ""h"" pour afficher l'aide)\n");
	leave=false;
	while(leave==false) {
		scanf("%2s", entree);
		if (entree[0]=='+') {
			push(entree[1], &liste);
			printf("Le caractère %c a été ajoutationné\n", entree[1]);
		}
		if (entree[0]=='h'){
			printf("======== AIDE ========\n  -  | Retire le dernier élement\n  +x | Ajoute un élement\n  c  | Nettoie la pile\n  t  | Renvoie l'élement en haut de la pile\n  q  | Quitte le programme.\n");
		}
		if (entree[0]=='-') {
			if (empty(liste)==1) { printf("Il n'y a pas d'élement à retirationner\n");}
			else { printf("Le caractère %c a été retirationné\n", pop(&liste));}
		}
		if (entree[0]=='c') {
			if (empty(liste)==1) { printf("Il n'y a pas d'élement à nettoyationner\n"); }
			else { clear(&liste); printf("La pile a été néttoyationnée\n"); }
		}
		if (entree[0]=='t') {
			if (empty(liste)==1) { printf("Il n'y a pas d'élement dans la pile\n"); }
			else { printf("Le caractère au sommet de la pile est %c\n", top(&liste)); }
		}
		if (entree[0]=='q') {
			leave=true;
			printf("Au revoir\n");
		}
	}
	return EXIT_SUCCESS;
}