import java.io.*;

public class Noeud{
   private Noeud[] tabnoeud;
   private File file;
   public Noeud(File toto){
       this.file=toto;
       File[] f= this.file.listFiles();
       if(f != null){
            this.tabnoeud =new Noeud[f.length];
            for(int i=0; i<f.length; i++){
                tabnoeud[i]= new Noeud(f[i]);
            }
       }else{
        this.tabnoeud =new Noeud[0];
       }
   }
   
   public void affichage(int a){
       for(int j=0 ; j<a; j++){
        System.out.print(" ");
       }
        System.out.println(this.file.getName());
        for (Noeud n : tabnoeud) {
            n.affichage(a+2);
        }
   }
}