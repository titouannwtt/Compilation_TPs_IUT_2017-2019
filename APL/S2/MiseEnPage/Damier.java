import javax.swing.*;
import java.awt.*;
public class Damier {
  public static void main(String[] args) {
    int alternance;
    int taille = Integer.parseInt(args[0]); 
    alternance = 1;

    JFrame fenetre = new JFrame();
    fenetre.setSize(500, 500);
    fenetre.setLocation(100, 100);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    GridLayout gestionnaire = new GridLayout(taille, taille, 2, 2);
    fenetre.setLayout(gestionnaire);
    for(int i=0; i<taille; i++) {
        for(int j=0; j<taille; j++) {
            JPanel carre = new JPanel();
            if ( (i+j)%2==0) {
                carre.setBackground(Color.WHITE);
            }
            else {
                carre.setBackground(Color.CYAN);
            }
            fenetre.add(carre);
        }
    }

    fenetre.setVisible(true);
  }
}