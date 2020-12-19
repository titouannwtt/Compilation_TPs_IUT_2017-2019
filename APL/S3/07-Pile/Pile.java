import java.util.*;
import java.lang.*;

public class Pile {
	private int sommet;
	private int[] piles;

    Pile(int capacite) {
		piles = new int[capacite];   //creer une nouvelle pile vide de taille maximal capacite
		sommet = -1;  //pour que le premier élément soit à piles[0]
	}
 
	int getSommet() {
		return piles[sommet];
	}
 
	boolean estVide() {
		if (sommet == -1) {
			return true;
		}
		return false;
	}
 
	boolean estPleine() {
		if (sommet == piles.length) {
			return true;
		}
		return false;
	}
     
	void empile(float element) {
		if ( estPleine() ) {
			System.err.println("Impossible d'empiler : la pile est pleine.");
		}
		piles[sommet+1] = element;
		sommet++;
	}
 
	int depile() {
		if ( estVide() ) {
			System.err.println("Impossible de depiler : la pile est vide.");
		}
		sommet--;
		return piles[sommet+1];
	}
 
	String versChaine() { //Pour afficher le contenu de la pile
		if ( estVide() ) {
			return "[]";
		}
		if (sommet == 0) {
			return "["+getSommet()+"]";
		}
		return "["+piles[0]+" "+getSommet()+"]";
    }
}