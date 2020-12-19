import javax.swing.*;
import java.awt.*;
 
public class Saisie {
  public static void main(String[] args) {
    // un objet pour servir de fenetre
    JFrame fenetre = new JFrame();
    // on configure la fenetre
    fenetre.setSize(500, 300);
    fenetre.setLocation(100, 100);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JTextArea B1 = new JTextArea();
    JTextArea B2 = new JTextArea();

    B1.setBackground(Color.BLACK);
    B1.setForeground(Color.GREEN);
    
    fenetre.add(B1, BorderLayout.CENTER);
    fenetre.add(B2, BorderLayout.SOUTH);
    fenetre.setVisible(true);
  }
}