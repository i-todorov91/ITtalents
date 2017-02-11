
public class Problem04 {

	public static void main(String[] args) {
		
		int a = 'a';
		int z = 'z';
		
		char[] charArr = { 'a', 's', 'g', 'w', 'g' };
		int index = 0;
		
		for (index = 0; index < charArr.length; index++) {
			if (charArr[index] < a || charArr[index] > z) {
				System.out.println("There is a character that is not in the zone!");
				break;
			}
		}
		
		if (index == charArr.length) {
			System.out.println("The whole array is okay ;)");
		}
	}
}
