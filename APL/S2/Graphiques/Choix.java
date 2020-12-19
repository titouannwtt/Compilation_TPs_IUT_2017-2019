import javax.swing.*;
import java.awt.*;
 
public class Choix {
  public static void main(String[] args) {
    // un objet pour servir de fenetre
    JFrame fenetre = new JFrame();
    // on configure la fenetre
    fenetre.setSize(500, 300);
    fenetre.setLocation(100, 100);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JRadioButton B1 = new JRadioButton("Gryffondor");
    JRadioButton B2 = new JRadioButton("Serdaigle");
    JRadioButton B3 = new JRadioButton("Serpentard");
    ButtonGroup Group = new ButtonGroup();
    Group.add(B1);
    Group.add(B2);
    Group.add(B3);
    B1.setHorizontalAlignment(JRadioButton.LEFT);
    B2.setHorizontalAlignment(JRadioButton.LEFT);
    B3.setHorizontalAlignment(JRadioButton.LEFT);

    fenetre.add(B1, BorderLayout.NORTH);
    fenetre.add(B2, BorderLayout.WEST);
    fenetre.add(B3, BorderLayout.SOUTH);
    fenetre.setVisible(true);
  }
}