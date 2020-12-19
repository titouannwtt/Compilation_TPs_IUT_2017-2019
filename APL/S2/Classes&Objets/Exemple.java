
public class Exemple {
  public static void main(String[] args) {
    if (args.length!=1) {
      System.out.println("Usage: java Exemple <entier>");
      return;
    }
    Compteur c = new Compteur();
    for(int i=0; i<Integer.parseInt(args[0]); i++ ) {
      c.plusUn();
    }
    System.out.println(c);
  }
}