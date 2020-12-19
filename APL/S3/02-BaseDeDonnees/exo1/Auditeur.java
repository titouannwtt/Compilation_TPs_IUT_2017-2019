import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Auditeur implements ActionListener {
	private JFrame fenetre;
	private Camembert camembert;
	private Votes votes;

	Auditeur(JFrame fenetre, Camembert camembert, Votes votes) {
		this.fenetre=fenetre;
		this.camembert=camembert;
		this.votes=votes;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String m = e.getActionCommand();
		if (m.equals("OUI")) {
			votes.addOui();
			this.camembert.repaint();

		} else if (m.equals("NON")) {
			votes.addNon();
			this.camembert.repaint();
		}
	}
}