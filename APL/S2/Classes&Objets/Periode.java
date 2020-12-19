public class Periode {

  private Date a;
  private Date b;
  private int nbDay;

  public Periode(Date a, Date b) {
    this.a=a;
    this.b=b;
  }

  public String toString() {
    return ""+ a + b;
  }
}