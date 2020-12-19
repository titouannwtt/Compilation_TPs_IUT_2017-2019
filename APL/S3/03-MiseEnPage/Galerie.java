import java.io.*;
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import javax.imageio.*;
import java.net.*;

public class Galerie {
	public static void main(String[] args) {
		try {
			CardLayout cardLayout = new CardLayout();
			JFrame fenetre = new JFrame("Galerie");
	        JPanel contentPane = new JPanel(cardLayout);
	        Controler controler = new Controler(cardLayout, contentPane);
			ImageIcon imageIcon1 = new ImageIcon(new URL("https://dwarves.iut-fbleau.fr/git/DenisLover/Denis_Pics/raw/master/Denis_chapeau.jpg"));
			JLabel image1 = new JLabel(imageIcon1);

			ImageIcon imageIcon2 = new ImageIcon(new URL("https://dwarves.iut-fbleau.fr/git/DenisLover/Denis_Pics/raw/master/challenge_accepted.jpg"));
			JLabel image2 = new JLabel(imageIcon2);

			ImageIcon imageIcon3 = new ImageIcon(new URL("https://dwarves.iut-fbleau.fr/git/DenisLover/Denis_Pics/raw/master/denis1.jpg"));
			JLabel image3 = new JLabel(imageIcon3);

			ImageIcon imageIcon4 = new ImageIcon(new URL("https://dwarves.iut-fbleau.fr/git/DenisLover/Denis_Pics/raw/master/denis_chemise.jpg"));
			JLabel image4 = new JLabel(imageIcon4);

			ImageIcon imageIcon5 = new ImageIcon(new URL("https://dwarves.iut-fbleau.fr/git/DenisLover/Denis_Pics/raw/master/denispr%c3%a9sident.jpg"));
			JLabel image5 = new JLabel(imageIcon5);

			ImageIcon imageIcon6 = new ImageIcon(new URL("https://dwarves.iut-fbleau.fr/git/DenisLover/Denis_Pics/raw/master/facepalm.jpg"));
			JLabel image6 = new JLabel(imageIcon6);

			contentPane.add(image1, "image1");
			contentPane.add(image2, "image2");
			contentPane.add(image3, "image3");
			contentPane.add(image4, "image4");
			contentPane.add(image5, "image5");
			contentPane.add(image6, "image6");

			fenetre.addMouseListener(controler);
			fenetre.add(contentPane, BorderLayout.CENTER);
			fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			fenetre.setResizable(false);
			fenetre.setSize(100,500);
			fenetre.pack();
			fenetre.setVisible(true);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}