import java.util.Scanner;

/*
 * Да се състави програма, чрез която по въведени начална и крайна 
 * цифра се извеждат на всеки нов ред следната последователност 
 * (триъгълник от знаци)
 */
public class Problem04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert first number");
		int num1 = sc.nextInt();
		System.out.println("Insert second number");
		int num2 = sc.nextInt();
		
		triangle(num1, num2);
		
	}
	
	static void triangle(int a, int b){
		if (a > b) {
			return;
		}
		for (int i = 1; i <= a; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		triangle(a + 1, b);
	}
}
