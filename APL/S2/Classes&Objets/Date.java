public class Date {

  private int day;
  private int month;
  private int year;

  public Date(int day, int month, int year) {
    this.day=day;
    this.month=month;
    this.year=year;
  }

  public int getday() {
    return this.day;
  }
  public int getmonth() {
    return this.month;
  }
  public int getyear() {
    return this.year;
  }

  public String toString() {
    return ""+this.day+"-"+this.month+"-"+this.year;
  }
}