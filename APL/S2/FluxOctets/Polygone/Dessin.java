import javax.swing.JComponent;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.lang.*;

public class Dessin extends JComponent {
  public Dessin() {
    super();
  }
  @Override
  public void paintComponent(Graphics pinceau) {
    Graphics secondPinceau = pinceau.create();
    Polygon polygone = new Polygon();
    if (this.isOpaque()) {
      secondPinceau.setColor(Color.RED);
      secondPinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
    }
    int[] tab = null;
    try {
      FileInputStream fichier = new FileInputStream("polygone.bin");
      DataInputStream flux = new DataInputStream(fichier);
      FileOutputStream fichierBis = new FileOutputStream("polygoneBis.bin");
      DataOutputStream fluxBis = new DataOutputStream(fichierBis);
      try {
          tab = new int [flux.available()/4];
          for(int i=0; i<tab.length; i++) {
            tab[i]=flux.readInt();
            fluxBis.writeInt((tab[i]*2));
            i++;
            tab[i]=flux.readInt();
            fluxBis.writeInt((tab[i]*2));
            polygone.addPoint(tab[i-1], tab[i]);
          }
      } catch(IOException e) {
        System.err.println("Erreur lecture: " + e.getMessage());
      }
      try {
        flux.close();
        fluxBis.close();
      } catch(IOException e) {
        System.err.println("Erreur fermeture: " + e.getMessage());
      }
    }catch(Exception e) {}
    secondPinceau.fillPolygon(polygone);
  }
}