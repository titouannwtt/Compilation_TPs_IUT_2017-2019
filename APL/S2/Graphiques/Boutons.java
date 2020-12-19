import javax.swing.*;
import java.awt.*;
 
public class Boutons {
  public static void main(String[] args) {
    // un objet pour servir de fenetre
    JFrame fenetre = new JFrame();
    // on configure la fenetre
    fenetre.setSize(500, 300);
    fenetre.setLocation(100, 100);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JRadioButton B1 = new JRadioButton("Proposition 1");
    JRadioButton B2 = new JRadioButton("Proposition 2");
    JRadioButton B3 = new JRadioButton("Proposition 3");
    JRadioButton B4 = new JRadioButton("Proposition 4");
    JRadioButton B5 = new JRadioButton("Proposition 5");
    B1.setHorizontalAlignment(JRadioButton.CENTER);

    fenetre.add(B1, BorderLayout.NORTH);
    fenetre.add(B2, BorderLayout.WEST);
    fenetre.add(B3, BorderLayout.CENTER);
    fenetre.add(B4, BorderLayout.EAST);
    fenetre.add(B5, BorderLayout.SOUTH);
    fenetre.setVisible(true);
  }
}