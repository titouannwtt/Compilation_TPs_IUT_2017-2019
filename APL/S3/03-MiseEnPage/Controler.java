import java.awt.event.*;
import java.io.*;
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import javax.imageio.*;
import java.net.*;

public class Controler implements MouseListener {
	
	public Controler(CardLayout cardLayout, Container contentPane) {
		this.cardLayout=cardLayout;
		this.contentPane=contentPane;
	}
	private CardLayout cardLayout;
	private Container contentPane; //On dit que c'est un container car JPanel hérite de la classe container, et dans le cas suivant: on a seulement besoin des propriétés de container.

	@Override
	public void mouseExited(MouseEvent e){}

	@Override
	public void mouseEntered(MouseEvent e){}

	@Override
	public void mouseReleased(MouseEvent e){}

	@Override
	public void mousePressed(MouseEvent e){}

	@Override
	public void mouseClicked(MouseEvent e){
		int x=e.getX();
		int y=e.getY();
		if (x>=500){
			this.cardLayout.next(contentPane);
		}
		else {
			this.cardLayout.previous(contentPane);
		}
	}	

}