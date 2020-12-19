import javax.swing.JComponent;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.image.BufferedImage;

public class Commentaire{
    public static void main(String[] args){
        try{
            FileInputStream uu = new FileInputStream(args[0]);
            BufferedReader lecture = new BufferedReader(new InputStreamReader(uu));
            BufferedWriter ecriture = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(args[0]+".html")));
            try{
                System.out.println(uu.getFD());
                String j = lecture.readLine();
                while(j!=null){
                    if j.contains("/*") {
                        ecriture.newLine();
                    }
                    ecriture.write(j);
                    ecriture.newLine();
                    j = lecture.readLine();
                }
                ecriture.close();
                lecture.close();
            }catch(IOException e){
                System.out.println("fail");
            }
        }catch(FileNotFoundException e){
            System.out.println("fail");
        }
    }
}