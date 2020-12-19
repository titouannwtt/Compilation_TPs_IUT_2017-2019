public class Liste {
	public static void main(String[] args) {
		if (args.length==0) {
			System.out.println("Vous devez donner des arguments");
		}
		Fenetre fenetre = new Fenetre(args);
		fenetre.setVisible(true);
	}
}