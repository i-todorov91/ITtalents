
public class Problem09 {

	public static void main(String[] args) {
		
		long a = 133183;
		long checkPoint = 1 << 17;
		
//		System.out.println(checkPoint);
		
		long max = checkPoint - a;
		long i = (max >> 63) & 1;
		max = checkPoint - i * max;
		
		System.out.println(max == a);
		
	}
}
