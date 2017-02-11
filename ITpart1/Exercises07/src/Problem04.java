
public class Problem04 {

	public static void main(String[] args) {
		
		String month = "February";
		int year = 1996;
		System.out.println(numOfDays(month, year));
		
	}
	
	static int numOfDays(String month, int year){
		
		boolean isLeap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
		int days = 0;
		switch(month){
			case "January":
			case "March":
			case "May":
			case "July":
			case "August":
			case "October":
			case "December":
				days = 31;
				break;
			case "February":
				if (isLeap) {
					days = 29;
				} else {
					days = 28;
				}
				break;
			case "April":
			case "June":
			case "September":
			case "November":
				days = 30;
				break;				
		}
		return days;	
	}
	
}
