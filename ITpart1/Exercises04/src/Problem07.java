
public class Problem07 {

	public static void main(String[] args) {
		
		int x = 7;
		int num = x + 1;
		for (int i = 1; i <= 10; i++){
			while (true){
				if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0) {
					System.out.print(i + ":" + num + "; ");
					num++;
					break;
				}
				num++;
			}
		}
		
	}
}
