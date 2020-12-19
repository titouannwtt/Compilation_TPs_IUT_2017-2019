/**
* Cette classe est une simple coquille pour recevoir la méthode principale
*
* @version 1.1 09 March 2014
* @author Luc Hernandez*/
public class Bonjour { 
  /**
  * Affiche &laquo;Bonjour !&raquo;
  *
  * @param args la liste des arguments de la ligne de commande (inutilisée ici)
  */
  public static void main(String[] args) {
    for(int i=0; i<args.length; i++ ) {
      System.out.println("Bonjour " + args[i] + " ");
    }
  }
}
