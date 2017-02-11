
public class Problem08 {

	public static void main(String[] args) {
		
		int tank = 101;
		int duo = tank / 5;
		int rem = tank % 5;
		
		switch (rem) {
		case 1:
			System.out.println((duo - 1) + " duos and two 3's");
			break;
		case 2:
			System.out.println(duo + " duos and 2");
			break;
		case 3:
			System.out.println(duo + " duos and 3");
			break;
		case 4:
			System.out.println(duo + " duos and two 2's");
			break;

		default:
			System.out.println(duo + " duos.");
			break;
		}
		
	}
}
