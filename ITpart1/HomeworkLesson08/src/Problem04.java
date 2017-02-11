import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = null;
		String[] names;
		
		do{
			System.out.println("Insert 2 names separated with ',' !");
			str = sc.nextLine();
			names = str.split(",");
		} while(names.length != 2);
		
		int nameSum;
		int maxNameSum = 0;
		int index = 0;
		boolean equal = false;
		
		for (int i = 0; i < names.length; i++) {
			names[i] = names[i].trim();
			nameSum = 0;
			for (int j = 0; j < names[i].length(); j++) {
				nameSum += (int)names[i].charAt(j);
			}
			if (maxNameSum < nameSum) {
				maxNameSum = nameSum;
				index = i;
			} else if (maxNameSum == nameSum) {
				equal = true;
			}
		}
		
		if (equal) {
			System.out.println("The sum of the 2 names is equal");
		} else {
			System.out.println(names[index]);
		}
		
	}
}
