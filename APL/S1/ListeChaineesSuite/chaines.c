/* TITOUAN WATTELET */

#include <stdlib.h>
#include <stdio.h>
#include <unistd.h>

typedef struct caractere caractere;
typedef struct Liste Liste;

struct caractere {
    char cara;
    caractere *suivant;
};

struct Liste {
    caractere *premier;
};

Liste *initialisation() {
    Liste *liste = malloc(sizeof(*liste));
    caractere *element = malloc(sizeof(*element));
    if (liste == NULL || element == NULL) {
        exit(EXIT_FAILURE);
    }
    element->cara = 0;
    element->suivant = NULL;
    liste->premier = element;
    return liste;
}

void insertion(Liste *liste, char nvCara) {
    /* Création du nouvel élément */
    caractere *nouveau = malloc(sizeof(*nouveau));
    if (liste == NULL || nouveau == NULL)
    {
        exit(EXIT_FAILURE);
    }
    nouveau->cara = nvCara;

    /* Insertion de l'élément au début de la liste */
    nouveau->suivant = liste->premier;
    liste->premier = nouveau;
}

void afficherListe(Liste *liste) {
    if (liste == NULL) {
        exit(EXIT_FAILURE);
    }
    caractere *actuel = liste->premier;
    while (actuel != NULL) {
        printf("%c", actuel->cara);
        actuel = actuel->suivant;
    }
    printf("\n");
}

int main(void) {
	char tab[20];
	int count;
	int x;
	x=0;
	Liste *maListe = initialisation();
	while ( (x!=1) && (x!=2) && (x!=3) ) {
		printf("Quel mode voulez-vous ?\n 1 : Tableau vers liste\n 2 : Liste vers tableau\n 3 : Taper une liste chainée\n");
		scanf("%d", &x);
		if (x==1) {
			tab[0]='c';
			tab[1]='o';
			tab[2]='u';
			tab[3]='c';
			tab[4]='o';
			tab[5]='u';
			count=5;
			while (count!=-1) {
				insertion(maListe, tab[count]);
				count--;
			}
			afficherListe(maListe);
		}
		if (x==2) {
			count=0;
			insertion(maListe, 'u');
			insertion(maListe, 'o');
			insertion(maListe, 'c');
			insertion(maListe, 'u');
			insertion(maListe, 'o');
			insertion(maListe, 'c');
			if (maListe == NULL) {
				exit(EXIT_FAILURE);
			}
			caractere *actuel = maListe->premier;
			while (actuel != NULL) {
				tab[count]=actuel->cara;
				count++;
				actuel = actuel->suivant;
			}
			printf("%s", tab);
			printf("\n");
		}
		if (x==3) {

		}
	}
	return EXIT_SUCCESS;
}