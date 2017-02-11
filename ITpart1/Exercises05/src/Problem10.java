import java.util.Arrays;

public class Problem10 {

	public static void main(String[] args) {
		
		int num = 10;
		int temp = num;
		int count = 0;
		
		while(temp > 0){
			count++;
			temp /= 2;
		}
		temp = num;
		
		int[] bin = new int[count];
		
		for (int i = bin.length - 1; i >= 0; i--) {
			bin[i] = temp % 2;
			temp /= 2;
		}
		System.out.println(Arrays.toString(bin));
		
	}
}
