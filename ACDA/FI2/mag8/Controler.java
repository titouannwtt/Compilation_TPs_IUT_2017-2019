/**
 * An instance of this class monitors the view elements for designated
 * events and notifies the relevant object(s).
 *
 * <p>
 * Mouse scroll events are relayed to a {@link History History} instance for
 * navigation between past answers.
 * </p><p>
 * Question validation events are relayed to the same {@link History History}
 * instance for the generation of a new answer.
 * </p><p>
 * Based on Controler class definition
 * generated from StarUML project Mag8 on 12/06/2012
 * </p>
 *
 * @author Luc Hernandez
 */
public class Controler implements java.awt.event.MouseWheelListener, java.awt.event.WindowListener, java.awt.event.ActionListener {
  /**
   * the underlying model
   */
  private History model;

  /**
   * Constructs a <code>Controler</code> object with the specified model.
   *
   * @param  h
   *         the model to be notified in case of an event
   */
  public Controler(History h) {
    model = h;
  }

  /**
   * Reacts to the user validating the text of a question, and empties the input field.
   *
   * @param  e
   *         the object containing the properties of the event.
   */
  public void actionPerformed(java.awt.event.ActionEvent e) {
    model.generate(e.getActionCommand());
    ((javax.swing.JTextField) e.getSource()).setText("");
  }

  /**
   * Reacts to the user mouse scrolling in the area displaying the answers.
   *
   * @param  e
   *         the object containing the properties of the event.
   */
  public void mouseWheelMoved(java.awt.event.MouseWheelEvent e) {
    model.shiftSelection(e.getWheelRotation());
  }

  /**
   * Closes the window when the decoration close button is used
   *
   */
  public void windowClosing(java.awt.event.WindowEvent e) {
    ((javax.swing.JFrame) e.getSource()).dispose();
  }

  public void windowOpened(java.awt.event.WindowEvent e) {}
  public void windowClosed(java.awt.event.WindowEvent e) {}
  public void windowIconified(java.awt.event.WindowEvent e) {}
  public void windowDeiconified(java.awt.event.WindowEvent e) {}
  public void windowActivated(java.awt.event.WindowEvent e) {}
  public void windowDeactivated(java.awt.event.WindowEvent e) {}

}
