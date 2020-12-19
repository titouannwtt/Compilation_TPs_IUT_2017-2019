import javax.swing.*;
import java.awt.*;

public class Fond {
  public static void main(String[] args) {
    try {
        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
    } catch(ClassNotFoundException e1) {

    } catch(InstantiationException e2) {

    } catch(IllegalAccessException e3) {

    } catch(UnsupportedLookAndFeelException e4) {
        
    }
    JFrame fenetre = new JFrame();
    fenetre.setLocation(100, 100);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fenetre.setPreferredSize(new Dimension(300, 150));
    fenetre.setMinimumSize(new Dimension(300, 150));

    JPanel gestionnaire = new JPanel();
    fenetre.add(gestionnaire, BorderLayout.CENTER);

    JButton cyan = new JButton("Cyan");
    JButton magenta = new JButton("Magenta");
    JButton jaune = new JButton("Jaune");

    Observateur observateur = new Observateur(gestionnaire);

    cyan.addActionListener(observateur);
    magenta.addActionListener(observateur);
    jaune.addActionListener(observateur);

    gestionnaire.add(cyan);
    gestionnaire.add(magenta);
    gestionnaire.add(jaune);

    fenetre.setVisible(true);
  }
}