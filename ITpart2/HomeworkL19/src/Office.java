
public class Office {

	public static void main(String[] args) {
		
		AllWork work = new AllWork();
		work.addTask(new Drawing(7));
		work.addTask(new Drawing(8));
		work.addTask(new FillingDocuments(10));
		work.addTask(new InspectingBuilding(11));
		work.addTask(new FillingDocuments(10));
		work.addTask(new Drawing(8));
		work.addTask(new InspectingBuilding(11));
		work.addTask(new FillingDocuments(11));
		work.addTask(new Drawing(7));
		work.addTask(new InspectingBuilding(4));
		
		Employee ivan = new Employee("Ivan");
		Employee gosho = new Employee("Gosho");
		Employee pesho = new Employee("Pesho");
		
		Employee[] workers = { ivan, gosho, pesho };
		Employee.setAllWork(work);
		
		int day = 1;
		
		while(true){
			System.out.println("Day " + day);
			for (int i = 0; i < workers.length; i++) {
				workers[i].startWorkingDay();
			}
			System.out.println();
			for (int i = 0; i < workers.length; i++) {
				workers[i].work();
				System.out.println();
			}
			System.out.println();
			if (Employee.getAllWork().isAllWorkDone()) {
				System.out.println("All of the work is done.");
				System.out.println("It took " + day + " days to finish the work.");
				break;
			}
			day++;
		}
		
	}
}
