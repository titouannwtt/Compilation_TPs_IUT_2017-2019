/*=====================*/
/*	WATTELET TITOUAN   */
/*=====================*/

import java.awt.*;
import javax.swing.*;
import java.io.*;

//Class permettant la génération d'un dégradé de lignes
//rouges avec une intensité variant de 0 à 255

public class ImgBin extends JComponent {
	public ImgBin() throws FileNotFoundException {
		super();
	}
	@Override
	public void paintComponent(Graphics pinceau) {

		int x=1;
		int y=1;
		int i=0;
		byte[] rouge = new byte[(int)1];
		byte[] vert = new byte[(int)1];
		byte[] bleu = new byte[(int)1];


		Graphics pixel = pinceau.create();
		String nomFichier = "/export/home/an17/wattelet/works/APL/S2/Octets/image.bin";
		File fichier = new File(nomFichier);
		FileInputStream st;
		try {
			st = new FileInputStream(fichier);
			//st.read( destination, octet de départ, combien d'octets );
		} catch(FileNotFoundException e1) {
			System.out.println(e1.getMessage());
		}

		while(i<=768*1024*3) {
			try {
				st.read( rouge, i, 1 );
				st.read( vert, i+1, 1 );
				st.read( bleu, i+2, 1 );
			} catch (IOException e2) {}
			pixel.setColor(new Color( rouge[1], vert[1], bleu[1]));
			pixel.drawLine(x,y,x,y);
			if (x>=768) {
				y++;
				x=1;
			}
			else {
				x++;
			}
			i=i+3;
		}
	}
}