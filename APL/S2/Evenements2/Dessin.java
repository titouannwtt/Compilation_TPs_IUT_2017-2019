import javax.swing.JComponent;
import java.awt.*;
 
public class Dessin extends JComponent {

  private int count;

  public Dessin(int count) {
    super();
    this.count=count;
  }
  @Override
  public void paintComponent(Graphics pinceau) {
    Graphics secondPinceau = pinceau.create();
    if (this.isOpaque()) {
      secondPinceau.setColor(Color.RED);
      secondPinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
    }
    int i=0;
    while(i < 10) {
      if (i<count) {
        secondPinceau.fillOval(25+(80*i), 30, 50, 50);
      }
      else {
        secondPinceau.drawOval(25+(80*i), 30, 50, 50);
      }
      i++;
    }
  }
}