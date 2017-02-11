
public class Problem10 {

	public static void main(String[] args) {
		
		int date = 5;
		int month = 11;
		int year = 2016;
				
		boolean isLeap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
			if (date < 31) {
				date++;
			} else {
				date = 1;
				month++;
			}		
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (date < 30) {
				date++;
			} else {
				date = 1;
				month++;
			}		
			break;
		case 2:
			if (isLeap) {
				if (date < 29) {
					date++;
				} else {
					date = 1;
					month++;
				}
			} else {
				if (date < 28) {
					date++;
				} else {
					date = 1;
					month++;
				}
			}
			break;
		case 12:
			if (date < 31) {
				date++;
			} else {
				date = 1;
				month = 1;
				year++;
			}		
			break;
		default:
			System.out.println("something is wrong");
			break;
		}
		
		System.out.println(date + " " + month + " " + year);
		
	}
}
