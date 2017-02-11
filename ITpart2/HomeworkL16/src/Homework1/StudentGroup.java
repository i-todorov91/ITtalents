package Homework1;

public class StudentGroup {

	private String groupSubject;
	private Student[] students;
	private int freePlaces;
	
	StudentGroup(){
		this.students = new Student[5];
		this.freePlaces = 5;
	}
	
	StudentGroup(String subject){
		this();
		this.groupSubject = subject;
	}
	
	void addStudent(Student s){
		if (this.freePlaces > 0 && s.getSubject().equals(this.groupSubject)) {
			this.students[students.length - this.freePlaces] = s;
			freePlaces--;
		}
	}
	
	void emptyGroup(){
		this.students = new Student[5];
		this.freePlaces = 5;
	}
	
	String theBestStudent(){
		if (freePlaces != 5) {
			int indxBest = 0;
			for (int i = 0; i < students.length - freePlaces; i++) {
				if (students[i].getGrade() > students[indxBest].getGrade()) {
					indxBest = i;
				}
			}

			return students[indxBest].getName();
		} else {
			return "NO ONE !!!! (the group is empty...)";
		}
	}
	
	void printStudentsInGroup(){	
		for (int i = 0; i < students.length - freePlaces; i++) {
			students[i].info();
		}
	}
	
}
