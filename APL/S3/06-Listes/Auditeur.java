import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Mouse implements MouseListener {
	private JFrame fenetre;
	private Parallelogramme parallelogramme;

	Auditeur(JFrame fenetre, Parallelogramme parallelogramme) {
		this.fenetre=fenetre;
		this.parallelogramme=parallelogramme;
	}
	
	@Override
	public void mouseClicked(MouseEvent evenement) {}
	
	@Override
	public void mouseEntered(MouseEvent evenement) {}
	
	@Override
	public void mouseReleased(MouseEvent evenement) {}
	
	@Override
	public void mouseExited(MouseEvent evenement) {}
	
	@Override
	public void mousePressed(MouseEvent evenement) {
		int clicX=evenement.getX();
		int clicY=evenement.getY();
		System.out.println(" ");
		fenetre.repaint();
		this.camembert.repaint();
	}
}