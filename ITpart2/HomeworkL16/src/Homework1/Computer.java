package Homework1;

public class Computer {

	private int year;
	private double price;
	private boolean isNotebook;
	private double hardDiskMemory;
	private double freeMemory;
	private String operationSystem;
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year < 2017 && year > 1946) {
			this.year = year;	
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price > 0){
			this.price = price;
		}
	}

	public boolean isNotebook() {
		return isNotebook;
	}

	public void setNotebook(boolean isNotebook) {
		this.isNotebook = isNotebook; // ?
	}

	public double getHardDiskMemory() {
		return hardDiskMemory;
	}

	public void setHardDiskMemory(double hardDiskMemory) {
		if(hardDiskMemory > 0 && hardDiskMemory < 20){
			this.hardDiskMemory = hardDiskMemory;
		}
	}

	public double getFreeMemory() {
		return freeMemory;
	}

	public void setFreeMemory(double freeMemory) {
		if(freeMemory > 0){
			this.freeMemory = freeMemory;
		}
	}

	public String getOperationSystem() {
		return operationSystem;
	}

	public void setOperationSystem(String operationSystem) {
		if(operationSystem != null && !operationSystem.isEmpty()){
			this.operationSystem = operationSystem;
		}
	}

	Computer(){
		isNotebook = false;
		operationSystem = "Win XP";
	}
	
	Computer(int year, double price, double hardDiskMemory, double freeMemory){
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}
	
	Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory, String operationSystem){
		this(year, price, hardDiskMemory, freeMemory);
		this.isNotebook = isNotebook;
		this.operationSystem = operationSystem;
	}
	
	int comparePrice(Computer c){
		if (this.price > c.price) {
			return -1;
		} else if (this.price < c.price){
			return 1;
		} else {
			return 0;
		}
	}
	
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
