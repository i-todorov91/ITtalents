
public class Problem08 {

	public static void main(String[] args) {
		
		double c = 5;
		double a = 4;
		double b = 3;
		
		double per = a + b + c;
		double halfPer = per / 2;
		double area = Math.sqrt(halfPer * (halfPer - a) * (halfPer - b) * (halfPer -c));
		
		System.out.println("The perimeter is " + per);
		System.out.println("The area is " + area);
	}
}
