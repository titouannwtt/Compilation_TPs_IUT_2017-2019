import javax.swing.*;
import java.awt.*;
 
public class Sirocco {
  public static void main(String[] args) {
    // un objet pour servir de fenetre
    JFrame fenetre = new JFrame();
    // on configure la fenetre
    fenetre.setSize(500, 300);
    fenetre.setLocation(100, 100);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // un composant pour afficher du texte
    JLabel etiquette = new JLabel("Sirocco");
    // on configure l'etiquette
    etiquette.setHorizontalAlignment(JLabel.LEFT);
    // on ajoute le composant dans la fenetre, au milieu
    fenetre.add(etiquette, BorderLayout.NORTH);
    // et on montre le resultat
    fenetre.setVisible(true);
  }
}