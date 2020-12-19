import javax.swing.JOptionPane;
 
public class Moyenne {

  private int nbValeur;
  private double somme;

  public Moyenne() {
    nbValeur=0;
    somme=0;
  }
  
  public void add(double x){
    somme=somme+x;
    nbValeur++;
  }
  public void afficher(){
    double moyenne;
    moyenne=(somme/nbValeur);
    System.out.println("Moyenne="+moyenne);  
  }
}