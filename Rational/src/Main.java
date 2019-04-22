
public class Main {

	public static void main(String[] args) {

		IntegerNumber in1 = new IntegerNumber(4, 8);
		IntegerNumber in2 = new IntegerNumber(3, 7);
		String result = in1.addition(in2).toString();
		System.out.println(result);
	}

}
