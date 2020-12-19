import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame {
	private JLabel text;
	private String[] args;
	private int num;
	private ActionModif event;

	public Fenetre(String[] args) {
		super("Exercice 1: Liste");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(100,100);
		this.setLocation(50,50);

		JButton flecheHaut = new JButton("/\\");
		JButton flecheBas = new JButton("\\/");

		this.args=args;
		this.num=0;
		this.text = new JLabel(this.args[this.num]);
		this.text.setHorizontalAlignment(JLabel.CENTER);
		this.add(flecheHaut,BorderLayout.NORTH);
		this.add(flecheBas,BorderLayout.SOUTH);
		this.add(this.text);

		this.event=new ActionModif(this);
		flecheHaut.addActionListener(this.event);
		flecheBas.addActionListener(this.event);
	}

	public void augmenter() {
		this.num++;
		if (this.num>=this.args.length)
			this.num=0;
		this.text.setText(args[this.num]);
	}
	public void diminuer() {
		this.num--;
		if (this.num<0)
			this.num=this.args.length-1;
		this.text.setText(args[this.num]);
	}
}