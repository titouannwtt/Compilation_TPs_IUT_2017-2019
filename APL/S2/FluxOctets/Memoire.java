import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.lang.Exception;

public class Memoire {
    public String getConfig(String fichier, String key) throws Exception {

        //Ouvre le fichier config en tant que Flux
        String leFichier = System.getProperty("user.dir") + "/config/" + fichier;
    	FileInputStream fileInputStream = new FileInputStream(leFichier);

        //Transforme le fichier ouvert en "pseudo-config"
        Properties config = new Properties();
        config.load(fileInputStream);

        //Recupère les infos dans le fichier config
        String tmp = config.getProperty(key);

        //Manipulations nécessaires lorsqu'on a fini de prendre les infos dans le fichier.
        fileInputStream.close();
        leFichier = null;
        fileInputStream = null;
        config = null;

        //Erreur si la clef n'est pas trouver dans le config
        //(exemple si on veut "x" mais que x n'est pas défini dans le fichier config)
        if (tmp == null) {
        	throw new Exception("Impossible de trouver '" + key + "' dans le fichier: '" + fichier+"'");
        }

        //Renvoyer la valeur demandée.
        return tmp; 
    }
    public void setConfig(String fichier, String key, String valeur) throws Exception {

        //Ouvre le fichier config en tant que Flux
        String leFichier = System.getProperty("user.dir") + "/config/" + fichier;
        FileOutputStream fileOutputStream = new FileOutputStream(leFichier,true);

        //Transforme le fichier ouvert en "pseudo-config"
        Properties config = new Properties();

        //Ecris dans le fichier
        config.setProperty(key,valeur);
        config.store (fileOutputStream,"Dernière mise a jour :"); 

        //Manipulations nécessaires lorsqu'on a fini de mettre les infos dans le fichier.
        fileOutputStream.close();
        leFichier = null;
        fileOutputStream = null;
        config = null;
    } 
}