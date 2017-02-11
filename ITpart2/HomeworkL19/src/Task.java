

public class Task {

	private String name;
	private int workingHours;
	
	Task(String name, int workingHours){
		this.setName(name);
		this.setWorkingHours(workingHours);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		if (workingHours >= 0) {
			this.workingHours = workingHours;
		}
	}
}
