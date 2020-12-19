import java.util.*;

public class Frequence {
	public static void main(String[] args) {
		String t=Arrays.toString(args);
		System.out.println("a. "+t);

		String tab[]=Arrays.copyOf(args, 5);
		t=Arrays.toString(tab);
		System.out.println("b. "+t);

		Arrays.sort(args);
		t=Arrays.toString(args);
		System.out.println("c. "+t);
	}
}