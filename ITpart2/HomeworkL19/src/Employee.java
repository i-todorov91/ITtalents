

public class Employee {

	private String name;
	private Task currentTask;
	private int hoursLeft;
	private static AllWork allwork;
	
	Employee(String name){
		this.setName(name);
	}
	
	public static void setAllWork(AllWork work){
		if (work != null) {
			allwork = work;
		}
	}
	
	public static AllWork getAllWork(){
		return allwork;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
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
		if (this.getCurrentTask() == null || this.getCurrentTask().getWorkingHours() == 0) {
			this.setCurrentTask(allwork.getNextTask());
			if (this.currentTask == null) {
				this.hoursLeft = 0;
				System.out.println(this.name + " pochiva.");
				return;			
			}
			System.out.println(this.name + " starts working on " + this.getCurrentTask().getName());
		}

		while(this.hoursLeft != 0 && this.currentTask.getWorkingHours() != 0){
			this.hoursLeft--;
			this.currentTask.setWorkingHours((int) (this.currentTask.getWorkingHours() - 1));
			//this.showReport();
		}
		if (this.getCurrentTask().getWorkingHours() != 0) {
			System.out.println(this.name + " have " + (int)this.getCurrentTask().getWorkingHours()
					+ " hours left on " + this.getCurrentTask().getName() + ".");
		} else {
			System.out.println(this.name + " finished working on " + this.getCurrentTask().getName() + ".");
		}
		if (this.hoursLeft != 0) {
			System.out.println(this.name + " have " + (int)this.getHoursLeft() + " hours left.");
			this.work();
		}
	}
	
	public void showReport(){
		System.out.println(this.name + " is working on " + this.currentTask.getName() + " and he has " + this.hoursLeft + " hours left of working day "
				+ "and the task need " + (int) this.currentTask.getWorkingHours() + " more hours of work.");
	}
	
	public void startWorkingDay(){
		this.hoursLeft = 8;
		System.out.println(this.name + " starts the work day.");
	}
	
}
