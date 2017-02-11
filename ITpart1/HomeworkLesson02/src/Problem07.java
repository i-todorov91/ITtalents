import java.util.Scanner;

/* Problem 3 from Chapter 4.
 * The program takes three variables - hour, money,
 * sickStatus. Based on this variables prints out 
 * what I will do.
 */
public class Problem07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the hour?");
		int hour = sc.nextInt(); //I don't know why we need this variable
		System.out.println("How much money do you have?");
		double money = sc.nextDouble();
		System.out.println("You are sick.");
		boolean sickStatus = sc.nextBoolean();
		
		if (sickStatus) {
			if (money >= 10) {
				System.out.println("I will buy drugs.");
			} else {
				System.out.println("I will just drink some tea.");
			}
		} else {
			if (money >= 10) {
				System.out.println("I will go see a movie with some friends.");
			} else {
				System.out.println("I will just go to a coffee place.");
			}
		}
		
	}
}
