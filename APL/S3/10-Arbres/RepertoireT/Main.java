import java.io.File;
import java.nio.file.Files;

public class Main{
    
    public static void main(String[] args) {
        if(args.length < 1){
            System.out.println("Il faut le nom du repertoire en argument.");
        }else{
            File repertoire = new File(args[0]);
            Arbre racine  = new Arbre(repertoire.getName());
            parcourir(repertoire,racine);
            lireArbre(racine, "");
        }
    }

    public static void parcourir(File f, Arbre courant){
        File[] fichiers = f.listFiles();
        if(!f.isDirectory()){
            /*String name = f.getName();
            System.out.println(name);*/
            //Ne rien faire
        }else{
            //System.out.println(f.getName());
            for(File rep : fichiers){
                Arbre noeud = new Arbre(rep.getName());
                courant.setEnfant(noeud);
                parcourir(rep, noeud);
            }
        }
    }

    public static void lireArbre(Arbre arbre, String blank){
        System.out.println(blank+arbre.getName());
        if(arbre.isEnfant()){
            lireArbre(arbre.getEnfant(), blank+"  ");
        }
        if(arbre.isCadet()){
            lireArbre(arbre.getCadet(), blank);
        }
    }

}