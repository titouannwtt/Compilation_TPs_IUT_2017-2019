/*=====================*/
/*  WATTELET TITOUAN   */
/*=====================*/

import java.awt.*;
import javax.swing.*;

//Place un dégradé rouge dans une fenêtre

public class Image {
    public static void main(String[] args) {
        ImgBin image = new ImgBin();
        JFrame fenetre = new JFrame();
        fenetre.setSize(768,1024);
        fenetre.add(image);
        fenetre.setVisible(true);
    }
}