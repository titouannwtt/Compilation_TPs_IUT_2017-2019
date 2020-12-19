/* fichier debogueur1.c : exemple a deboguer */

#include <stdio.h>
#include <stdlib.h>

/* fonction principale */
int main(void) {
  int i=-1, j=0, n, k, *mem;

  /* invite */
  printf("Calcul de C(n, k) :\n");

  /* saisie de n */
  printf("Entrez n : ");
  scanf("%d", &n);
  while(n<1) {
    printf("n doit être supérieur ou égal à 1 !\n");
    printf("Entrez n : ");
    scanf("%d", &n);
  }

  /* saisie de k */
  printf("Entrez k : ");
  scanf("%d", &k);
  while((k>n)||(k<1)) {
    printf("k doit être compris entre 1 et %d !\n", n);
    printf("Entrez k : ");
    scanf("%d", &k);
  }

  /* reservation de la place memoire necessaire */
  mem = (int *) malloc(n*sizeof(int));

  /* calculs... */
  while (i<n)
    if(j<1)
      *(mem+(j=i++)+1) = 1;
    else
      *(mem+j--) += *(mem+j);

  /* affichage du resultat */
  printf("C(%d, %d) = ???\n", n, k);

  /* liberation de la memoire */
  free(mem);

  return EXIT_SUCCESS;

}

/* fin du fichier debogueur1.c */
