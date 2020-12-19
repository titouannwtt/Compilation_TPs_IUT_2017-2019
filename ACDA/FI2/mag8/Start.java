/**
 * Container for the main method.
 *
 * @author Luc Hernandez
 */
public class Start implements Runnable {
  /**
   * the frame encompassing the view
   */
  private static javax.swing.JFrame window;
  /**
   * Instanciates the objects composing the program and links them together
   *
   * @param  args
   *         the command line arguments of the program. None are required in this case.
   */
  public static void main(String[] args) {
    javax.swing.JLabel display = new javax.swing.JLabel("?", javax.swing.JLabel.CENTER);
    History model = new History(display);
    Controler control = new Controler(model);
    display.addMouseWheelListener(control);

    javax.swing.JTextField input = new javax.swing.JTextField();
    input.addActionListener(control);

    window = new javax.swing.JFrame("Mag8");
    window.addWindowListener(control);
    window.setResizable(false);
    window.setLayout(new java.awt.BorderLayout());
    window.add(display, java.awt.BorderLayout.CENTER);
    window.add(input, java.awt.BorderLayout.SOUTH);

    (new Thread(new Start())).start();
  }

  /**
   * Creates the visible peers to the graphical objects in the event-handling thread
   */
  public void run() {
    window.setSize(400, 100);
    window.setLocation(100, 100);
    window.setVisible(true);
  }
}
