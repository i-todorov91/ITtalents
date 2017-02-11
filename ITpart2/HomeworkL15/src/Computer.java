
public class Computer {

	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;
	
	void changeOperationSystem(String newOperationSystem){
		if (newOperationSystem != null && !newOperationSystem.isEmpty()) {
			this.operationSystem = newOperationSystem;
		}
	}
	
	void useMemory(double memory){
		if (memory <= this.freeMemory) {
			this.freeMemory -= memory;
		} else {
			System.out.println("Not enough free memory!");
		}
	}
	
}
