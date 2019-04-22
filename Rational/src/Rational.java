

public class Rational {
	private int numerator;
	private int denuminator;
	
	public void setNumerateur(int a){
		numerator=a;
    }
    public int getNumerateur(){
        return numerator;
    }
    
    public void setDenominateur(int a){
        if(a==0) System.out.println("Erreur Division par ZERO!");
        else 
        	denuminator=a;
    }
    public int getDenominateur(){
        return denuminator;
    }

	public Rational(int n1, int d1) {
		numerator = n1;
		denuminator = d1;
	}

	public static void main(String args[]) {
		
		String result = "";
		
		String[] a = args[0].split("/");
		String o = args[1];
		String[] b = args[2].split("/");
		
		int n1 = Integer.parseInt(a[0]);	// Integer.parseInt(args[0]); 
		int n2 = Integer.parseInt(b[0]);	// Integer.parseInt(args[1]);
		int d1 = Integer.parseInt(a[1]);	// Integer.parseInt(args[2]);
		int d2 = Integer.parseInt(b[1]);	// Integer.parseInt(args[3]);
		
		Rational rational1 = new Rational(n1, d1);
		Rational rational2 = new Rational(n2, d2);
		if(o.equals("+")) {
			result = addition(rational1,rational2).toString();
			}
		System.out.println(result);
		//assert result.equals("16/32");
	}
	@Override

	public String toString() {
		
		return (numerator + "/" + denuminator);
	}
	
    public static Rational addition(Rational rational1,Rational rational2){
    	Rational result=new Rational(rational1.getNumerateur()*rational2.getDenominateur()+rational1.getDenominateur()*rational2.getNumerateur(),rational1.getDenominateur()*rational2.getDenominateur());
    	return result;
    }
	

	

}
