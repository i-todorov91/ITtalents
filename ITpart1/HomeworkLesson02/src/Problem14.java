import java.util.Scanner;

/* Make a program that takes an input of 2 coordinates of 
 * 2 positions on a chess board and print if they are of the 
 * same colour.
 */

public class Problem14 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		//1 - Take an input of coordinates
		System.out.println("Please enter the file of the first piece:");
		byte file1 = sc.nextByte();
		System.out.println("Please enter the rank of the first piece:");
		byte rank1 = sc.nextByte();
		System.out.println("Please enter the file of the second piece:");
		byte file2 = sc.nextByte();
		System.out.println("Please enter the rank of the second piece:");
		byte rank2 = sc.nextByte();
		
		if ( (file1 < 1 || file1 > 8 || rank1 < 1 || file1 > 8) || 
				(file2 < 1 || file2 > 8 || rank2 < 1 || rank2 > 8) ) {
			System.out.println("Invalid input.");
		} else {
		//2 - Check if square is black or white
			char colour1;
			char colour2;
			if ( (file1 + rank1) % 2 == 0) {
				colour1 = 'b';
			} else {
				colour1 = 'w';
			}
			if ( (file2 + rank2) % 2 ==0){
				colour2 = 'b';
			} else {
				colour2 = 'w';
			}
		
		//3 - Check if the squares match and print result
			if (colour1 == colour2) {
				System.out.println("The squares [" + file1 + ", " + rank1
						+ "] and [" + file2 + ", " + rank2 + "] are of the same colour.");
			} else {
				System.out.println("The squares [" + file1 + ", " + rank1
						+ "] and [" + file2 + ", " + rank2 + "] are of a different colour.");
			}
			
		}
		
	}
}
