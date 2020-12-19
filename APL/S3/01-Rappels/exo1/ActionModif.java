import java.awt.event.*;

public class ActionModif implements ActionListener {
	private Fenetre fenetre;

	ActionModif(Fenetre f) {
		this.fenetre=f;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String m = e.getActionCommand();
		if (m.equals("/\\")) {
			this.fenetre.augmenter();
		} else if (m.equals("\\/")) {
			this.fenetre.diminuer();
		}
	}
}