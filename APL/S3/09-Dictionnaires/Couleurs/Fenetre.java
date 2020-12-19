import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Color;
import java.awt.GridLayout;
import java.io.*;
import java.util.HashMap;

public class Fenetre extends JFrame{

    private static final long serialVersionUID = 1L;
    private JList<String> contenu;
    private JScrollPane scroll;
    private ListController listener;
    private HashMap<String, Color> map= new HashMap<>();
    private JPanel right;
    public Fenetre(){
        this.readText();
        GridLayout grille = new GridLayout(1,2);
        this.setLayout(grille);
        JPanel left= new JPanel();
        this.right= new JPanel();
        right.setBackground(Color.RED);
        this.listener = new ListController(this);
        this.contenu.addMouseListener(listener);
        this.setSize(700, 700);
        this.setResizable(false);
        this.setTitle("Exercice 1");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.scroll = new JScrollPane(this.contenu);
        left.add(scroll);
        this.add(left);
        this.add(right);

    }

    public void readText(){
        String ligne;
        DefaultListModel<String> model= new DefaultListModel<>();
        String color= new String();
        Color couleur= new Color(0,0,0);
        try {
            BufferedReader lecture = new BufferedReader(
                                     new FileReader("rgb.txt"));
            try {
              while((ligne = lecture.readLine()) != null) {
                couleur = new Color(Integer.parseInt(ligne.substring(0, 3).trim()), Integer.parseInt(ligne.substring(4, 7).trim()), Integer.parseInt(ligne.substring(8,11).trim()));
                color= ligne.substring(11, ligne.length());
                model.addElement(color);
                this.map.put(color, couleur);
              }
            } catch(IOException e) {
              System.err.println("Erreur de lecture dans rgb.txt !");
            }
            try {
              lecture.close();
            } catch(IOException e) {
              System.err.println("Erreur de fermeture de rgb.txt !");
            }
          } catch(FileNotFoundException e) {
            System.err.println("Erreur d'ouverture de rgb.txt !");
          }
        this.contenu =new JList<String>(model);
    }


    public void getSelectItem(){
        Color newColor = this.map.get(contenu.getSelectedValue());
        this.right.setBackground(newColor);
        this.right.repaint();
    }
}