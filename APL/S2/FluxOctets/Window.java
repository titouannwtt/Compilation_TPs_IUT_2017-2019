import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Window implements WindowListener {

    private JFrame fenetre = new JFrame();
    private static Memoire configfile;
    private static String color;

    public Window(JFrame fenetre){
        (this.fenetre)=fenetre;
    }

    public Window(JFrame fenetre, Memoire configfile){
        (this.fenetre)=fenetre;
        (this.configfile)=configfile;
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("x="+fenetre.getX()+" | "+"y="+fenetre.getY());
        try{
            color=configfile.getConfig("exo2", "color");
            configfile.setConfig("exo2", "x", String.valueOf(fenetre.getX()));
            configfile.setConfig("exo2", "y", String.valueOf(fenetre.getY()));
            configfile.setConfig("exo2", "color", color);
        } catch(Exception error){
            System.out.println("test");
            error.printStackTrace();
        }
    }

    @Override
    public void windowActivated(WindowEvent e){}   

    @Override   // premier plan
    public void windowClosed(WindowEvent e){}    

    @Override     // après fermeture
    public void windowDeactivated(WindowEvent e){}  

    @Override  // arrière-plan
    public void windowDeiconified(WindowEvent e){}  

    @Override  // restauration
    public void windowIconified(WindowEvent e){}   

    @Override   // minimisation
    public void windowOpened(WindowEvent e){}         
    // après ouverture

}



















                /*
                Rectangle r = fenetre2.getBounds();
                int hauteur = r.height;
                int largeur = r.width;
                System.out.println(hauteur);
                System.out.println(largeur);
                e.getWindow().dispose();
                //Ecrire dans fichier
                try{
                    FileOutputStream fichier = new FileOutputStream("Donnees.txt");
                    DataOutputStream faa = new DataOutputStream(fichier);
                    faa.writeInt(hauteur);
                    faa.writeInt(largeur);
                    Writer wr = new FileWriter("123.txt");
                    wr.write(new Integer(hauteur).toString());
                    wr.write(new Integer(largeur).toString());
                    wr.close();
                }catch(Exception error){}
                //Fin
                */