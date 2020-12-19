import java.util.*;
import java.lang.*;

public class Arithmetique {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.err.println("Syntaxe: java Arithmetique [<n1> <n2> <opérande>] ");
		}
		else {
			int taille=args.length;
			int n=0;
			int n1=0;
			int n2=0;
			Stack<Integer> stack = new Stack<Integer>();
			for(int i=0; i<taille; i++) {
				if( args[i].equals("+") || args[i].equals("-") || args[i].equals("x") || args[i].equals("/")) {
					System.out.println("Opération détéctée");
					n2=stack.pop();
					System.out.println(""+n2+" récupéré de la pile.");
					n1=stack.pop();
					System.out.println(""+n1+" récupéré de la pile.");
					if ( args[i].equals("+") ) {
						n=n1+n2;
						System.out.println("Opération faite: "+n+"="+n1+"+"+n2);
					}
					else if ( args[i].equals("-") ) {
						n=n1-n2;
						System.out.println("Opération faite: "+n+"="+n1+"-"+n2);
					}
					else if ( args[i].equals("x") ) {
						n=n1*n2;
						System.out.println("Opération faite: "+n+"="+n1+"*"+n2);
					}
					else if ( args[i].equals("/") ) {
						n=n1/n2;
						System.out.println("Opération faite: "+n+"="+n1+"/"+n2);
					}
					stack.push(n);
				}
				else {
					n=Integer.parseInt(args[i]);
					stack.push(n);
					System.out.println(""+n+" ajouté à la pile.");
				}
			}
			n=stack.pop();
			System.out.println("Résultat = "+n);
		}
	}
}