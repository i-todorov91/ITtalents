import java.util.Scanner;

/*
 * Да се състави програма, която изчислява N-тото число на Фибоначи.
 * Първото и второто число на Фибоначи са 1-ци, всяко следващо е равно
 * на сбора на предходните 2.
 */
public class Problem01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.println("Please insert the number of the number you want.");
			num = sc.nextInt();
		} while (num <= 0);
		
		System.out.println(fibonacci(num));
		
	}
	
	static int fibonacci(int num){
		if (num == 1) {
			return 1;
		}
		if (num == 2) {
			return 1;
		}
		return fibonacci(num-1) + fibonacci(num - 2);
	}
}
