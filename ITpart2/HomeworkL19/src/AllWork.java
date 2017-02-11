
public class AllWork {

	private Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnassignedTask;
	private int counter = 0;
	
	AllWork(){
		this.freePlacesForTasks = 10;
		this.currentUnassignedTask = 0;
		this.tasks = new Task[this.freePlacesForTasks];
	}
	
	public void addTask(Task task){
		if (task != null && freePlacesForTasks != 0) {
			this.freePlacesForTasks--;
			this.tasks[counter++] = task;
		}
	}
	
	public Task getNextTask(){
		if (currentUnassignedTask < tasks.length) {
			return this.tasks[currentUnassignedTask++];
		}
		return null;
	}
	
	public boolean isAllWorkDone(){
		boolean done = true;
		for (int i = 0; i < this.tasks.length; i++) {
			if (this.tasks[i] == null) {
				continue;
			}
			if (this.tasks[i].getWorkingHours() != 0) {
				done = false;
			}
		}
		return done;
	}
	
}
