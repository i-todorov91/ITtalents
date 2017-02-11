import java.util.Scanner;

/*
 * Да се състави програма, чрез която се въвежда естествено число N.
 * Програмата да извежда число, чиито цифри са написани в ред обратен
 * на въведеното число.
 */
public class Problem05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert number");
		int num = sc.nextInt();
		
		System.out.println(reverse(num));
		System.out.println(num == reverse(num)? "polindrome":"NOT a polindrome");
		
	}
	
	static int reverse(int num) {
	    if (num < 10) {
	        return num;
	    }
	    int n = num;
	    int pow = 1;

	    while (n >= 10) {
	        n = n / 10;
	        pow = pow * 10;
	    }
	    
	    return (num % 10 * pow + reverse(num / 10));
	}
	
}
