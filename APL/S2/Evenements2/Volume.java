import javax.swing.*;
import java.awt.*;
import java.awt.event; 

public class Volume {
  public static void main(String[] args) {
    JFrame fenetre = new JFrame();
    Dessin pinceau = new Dessin(8);
    fenetre.setSize(850, 150);
    fenetre.setLocation(100, 100);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fenetre.add(pinceau);
    Molette listener = new Molette();
    fenetre.setVisible(true);
  }
}