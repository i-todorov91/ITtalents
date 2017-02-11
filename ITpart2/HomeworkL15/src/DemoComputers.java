
public class DemoComputers {

	public static void main(String[] args) {
		
		Computer com1 = new Computer();
		Computer com2 = new Computer();
		com1.year = 2000;
		com1.price = 500.5;
		com1.isNotebook = true;
		com1.hardDiskMemory = 1;
		com1.freeMemory = 1500;
		com1.operationSystem = "Linux";
		com2.year = 2008;
		com2.price = 1000;
		com2.hardDiskMemory = 1.5;
		com2.freeMemory = 7000;
		com2.operationSystem = "Windows";
		
		com1.useMemory(100);
		com2.changeOperationSystem("Ubuntu");
		
		System.out.println("The computer is from " + com1.year + " year.");
		System.out.println("The computer is " + com1.price + " $.");
		System.out.println(com1.isNotebook ? "The computer is a notebook." : "The computer is not a notebook.");
		System.out.println("The computer has " + com1.hardDiskMemory + " TB of hard disc space.");
		System.out.println("The computer has " + com1.freeMemory + " MB free memory.");
		System.out.println("The computer has " + com1.operationSystem + " OS.");
		System.out.println();
		System.out.println("The computer is from " + com2.year + " year.");
		System.out.println("The computer is " + com2.price + " $.");
		System.out.println(com2.isNotebook ? "The computer is a notebook." : "The computer is not a notebook.");
		System.out.println("The computer has " + com2.hardDiskMemory + " TB of hard disc space.");
		System.out.println("The computer has " + com2.freeMemory + " MB free memory.");
		System.out.println("The computer has " + com2.operationSystem + " OS.");
				
	}
}
