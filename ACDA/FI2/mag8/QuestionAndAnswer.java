/**
 * Stores a user-supplied question along with the randomly generated answer.
 *
 * Based on QuestionAndAnswer class definition
 * generated from StarUML project Mag8 on 12/06/2012
 *
 * @author Luc Hernandez
 */
public class QuestionAndAnswer {
  /**
   * the answer randomly chosen among pre-determined possibilities
   */
  private String answer;
  /**
   * the question generated by user input
   */
  private String question;

  /**
   * Constructs a <code>QuestionAndAnswer</code> object containing the
   * specified question and answer
   *
   * @param  q
   *         the question
   * @param  a
   *         the answer
   */
  public QuestionAndAnswer(String q, String a) {
    question = q.split("\\s*\\?",2)[0];
    answer = a;
  }

  /**
   * Returns a string representation of the object by concatenating the
   * question and the answer.
   *
   * @return the string representation
   */
  public String toString() {
    return question + " ? " + answer + ".";
  }
}
