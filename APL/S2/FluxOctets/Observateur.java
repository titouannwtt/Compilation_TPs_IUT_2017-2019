import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Observateur implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent evenement) {
		String buttonText = evenement.getActionCommand();

		if(buttonText.equals("Jaune")) {
			gestionnaire.setBackground(Color.YELLOW);
			try {
            	configfile.setConfig("exo2", "color", "Jaune");
            } catch (Exception e) {}
		}
		if(buttonText.equals("Magenta")) {
			gestionnaire.setBackground(Color.MAGENTA);
			try {
            	configfile.setConfig("exo2", "color", "Magenta");
            } catch (Exception e) {}
		}
		if(buttonText.equals("Cyan")) {
			gestionnaire.setBackground(Color.CYAN);
			try {
            	configfile.setConfig("exo2", "color", "Cyan");
            } catch (Exception e) {}
		}
	}

	private JPanel gestionnaire;
    private static Memoire configfile;

	public Observateur(JPanel gestionnaire, Memoire configfile) {
		this.gestionnaire=gestionnaire;
		this.configfile=configfile;
	}
}