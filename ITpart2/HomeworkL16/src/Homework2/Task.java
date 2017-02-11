package Homework2;

public class Task {

	private String name;
	private int workingHours;
	
	Task(String name, int workingHours){
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
		if (workingHours >= 0) {
			this.workingHours = workingHours;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
	}

	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		if (workingHours >= 0) {
			this.workingHours = workingHours;
		}
	}
}
