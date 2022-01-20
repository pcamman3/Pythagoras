import java.lang.Math;

public class Pythagoras {
	public static void main(String []args) {
		System.out.println("A right angle triangle has 3 sides. Sides a = 20cm, b = 30cm, c = ?");
		System.out.println("Calculating a^2 + b^2 = c^2");
		
		int output;
		double a = 20;
		double b = 30;
		double c;
			
		c = calculateHypotenuse(a, b);
		
		System.out.println("The answer is: " + c);
	}
	
	public static double calculateHypotenuse(double a, double b) {
		double output = Math.sqrt((a * a) + (b * b));
		return output;
	}
	
}