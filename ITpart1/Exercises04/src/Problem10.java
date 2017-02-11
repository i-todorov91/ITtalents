
public class Problem10 {

	public static void main(String[] args) {
		
		int num = 30;
		
		while (num <= 52){
			int rank = (num - 1) / 4;
			int suit = num % 4;
			
			switch (rank) {
				case 0:
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
					System.out.print(rank + 2);
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
			}
			System.out.print(" ");
			switch (suit) {
				case 0:
					System.out.println("Spades");
					break;
				case 1:
					System.out.print("Clubs");
					System.out.print("; ");
					break;
				case 2:
					System.out.print("Diamond");
					System.out.print("; ");
					break;
				case 3:
					System.out.print("Heart");
					System.out.print("; ");
					break;
			}
			
			num++;
		}
		
		
	}
}
