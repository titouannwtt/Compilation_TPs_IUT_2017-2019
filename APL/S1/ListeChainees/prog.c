#include <stdlib.h>
#include <stdio.h>

struct entier {
  unsigned short int valeur;
  struct entier* suivant;
};

typedef struct entier maillon;

maillon* ajouter_debut(maillon* premier, int nouveau) {
  maillon* p = (maillon*) malloc(sizeof(maillon));
  if (p) {
    p->suivant = premier;
    p->valeur = nouveau;
  }
  return p;
}

int main(void) {
	
	return EXIT_SUCCESS;
}
