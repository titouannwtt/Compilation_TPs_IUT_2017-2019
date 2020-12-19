Chaine mapile = new Chaine(110); //initialise une pile de capacite maximale 110
 
int i = 0;
 
while(!estPleine()){
  mapile.empile(i);
  i++;
}
 
mapile.getSommet();
mapile.depile();