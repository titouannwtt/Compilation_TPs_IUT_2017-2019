import java.util.*;
import java.lang.*;

public class Appels {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Syntaxe: java Appels <n>");
		}
		else {
			int n=Integer.parseInt(args[0]);
			//int f=Integer.parseInt(args[0]);
			System.out.println(factoriel(n /*,f*/));
		}
	}

	public static int factoriel(int n) {
		if(n<=1) {
			return 1;
		}
		else {
			return (n*factoriel(n-1));
		}
	}
}