import java.awt.event.*;
import java.io.*;
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import javax.imageio.*;
import java.net.*;

public class WindowAdapterMieux extends WindowAdapter {
	
	private JFrame fenetre;

	public WindowAdapterMieux(JFrame fenetre) {
		this.fenetre=fenetre;
	}

	@Override
	public void windowClosing(WindowEvent we) {
		int input = JOptionPane.showConfirmDialog(
			null, "Do you want to proceed?", "Select an Option...",
			JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.NO_OPTION);
		if(input == JOptionPane.YES_OPTION) System.exit(0);
		if(input == JOptionPane.NO_OPTION);

	}
}