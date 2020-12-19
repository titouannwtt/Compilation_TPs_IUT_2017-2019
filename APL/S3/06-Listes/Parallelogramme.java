import javax.swing.*;
import java.awt.*;

public class Parallelogramme extends JComponent {
  /*private static int x;
  private static int y;
  private static int z;*/

	@Override
	public void paintComponent(Graphics pinceau){
		Graphics pinceau2 = pinceau.create();
		if (this.isOpaque()) {
			pinceau2.setColor(Color.GRAY);
			pinceau2.fillRect(0, 0, 200, 200);
		}
		for(int i=0; i<=5; i++) {
			int [] polContourX = { (i*60)-(i*20)-2, (i*60)+30-(i*20)-2, (i*60)+60-(i*20)+2, (i*60)+30-(i*20)+2 };
			int [] polContourY = { 82, 8, 8, 82 };
			Polygon polygonContour = new Polygon(polContourX, polContourY, 4);
			pinceau2.setColor(Color.BLACK);
			pinceau2.fillPolygon(polygonContour);

			int [] polCouleurX = { (i*60)-(i*20), (i*60)+30-(i*20), (i*60)+60-(i*20), (i*60)+30-(i*20) };
			int [] polCouleurY = { 80, 10, 10, 80 };
			Polygon polygonCouleur = new Polygon(polCouleurX, polCouleurY, 4);
			pinceau2.setColor(Color.PINK);
			pinceau2.fillPolygon(polygonCouleur);
		}
	}
}