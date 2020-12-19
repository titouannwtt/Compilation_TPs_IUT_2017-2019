import java.util.Arrays;

public class ArrayIndexoutOfBounds { 

  public static void main(String[] args) {
      int[] tab = null; 
      int n;
      int i;
      i=1;
      tab = new int[(args.length)];
      for(i=2; i<args.length; i++) {
        tab[i]=Integer.parseInt(args[i]);
      }
      for(i=0; i<args.length; i++) {
        n=tab[i];
        System.out.println(tab[n]);
      }
  }

}
