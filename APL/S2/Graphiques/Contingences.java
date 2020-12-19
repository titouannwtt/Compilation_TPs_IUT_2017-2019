import javax.swing.*;
import java.awt.*;
 
public class Contingences {
  public static void main(String[] args) {
    // un objet pour servir de fenetre
    JFrame fenetre = new JFrame();
    // on configure la fenetre
    fenetre.setSize(500, 300);
    fenetre.setLocation(100, 100);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JTextArea b1 = new JTextArea();
    JTextArea b2 = new JTextArea();
    JScrollPane sb = new JScrollPane(b1);

    b1.setBackground(Color.BLACK);
    b1.setForeground(Color.GREEN);
    b1.setLineWrap(true);
    sb.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

    fenetre.add(sb, BorderLayout.CENTER);
    fenetre.add(b2, BorderLayout.SOUTH);
    fenetre.setVisible(true);
  }
}