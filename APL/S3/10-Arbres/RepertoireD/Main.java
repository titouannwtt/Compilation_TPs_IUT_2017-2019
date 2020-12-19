

import java.io.*;
public class Main{
    private static File directory;
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("attention entrez votre nom de répertoire");
        }
        directory=new File(args[0]);
        Noeud recursivite =new Noeud(directory);
        recursivite.affichage(0);
    }
}