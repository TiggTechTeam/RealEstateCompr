
public class Haus<T> extends Immo {
	
	T a;
	T b;
	T price;
	
	public Haus(T a , T b, T price) {
		super(a, b);
		this.price= price;
		
	}
	public double getSum(double a ,double b) {
		double sum ;
		sum = a + b;
		return sum;
	}
	@Override
	public boolean equals(Object other) {
		Wohnung w = (Wohnung) other;
		return w.price == price;
	}
	
	public String toString() {
			
		
		return "Erg: " +a+ "," +b  ;
	}
		

}
