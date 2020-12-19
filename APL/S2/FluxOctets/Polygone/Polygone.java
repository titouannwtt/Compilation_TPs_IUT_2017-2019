import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.lang.*;

public class Polygone {
  public static void main(String[] args) throws Exception {

    //Initialisation des objets nécessaires.
    JFrame fenetre = new JFrame();
    JFrame fenetreBis = new JFrame();
    Dessin pinceau = new Dessin();
    DessinBis pinceauBis = new DessinBis();

    //Crée la fenetre avec ses paramètres
    fenetre.setLocation(100, 100);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fenetre.setPreferredSize(new Dimension(500, 500));
    fenetre.setMinimumSize(new Dimension(500, 500));
    fenetre.add(pinceau);
    fenetre.setVisible(true);

    //Crée la fenetreBis avec ses paramètres
    fenetreBis.setLocation(100, 100);
    fenetreBis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fenetreBis.setPreferredSize(new Dimension(500, 500));
    fenetreBis.setMinimumSize(new Dimension(500, 500));
    fenetreBis.add(pinceauBis);
    fenetreBis.setVisible(true);
  }
}