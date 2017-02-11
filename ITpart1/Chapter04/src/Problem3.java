import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("How much money do you have?");
		double money = sc.nextDouble();
		System.out.println("You are sick.");
		boolean sickStatus = sc.nextBoolean();
		
		if (sickStatus) {
			if (money > 10) {
				System.out.println("You will buy drugs.");
			} else {
				System.out.println("You will buy tea.");
			}
		} else {
			if (money > 10) {
				System.out.println("You will go see a movie.");
			} else {
				System.out.println("You will go for a walk.");
			}
		}
		
	}
}
