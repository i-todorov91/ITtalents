package Homework1;

public class College {

	public static void main(String[] args) {
		
		Student ivan = new Student("Ivan", "Math", 25);
		Student gosho = new Student("Gosho", "Math", 22);
		Student pesho = new Student("Pesho", "Math", 22);
		Student minka = new Student("Minka", "Physics", 21);
		Student donka = new Student("Donka", "Physics", 27);
		Student vlado = new Student("Vlado", "Literatur", 24);
		ivan.receiveScholarship(3, 200);
		gosho.upYear();
		
		StudentGroup group1 = new StudentGroup("Math");
		StudentGroup group2 = new StudentGroup("Physics");
	
		group1.addStudent(ivan);
		group1.addStudent(gosho);
		group1.addStudent(pesho);
		group1.addStudent(vlado);
		
		group2.addStudent(minka);
		group2.addStudent(donka);
		
		System.out.println(group2.theBestStudent());
		
		group1.printStudentsInGroup();
	
	}
}
