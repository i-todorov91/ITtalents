package Homework2;

public class WorkSpace {

	public static void main(String[] args) {
		
		Employee ivan = new Employee("Ivan");
		Task homework = new Task("Homework", 4);
		
		homework.setWorkingHours(3);
		ivan.setCurrentTask(homework);
		ivan.setHoursLeft(8);
		ivan.work();
	}
}
