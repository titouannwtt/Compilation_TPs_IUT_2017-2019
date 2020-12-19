import javax.swing.*;
import java.awt.*;

public class formes {
  public static void main(String[] args) {
    JFrame fenetre = new JFrame();
    Dessin pinceau = new Dessin();
    fenetre.setSize(500, 500);
    fenetre.setLocation(100, 100);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fenetre.add(pinceau);
    fenetre.setVisible(true);
  }
}