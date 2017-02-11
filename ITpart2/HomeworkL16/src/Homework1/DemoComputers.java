package Homework1;

public class DemoComputers {

	public static void main(String[] args) {
		
		Computer comp1 = new Computer(2000, 550, 1.5, 2000);
		Computer comp2 = new Computer(2009, 999.99, true, 1, 1, "Mac OS");
		
		if (comp1.comparePrice(comp2) == -1) {
			System.out.println("The Computer with " + comp2.getOperationSystem() + " is cheaper.");
		} else if (comp1.comparePrice(comp2) == 1) {
			System.out.println("The Computer with " + comp1.getOperationSystem() + " is cheaper.");
		} else {
			System.out.println("The Computers are of the same price.");
		}
		
	}
	
}
