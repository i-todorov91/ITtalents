package Homework1;

public class Student {

	private String name;
	private String subject;
	private double grade;
	private int yearInCollage;
	private int age;
	private boolean isDegree;
	private double money;
	
	public void info(){
		System.out.println("Name: " + this.name);
		System.out.println("Subject: " + this.subject);
		System.out.println("Grade: " + this.grade);
		System.out.println("Year in collage: " + this.yearInCollage);
		System.out.println("Age: " + this.age);
		System.out.println("Money: " + this.money);
		System.out.println();
	}
	
	public String getName() {
		return name;
	}

	public String getSubject() {
		return subject;
	}

	public double getGrade() {
		return grade;
	}

	public int getAge() {
		return age;
	}

	public boolean isDegree() {
		return isDegree;
	}

	Student(){
		this.grade = 4.0;
		this.yearInCollage = 1;
		this.isDegree = false;
		this.money = 0;
	}
	
	Student(String name, String subject, int age){
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}
	
	void upYear(){
		if (!this.isDegree) {
			this.yearInCollage++;
			if(this.yearInCollage == 4){
				this.isDegree = true;
			}
		} else {
			System.out.println("The student have graduated");
		}
	}
	
	double receiveScholarship(double min, double amount){
		if (this.grade >= min && this.age < 30) {
			this.money += amount;
		}
		return this.money;
	}
	
}
