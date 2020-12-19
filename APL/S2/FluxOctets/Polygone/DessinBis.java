import javax.swing.JComponent;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.lang.*;

public class DessinBis extends JComponent {
  public DessinBis() {
    super();
  }
  @Override
  public void paintComponent(Graphics pinceauBis) {
    Graphics secondPinceauBis = pinceauBis.create();
    Polygon polygone = new Polygon();
    if (this.isOpaque()) {
      secondPinceauBis.setColor(Color.RED);
      secondPinceauBis.fillRect(0, 0, this.getWidth(), this.getHeight());
    }
    int[] tab = null;
    try {
      FileInputStream fichier = new FileInputStream("polygoneBis.bin");
      DataInputStream flux = new DataInputStream(fichier);
      try {
          tab = new int [flux.available()/4];
          for(int i=0; i<tab.length; i++) {
            i++;
            polygone.addPoint(flux.readInt(), flux.readInt());
          }
      } catch(IOException e) {
        System.err.println("Erreur lecture: " + e.getMessage());
      }
      try {
        flux.close();
      } catch(IOException e) {
        System.err.println("Erreur fermeture: " + e.getMessage());
      }
    }catch(Exception e) {}
    secondPinceauBis.fillPolygon(polygone);
  }
}