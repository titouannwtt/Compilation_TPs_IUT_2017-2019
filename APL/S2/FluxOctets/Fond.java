import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Fond {

  //Variables globales
  private static int x;
  private static int y;
  private static String color;
  private static Memoire configfile;
  private static JFrame fenetre;

  public static void main(String[] args) throws Exception {

    //Initialisation des objets nécessaires.
    Memoire configfile = new Memoire();
    JFrame fenetre = new JFrame();
    Window fermeturefenetre = new Window(fenetre, configfile);
    JPanel gestionnaire = new JPanel();
    Observateur observateur = new Observateur(gestionnaire, configfile);

    //Valeur par défaut pour la fenetre en cas de problème.
    x=100;
    y=100;

    //Va chercher les configurations importantes dans le fichier config
    x=Integer.parseInt(configfile.getConfig("exo2", "x"));
    y=Integer.parseInt(configfile.getConfig("exo2", "y"));
    color=configfile.getConfig("exo2", "color");

    //Colorie le fond de la fenêtre
    if (color.equals("Magenta")) {
      gestionnaire.setBackground(Color.MAGENTA);}
    else if (color.equals("Jaune")) {
      gestionnaire.setBackground(Color.YELLOW);}
    else if (color.equals("Cyan")) {
      gestionnaire.setBackground(Color.CYAN);}
    else {
      gestionnaire.setBackground(Color.WHITE);}

    //Crée la fenetre avec ses paramètres
    fenetre.setLocation(x, y);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fenetre.setPreferredSize(new Dimension(300, 150));
    fenetre.setMinimumSize(new Dimension(300, 150));
    fenetre.add(gestionnaire, BorderLayout.CENTER);

    //Texte dans les boutons
    JButton cyan = new JButton("Cyan");
    JButton magenta = new JButton("Magenta");
    JButton jaune = new JButton("Jaune");

    //Permet de relier les boutons avec l'observateur d'intéraction
    cyan.addActionListener(observateur);
    magenta.addActionListener(observateur);
    jaune.addActionListener(observateur);

    //Ajoute les boutons dans le gestionnaire (dans la fenêtre en gros, ...
    //...puisque le gestionnaire est contenu dans la fenêtre).
    gestionnaire.add(cyan);
    gestionnaire.add(magenta);
    gestionnaire.add(jaune);

    //Ajoute les evenements de la fermeture de fenêtre.
    fenetre.addWindowListener(fermeturefenetre);

    //Affiche la fenêtre à l'utilisateur.
    fenetre.setVisible(true);
  }
}