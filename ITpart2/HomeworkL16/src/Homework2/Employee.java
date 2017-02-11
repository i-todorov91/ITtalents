package Homework2;

public class Employee {

	private String name;
	private Task currentTask;
	private int hoursLeft;
	
	Employee(String name){
		if (name != null && !name.isEmpty()) {
			this.name = name;
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

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		this.currentTask = currentTask;
	}

	public double getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		if (hoursLeft >= 0) {
			this.hoursLeft = hoursLeft;
		}
	}
	
	public void work(){
		while(this.hoursLeft != 0 && this.currentTask.getWorkingHours() != 0){
			this.hoursLeft--;
			this.currentTask.setWorkingHours((int) (this.currentTask.getWorkingHours() - 1));
			this.showReport();
		}
	}
	
	public void showReport(){
		System.out.println(this.name + " is working on " + this.currentTask.getName() + " and he has " + this.hoursLeft + " hours left of working day "
				+ "and the task need " + (int) this.currentTask.getWorkingHours() + " more hours of work.");
	}
	
}
