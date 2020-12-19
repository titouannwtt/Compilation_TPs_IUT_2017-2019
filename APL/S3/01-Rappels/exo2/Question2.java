import javax.swing.*;
import java.awt.*;

public class Question2 {
	public static void main(String[] args) {
		JFrame fenetre = new JFrame();
		Votes votes = new Votes();
		Camembert camembert = new Camembert(votes);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(300,300);
		fenetre.setLocation(400,400);
		fenetre.add(camembert, BorderLayout.CENTER);

		JButton oui = new JButton("OUI");
		JButton non = new JButton("NON");
		fenetre.add(oui,BorderLayout.SOUTH);
		fenetre.add(non,BorderLayout.NORTH);


		Auditeur event = new Auditeur(fenetre, camembert, votes);
		oui.addActionListener(event);
		non.addActionListener(event);


		fenetre.setVisible(true);
	}
}