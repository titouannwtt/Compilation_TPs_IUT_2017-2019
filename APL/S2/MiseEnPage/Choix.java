import javax.swing.*;
import java.awt.*;
 
public class Choix {
  public static void main(String[] args) {
    // un objet pour servir de fenetre
    JFrame fenetre = new JFrame();
    // on configure la fenetre
    fenetre.setSize(150, 150);
    fenetre.setLocation(100, 100);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fenetre.setPreferredSize(new Dimension(150, 150));
    fenetre.setMinimumSize(new Dimension(150, 150));
    fenetre.setMaximumSize(new Dimension(150, 150));
    GridLayout gestionnaire = new GridLayout(4, 1);
    fenetre.setLayout(gestionnaire);

    JRadioButton B1 = new JRadioButton("Gryffondor");
    JRadioButton B2 = new JRadioButton("Serdaigle");
    JRadioButton B3 = new JRadioButton("Serpentard");
    JRadioButton B4 = new JRadioButton("Poufsouffle");
    ButtonGroup Group = new ButtonGroup();
    Group.add(B1);
    Group.add(B2);
    Group.add(B3);
    Group.add(B4);
    B1.setHorizontalAlignment(JRadioButton.LEFT);
    B2.setHorizontalAlignment(JRadioButton.LEFT);
    B3.setHorizontalAlignment(JRadioButton.LEFT);
    B4.setHorizontalAlignment(JRadioButton.LEFT);

    fenetre.add(B1, BorderLayout.CENTER);
    fenetre.add(B2, BorderLayout.CENTER);
    fenetre.add(B3, BorderLayout.CENTER);
    fenetre.add(B4, BorderLayout.CENTER);
    fenetre.setVisible(true);
  }
}