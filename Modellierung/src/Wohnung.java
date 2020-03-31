
public class Wohnung<T> extends Immo {
	
	T a;
	T b;
	T price;
	
	public Wohnung(T a , T b, T price) {
		super(b,b);
		this.price= price;

	}
	public double getSum(double a ,double b) {
		double sum ;
		sum = a + b;
		return sum;
	}
	
	public String toString() {
			
		
		return "Erg: " +a+ "," +b  ;
	}
		

}
