import javax.swing.*;
import java.awt.*;

public class Grisaille {
  public static void main(String[] args) {
    JFrame fenetre = new JFrame();
    fenetre.setSize(500, 500);
    fenetre.setLocation(100, 100);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel carre = new JPanel();
    carre.setBackground(Gris.getGris(255, 255, 255));
    fenetre.add(carre);
    fenetre.setVisible(true);
  }
}