import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Observateur implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent evenement) {
		String buttonText = evenement.getActionCommand();
		if(buttonText.equals("Jaune")) {
			gestionnaire.setBackground(Color.YELLOW);
		}
		if(buttonText.equals("Magenta")) {
			gestionnaire.setBackground(Color.MAGENTA);
		}
		if(buttonText.equals("Cyan")) {
			gestionnaire.setBackground(Color.CYAN);
		}
	}

	private JPanel gestionnaire;

	public Observateur(JPanel gestionnaire) {
		this.gestionnaire=gestionnaire;
	}
}