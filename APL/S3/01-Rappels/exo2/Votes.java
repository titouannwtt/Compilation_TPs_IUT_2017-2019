import javax.swing.*;
import java.awt.*;

public class Votes {

  private static int oui;
  private static int non;
  private static int x;

  public Votes() {
  	this.oui=1;
  	this.non=1;
  }

  public void addOui() {
    this.oui++;
  }

  public void addNon() {
    this.non++;
  }

  public int getProportion() {
	x=(this.non*360)/(this.oui+this.non);
    return x;
  }
}