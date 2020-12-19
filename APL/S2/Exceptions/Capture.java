import java.util.Arrays;

public class Capture { 

  public static void main(String[] args) {
		int x;
		int y;
		int z;
		x=10;
		y=0;
		//==========================
		try {
			System.out.println(test(x,y));
			System.out.println("Test1");
		} catch(ArithmeticException e1) {
			System.err.println("Test2");
		}
		//==========================
		System.out.println(test(x,y));
  }

  public static int test(int x, int y) {
	int z;
	z=x/y;
	return z;

  }
}
