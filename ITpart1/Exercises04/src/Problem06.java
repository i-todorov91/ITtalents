
public class Problem06 {

	public static void main(String[] args) {
		
		int date1 = 12;
		int month1 = 3;
		int year1 = 1987;
		
		int date2 = 17;
		int month2 = 7;
		int year2 = 1987;
		
		int dateMin = 12;
		int monthMin = 3;
		int yearMin = 1987;
		
		int dateMax = 17;
		int monthMax = 7;
		int yearMax = 1987;
		
		if (yearMax < yearMin) {
			dateMax = 12;
			monthMax = 3;
			yearMax = 1987;
			
			dateMin = 17;
			monthMin = 7;
			yearMin = 1987;
		}
		if (yearMax == yearMin && monthMax < monthMin) {
			dateMax = 12;
			monthMax = 3;
			yearMax = 1987;
			
			dateMin = 17;
			monthMin = 7;
			yearMin = 1987;
		}
		if (yearMax == yearMin && monthMax == monthMin && dateMax < dateMin) {
			dateMax = 12;
			monthMax = 3;
			yearMax = 1987;
			
			dateMin = 17;
			monthMin = 7;
			yearMin = 1987;
		}
		
		int days = 0;
		
		while (yearMin != yearMax || monthMin != monthMax || dateMin != dateMax){
			days++;
			
			switch (monthMin) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
				if (dateMin < 31) {
					dateMin++;
				} else {
					dateMin = 1;
					monthMin++;
				}		
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if (dateMin < 30) {
					dateMin++;
				} else {
					dateMin = 1;
					monthMin++;
				}		
				break;
			case 2:
				if ((yearMin % 4 == 0 && yearMin % 100 != 0) || yearMin % 400 == 0) {
					if (dateMin < 29) {
						dateMin++;
					} else {
						dateMin = 1;
						monthMin++;
					}
				} else {
					if (dateMin < 28) {
						dateMin++;
					} else {
						dateMin = 1;
						monthMin++;
					}
				}
				break;
			case 12:
				if (dateMin < 31) {
					dateMin++;
				} else {
					dateMin = 1;
					monthMin = 1;
					yearMin++;
				}		
				break;
			default:
				System.out.println("something is wrong");
				break;
			}
					
		}
		
		System.out.println("Ivan " + date1 + " " + month1 + " " + year1);
		System.out.println("Peter " + date2 + " " + month2 + " " + year2);
		
		if (yearMax == year1) {
			System.out.println("Ivan is " + days + " days bigger!");
		} else {
			System.out.println("Peter is " + days + " days bigger!");			
		}
		
	}
}
