import java.util.Scanner;

/* Make a program that takes an input of date, month and year
 * and outputs the next date.
 */
public class Problem12 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		//1 - Take 3 variables (date, month, year)
		System.out.println("Insert date:");
		int date = sc.nextInt();
		System.out.println("Insert month:");
		int month = sc.nextInt();
		System.out.println("Insert year:");
		int year = sc.nextInt();
		
		//2 - Check for leap year
		boolean leapYear = ( (year % 4 == 0 && year % 100 !=0) || year % 400 == 0 );
		
		//3 - Check input
		if (year < 0 || month <= 0 || month > 12 || date <= 0 || date > 31 ) {
			System.out.println("Invalid input information.");
		} else {
		
		//4 - Run cases and print result
			switch (month) {
			// months with 31 days.
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
				if (date < 31) {
					date++;
					System.out.println("The next date is " + date + ", " 
							+ month + ", " + year);
				} else {
					date = 1;
					month++;
					System.out.println("The next date is " + date + ", " 
							+ month + ", " + year);
				}
				break;
				
			// months with 30 days.
			case 4:
			case 6:
			case 9:
			case 11:
				if (date < 30) {
					date++;
					System.out.println("The next date is " + date + ", " 
							+ month + ", " + year);
				} else if (date == 30){
					date = 1;
					month++;
					System.out.println("The next date is " + date + ", " 
							+ month + ", " + year);
				} else {
					System.out.println("Invalid input information.");
				}
				break;
				
			// February.
			case 2:
				if (leapYear) {
					if (date < 29) {
						date++;
						System.out.println("The next date is " + date + ", " 
								+ month + ", " + year);
					} else if (date == 29) {
						date = 1;
						month++;
						System.out.println("The next date is " + date + ", " 
								+ month + ", " + year);
					} else {
						System.out.println("Invalid input information.");
					}
				} else {
					if (date < 28) {
						date++;
						System.out.println("The next date is " + date + ", " 
								+ month + ", " + year);
					} else if (date == 28) {
						date = 1;
						month++;
						System.out.println("The next date is " + date + ", " 
								+ month + ", " + year);
					} else {
						System.out.println("Invalid input information.");
					}
				}
				break;
			
			// End of the year case.
			case 12:
				if (date < 31) {
					date++;
					System.out.println("The next date is " + date + ", " 
							+ month + ", " + year);
				} else {
					date = 1;
					month = 1;
					year++;					
					System.out.println("The next date is " + date + ", " 
							+ month + ", " + year);
				}
				break;
				
			default:
				System.out.println("Something went wrong.");
				break;
			}
			
		}
		
	}
}
