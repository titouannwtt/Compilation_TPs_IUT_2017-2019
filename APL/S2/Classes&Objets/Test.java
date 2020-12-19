public class Test {
  public static void main(String[] args) {
    if (args.length!=0) {
      System.out.println("Usage: java Test");
      return;
    }
    Date c = new Date(30, 10, 2010);
    Date d = new Date(31, 01, 2012);
    Periode test = new Periode(c,d);
    System.out.println(test);
    System.out.println(c);
  }
}