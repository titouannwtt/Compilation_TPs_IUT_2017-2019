import java.util.Arrays;

public class Somme { 

  public static void main(String[] args) {
      int[] tab = null; 
      int n;
      tab = new int[args.length];
      for(int i=0; i<args.length; i++) {
        tab[i]=Integer.parseInt(args[i]);
      }
      Arrays.sort(tab);
      for(i=0; i<args.length; i++) {
        n=tab[i];
        System.out.println(tab[n]);
      }
  }

}
