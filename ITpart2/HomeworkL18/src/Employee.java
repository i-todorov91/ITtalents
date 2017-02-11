
public class Employee extends Person {

	private double daySalary;

	public double getDaySalary() {
		return daySalary;
	}

	public void setDaySalary(double daySalary) {
		if (daySalary >= 0) {
			this.daySalary = daySalary;
		}
	}
	
	Employee(String name, int age, boolean isMale, double daySalary){
		super(name, age, isMale);
		this.setDaySalary(daySalary);
	}
	
	public void showEmployeeInfo(){
		super.showPersonInfo();
		System.out.println("Salary for the day: " + this.getDaySalary());
	}
	
	public double calculateOvertime(double hours){
		if (this.getAge() < 18) {
			return 0;
		}
		return ((this.getDaySalary() / 8) * 1.5) * hours;
	}
	
}
