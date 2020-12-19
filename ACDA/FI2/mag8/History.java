import java.util.Random;
import java.util.Arrays;
import javax.swing.*;
import java.awt.*;

/**
 * A repository for all answers to the user's questions
 *
 * <p>
 * This class stores question/answer pairs in an array that extends if need be,
 * and also remembers which particular couple is currently in display.
 * </p><p>
 * Based on History class definition
 * generated from StarUML project Mag8 on 12/06/2012
 * </p>
 *
 * @author Luc Hernandez
 */
public class History {
  /**
   * The list of all possible answers
   */
  private static final String[] PossibleAnswers = {
    "It is certain",
    "It is decidedly so",				//affirmative
    "Without a doubt",					//affirmative
    "Yes – definitely",					//affirmative
    "You may rely on it",				//affirmative
    "As I see it, yes",					//affirmative
    "Most likely",						//affirmative
    "Outlook good",						//affirmative
    "Signs point to yes",				//affirmative
    "Yes",								//affirmative
    "Reply hazy, try again",			//abstraite
    "Ask again later",					//abstraite
    "Better not tell you now",			//abstraite
    "Cannot predict now",				//abstraite
    "Concentrate and ask again",		//abstraite
    "Don't count on it",  				//negative
    "My reply is no",					//negative
    "My sources say no",				//negative
    "Outlook not so good",				//negative
    "Very doubtful"						//negative
  };
  /**
   * the number of question/answers associations this class can initially store
   */
  private static final int CAPACITY_INITIAL = 50;
  /**
   * the number of question/answers associations added to the storage capacity in case of overflow
   */
  private static final int CAPACITY_INCREMENT = 20;
  /**
   * index of the association currently displayed
   */
  private int currentSelection;
  /**
   * current number of associations stored
   */
  private int size;
  /**
   * array of all stored question/answer associations
   */
  private QuestionAndAnswer[] list;
  /**
   * view element responsible for the display of current association
   */
  private javax.swing.JLabel view;
  /**
   * random number generator for answer selection
   */
  private Random rng;

  /**
   * Constructs a <code>History</code> object linked to the specified view
   * element
   *
   * @param  v
   *         the view element that displays answers
   */
  public History(javax.swing.JLabel v) {
    currentSelection = -1;
    size = 0;
    list = new QuestionAndAnswer[CAPACITY_INITIAL];
    view = v;
	view.setOpaque(true);
    rng = new Random(System.currentTimeMillis());
  }

  /**
   * Generates an answer to a new question, and updates the view accordingly.
   *
   * @param  question
   *         the text of the question as typed by the user.
   */
  public void generate(String question) {
    int choice = rng.nextInt(PossibleAnswers.length);
    QuestionAndAnswer qna = new QuestionAndAnswer(question,
                                                  PossibleAnswers[choice]);

    if (size >= list.length)
      list = Arrays.copyOf(list, list.length + CAPACITY_INCREMENT);

    list[size++] = qna;

    currentSelection = size - 1;
    refreshView();
  }

  /**
   * Changes the displayed answer by moving forward or backward in the
   * chronological order (if possible).
   *
   * @param  offset
   *         the number of steps to take (backward in time if negative).
   */
  public void shiftSelection(int offset) {
    if (size != 0) {
      int oldSelection = currentSelection;

      currentSelection += offset;
      if (currentSelection < 0)
        currentSelection = 0;
      else if (currentSelection >= size)
        currentSelection = size - 1;

      if (currentSelection != oldSelection)
        refreshView();
    }
  }

  /**
   * Sends updated information to be displayed.
   */
  protected void refreshView() {
	int color = currentSelection;
	while(color>19) {
		color=color-20;
	}
	if(color<=9) {
		System.out.println("Réponse "+color+": afficher du "+ "vert");
		view.setBackground(Color.GREEN);
	}
	else if(color<=14) {
		System.out.println("Réponse "+color+": afficher du "+ "orange");
		view.setBackground(Color.ORANGE);
	}
	else {
		System.out.println("Réponse "+color+": afficher du "+ "rouge");
		view.setBackground(Color.RED);
	}
    view.setText((currentSelection + 1) +") " + list[currentSelection].toString());
  }
}
