public class Arbre{

    private Arbre enfant=null;
    private Arbre cadet=null;
    private String nom;

    public Arbre(String name){
        this.nom = name;
    }

    public Arbre getEnfant(){
        return this.enfant;
    }

    public Arbre getCadet(){
        return this.cadet;
    }

    public String getName(){
        return this.nom;
    }

    public void setCadet(Arbre c){
        if(!isCadet()){
            this.cadet = c;
        }else{
            this.cadet.setCadet(c);
        }
    }

    public void setEnfant(Arbre e){
        if(!isEnfant()){
            this.enfant = e;
        }else{
            this.enfant.setCadet(e);
        }
    }

    public boolean isCadet(){
        try{
            if(this.cadet != null){
                return true;
            }
        }catch(NullPointerException e){
            return false;
        }
        return false;
    }

    public boolean isEnfant(){
        try{
            if(this.enfant != null){
                return true;
            }
        }catch(NullPointerException e){
            return false;
        }
        return false;
    }

}