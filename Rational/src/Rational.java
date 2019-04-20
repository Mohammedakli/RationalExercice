
public class Rational {
	private int numerator;
	private int denuminator;

	public Rational(int n1, int d1) {
		numerator = n1;
		denuminator = d1;
	}

	public static void main(String args[]) {
		
		int n1 = Integer.parseInt(args[0]); 
		int n2 = Integer.parseInt(args[1]);
		int d1 = Integer.parseInt(args[2]);
		int d2 = Integer.parseInt(args[3]);
		
		Rational r = add(new Rational(n1, d1), new Rational(n2, d2));
		String result = Integer.toString(r.numerator) + "/" + Integer.toString(r.denuminator);
		
		String output = r.toString();
		System.out.println(output);
		
		
		
		assert result.equals("16/32");
	}
	@Override

	public String toString() {
		
		return (numerator + "/" + denuminator);
	}

	private static Rational add(Rational rational, Rational rational2) {
		
		int n1 = rational.numerator;
		int n2 = rational2.numerator;
		int d2 = rational2.denuminator;
		int d1 = rational.denuminator;
		int n = (n1*d2+n2*d1);
		int d = (d1*d2);
		return new Rational(n, d) ;
	}

}
