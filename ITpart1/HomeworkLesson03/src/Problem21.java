import java.util.Scanner;

/*
 * You have a deck of cards. Insert a variable and print every card from
 * this point on.
 */
public class Problem21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 1 - Take a variable
		int n;
		do {
			System.out.println("Please insert a number from 1 to 51:");
			n = sc.nextInt();
		} while (n < 1 || n > 51);

		// 2 - Define deck and print cards
		int cardSuit;
		int cardRank;

		for (int i = n; i <= 52; i++) {
			cardSuit = i % 4;
			cardRank = (i - 1) / 4;

			switch (cardRank) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
				System.out.print(cardRank + 2);
				break;
			case 9:
				System.out.print("Jack");
				break;
			case 10:
				System.out.print("Queen");
				break;
			case 11:
				System.out.print("King");
				break;
			case 12:
				System.out.print("Ace");
				break;
			default:
				break;
			}

			switch (cardSuit) {
			case 0:
				System.out.print(" of Spades; ");
				break;
			case 1:
				System.out.print(" of Clubs; ");
				break;
			case 2:
				System.out.print(" of Diamonds; ");
				break;
			case 3:
				System.out.print(" of Hearts; ");
				break;
			default:
				break;
			}

		}

	}
}
