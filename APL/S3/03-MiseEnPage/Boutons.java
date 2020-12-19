import java.io.*;
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import javax.imageio.*;
import java.net.*;

public class Boutons {
	public static void main(String[] args) {
			JFrame fenetre = new JFrame("Boutons");
			fenetre.addWindowListener(new WindowAdapterMieux(fenetre));
			fenetre.setResizable(false);
			fenetre.setSize(300,300);
			fenetre.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			fenetre.setVisible(true);
	}
}