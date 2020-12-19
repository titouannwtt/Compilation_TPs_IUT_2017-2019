import javax.swing.*;
import java.awt.*;

public class Luminance {
	public static void main(String[] args) {
		JFrame fenetre = new JFrame();
		Parallelogramme parallelogramme = new Parallelogramme();
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(500,120);
		fenetre.setLocation(400,400);
		fenetre.add(parallelogramme, BorderLayout.CENTER);

		//Auditeur event = new Auditeur(fenetre, parallelogramme);

		fenetre.setVisible(true);
	}
}