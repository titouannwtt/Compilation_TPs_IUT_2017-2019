import javax.swing.*;
import java.awt.*;

public class Camembert extends JComponent {
  private static int x;
  private static int y;
  private static int z;
  private Votes votes;

	Camembert(Votes votes) {
		this.votes=votes;
	}

	@Override
	public void paintComponent(Graphics pinceau){
		Graphics pinceau2 = pinceau.create();
		x=votes.getProportion();
		y=-x/2-90;
		if (this.isOpaque()) {
			pinceau2.setColor(Color.GRAY);
			pinceau2.fillRect(0, 0, 200, 200);
		}
		pinceau2.setColor(Color.GREEN);
		pinceau2.fillOval(50, 50, 100, 100);
		pinceau2.setColor(Color.RED);
		pinceau2.fillArc(50, 50, 100, 100, y, x);
	}
}