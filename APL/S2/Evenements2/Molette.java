import java.awt.event; 
import java.awt.*;
 
public class Molette implements MouseWheelListener {
  private int increment;
  @Override
  public void mouseWheelMoved(MouseWheelEvent e) {
    int d = e.getWheelRotation(); 
    if (d < 0) {
      this.increment--;
    }
    else if (d > 0) {
      this.increment++;
    }
  }
  public int getCount() {
    this.increment=increment;
    return increment;
  }
}