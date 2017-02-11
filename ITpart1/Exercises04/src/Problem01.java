
public class Problem01 {

	public static void main(String[] args) {
		
		int num1 = 20;
		int num2 = 40;
		
		int min = num1;
		int max = num2;
		
		if (min > max) {
			min = num2;
			max = num1;
		}
		
		for(int i = min; i <= max; i++){
			System.out.print(i + " ");
		}
		
	}
}
