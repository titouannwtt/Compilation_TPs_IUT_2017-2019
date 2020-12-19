import javax.swing.JComponent;
import java.awt.*;
 
public class Dessin extends JComponent {
  public Dessin() {
    super();
  }
  @Override
  public void paintComponent(Graphics pinceau) {
    Graphics secondPinceau = pinceau.create();
    if (this.isOpaque()) {
      secondPinceau.setColor(Color.RED);
      secondPinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
    }
    secondPinceau.drawOval(50, 50, 25, 25);
  }
}