import java.util.*;

public class Liste {
	public static void main(String[] args) {

		ArrayList<Integer> integer_list = new ArrayList<Integer>();
		ArrayList<Float> float_list = new ArrayList<Float>();
		ArrayList<Number> number_list = new ArrayList<Number>();

		integer_list.add(2);
		float_list.add((float) 3);
		number_list.add(4);

		float_list.addAll(float_list);
	}
}