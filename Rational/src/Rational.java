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
		String o = args[1].replace("'", "");
		String[] b = args[2].split("/");
		
		int n1 = Integer.parseInt(a[0]);
		int n2 = Integer.parseInt(b[0]);
		int d1 = Integer.parseInt(a[1]);
		int d2 = Integer.parseInt(b[1]);
		
		Rational rational1 = new Rational(n1, d1);
		Rational rational2 = new Rational(n2, d2);
		
		if(o.equals("+")) {
			result = rational1.addition(rational2).toString();
			}
		else if(o.equals("-")) {
			result = rational1.soustraction(rational2).toString();
		}else if(o.equals("*")) {
			result = rational1.multiplication(rational2).toString();
		}else if(o.equals("/")) {
			result = rational1.division(rational2).toString();
		}else if(o.equals("==")) {
			result = rational1.egalite(rational2);
		}
		
		if(!o.equals("==")) {
			String[] res = result.split("/");
			if(res[0].equals("0")) {
				System.out.println(res[0]);
			}else {
				if(res[1].equals("1")) {
					System.out.println(res[0]);
					IntegerNumber integernumber = new IntegerNumber(Integer.parseInt(res[0]));
				}else {
					System.out.println(result);
					//assert result.equals("16/32");
				}
			}
		}else {
			System.out.println(result);
		}
	}
	@Override

	public String toString() {
		
		return (numerator + "/" + denuminator);
	}
	
	public static int PGCD(int a,int b){
        if(a<0) a=-a;
        else
            if(a==0) return b;
        if(b<0)  b=-b;
        else  
            if(b==0) return a;
        if(a==b)
            return a;
        if(a<b)
            return PGCD(a,b-a);
        return PGCD(a-b,b);
    }
	
	public static Rational toCanonique(Rational rational){
        int pgcd=PGCD(rational.getNumerateur(),rational.getDenominateur());
        rational.setNumerateur(rational.getNumerateur()/pgcd);
        rational.setDenominateur(rational.getDenominateur()/pgcd);
        return rational;
    }
	
	public Rational addition(Rational rational) {
		return addition(this, rational);
	}
	
    public static Rational addition(Rational rational1,Rational rational2){
    	Rational result=new Rational(rational1.getNumerateur()*rational2.getDenominateur()+rational1.getDenominateur()*rational2.getNumerateur(),rational1.getDenominateur()*rational2.getDenominateur());
    	return toCanonique(result);
    }
    
    public Rational soustraction(Rational rational) {
		return soustraction(this, rational);
	}
	
    public static Rational soustraction(Rational rational1,Rational rational2){
    	Rational result=new Rational(rational1.getNumerateur()*rational2.getDenominateur()-rational1.getDenominateur()*rational2.getNumerateur(),rational1.getDenominateur()*rational2.getDenominateur());
    	return toCanonique(result);
    }
    
    public Rational multiplication(Rational rational) {
		return multiplication(this, rational);
	}
    
    public static Rational multiplication(Rational rational1,Rational rational2){
    	Rational result=new Rational((rational1.getNumerateur()*rational2.getNumerateur()),(rational1.getDenominateur()*rational2.getDenominateur()));
    	return toCanonique(result); 
    }
    
    public Rational division(Rational rational) {
		return division(this, rational);
	}
    
    public static Rational division(Rational rational1,Rational rational2){
    	Rational result=new Rational((rational1.getNumerateur()*rational2.getDenominateur()),(rational1.getDenominateur()*rational2.getNumerateur()));
    	return toCanonique(result); 
    }
    
    public String egalite(Rational rational) {
		return egalite(this, rational);
	}
    
    public static String egalite(Rational rational1,Rational rational2) {
    	rational1 = toCanonique(rational1);
    	rational2 = toCanonique(rational2);
    	if(rational1.getNumerateur() == rational2.getNumerateur() && rational1.getDenominateur() == rational2.getDenominateur()) {
    		return "Equal";
    	}else {
    		return "Not Equal";
    	}
    }

	

}
