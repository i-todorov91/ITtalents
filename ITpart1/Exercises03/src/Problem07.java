
public class Problem07 {

	public static void main(String[] args) {
		
		int date = 5;
		int month = 11;
		int year = 2016;
		int days = 0;
		
		boolean isLeap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
		
		switch (month) {
		case 1:
			days = date;
			break;
		case 2:
			days = 31 + date;
			break;
		case 3:
			if (isLeap) {
				days = 31 + 29 + date;
			} else {
				days = 31 + 28 + date;
			}
			break;
		case 4:
			if (isLeap) {
				days = 31 + 29 + 31 + date;
			} else {
				days = 31 + 28 + 31 + date;
			}
			break;
		case 5:
			if (isLeap) {
				days = 31 + 29 + 31 + 30 + date;
			} else {
				days = 31 + 28 + 31 + 30 + date;
			}
			break;
		case 6:
			if (isLeap) {
				days = 31 + 29 + 31 + 30 + 31 + date;
			} else {
				days = 31 + 28 + 31 + 30 + 31 + date;
			}
			break;
		case 7:
			if (isLeap) {
				days = 31 + 29 + 31 + 30 + 31 + 30 + date;
			} else {
				days = 31 + 28 + 31 + 30 + 31 + 30 + date;
			}
			break;
		case 8:
			if (isLeap) {
				days = 31 + 29 + 31 + 30 + 31 + 30 + 31 + date;
			} else {
				days = 31 + 28 + 31 + 30 + 31 + 30 + 31 + date;
			}
			break;
		case 9:
			if (isLeap) {
				days = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + date;
			} else {
				days = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + date;
			}
			break;
		case 10:
			if (isLeap) {
				days = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + date;
			} else {
				days = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + date;
			}
			break;
		case 11:
			if (isLeap) {
				days = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + date;
			} else {
				days = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + date;
			}
			break;
		case 12:
			if (isLeap) {
				days = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + date;
			} else {
				days = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + date;
			}
			break;

		default:
			System.out.println("Something went wrong!");
			break;
		}
		
		System.out.println(days);
		
	}
}
