import javax.swing.JComponent;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.image.BufferedImage;

public class Conversion{
    public static void main(String[] args){
        try{
            FileInputStream uu = new FileInputStream(args[0]);
            BufferedReader lecture = new BufferedReader(new InputStreamReader(uu));
            BufferedWriter ecriture = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(args[0]+".html")));
            try{
                System.out.println(uu.getFD());
                ecriture.write("<!DOCTYPE html>");
                ecriture.newLine();
                ecriture.write("<html lang='fr'>");
                ecriture.newLine();
                ecriture.write("<head>");
                ecriture.newLine();
                ecriture.write("<title>"+args[0]+"</title>");
                ecriture.newLine();
                ecriture.write("<meta charset ='UTF-8'/>");
                ecriture.newLine();
                ecriture.write("</head>");
                ecriture.newLine();
                ecriture.write("<body>");
                ecriture.newLine();
                String j = lecture.readLine();
                while(j!=null){
                    ecriture.write("<p>");
                    ecriture.write(j);
                    ecriture.write("</p>");
                    ecriture.newLine();
                    j = lecture.readLine();
                }
                ecriture.newLine();
                ecriture.write("</body>");
                ecriture.newLine();
                ecriture.write("</html>");
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