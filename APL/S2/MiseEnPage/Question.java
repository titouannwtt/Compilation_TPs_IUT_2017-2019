/*=====================*/
/*  WATTELET TITOUAN   */
/*=====================*/

import java.awt.*;
import javax.swing.*;
 
public class Question {
  public static void main(String[] args) {
    JFrame fenetre = new JFrame();
    fenetre.setSize(180, 150);
    fenetre.setLocation(100, 100);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel gestionnaire = new JPanel();

    JButton oui = new JButton("Oui");
    JButton non = new JButton("Non");
    JButton nspp = new JButton("NSPP");
    oui.setHorizontalAlignment(JButton.CENTER);
    non.setHorizontalAlignment(JButton.CENTER);
    nspp.setHorizontalAlignment(JButton.CENTER);

    JTextArea zoneDeTexte = new JTextArea("Avez vous un chien ?");
    gestionnaire.add(zoneDeTexte, BorderLayout.NORTH);

    gestionnaire.add(oui, BorderLayout.SOUTH);
    gestionnaire.add(non, BorderLayout.SOUTH);
    gestionnaire.add(nspp, BorderLayout.SOUTH);
    fenetre.add(gestionnaire, BorderLayout.CENTER);
    fenetre.setVisible(true);
  }
}