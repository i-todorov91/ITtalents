
public class Demo {

	public static void main(String[] args) {
		
		Person[] array = new Person[10];
		array[0] = new Person("Pesho", 20, true);
		array[1] = new Person("Gosho", 25, true);
		array[2] = new Student("Ivan", 25, true, 5.5);
		array[3] = new Student("Minka", 32, false, 4);
		array[4] = new Employee("Ivaylo", 16, true, 30);
		array[5] = new Employee("Ivka", 25, false, 38);
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				continue;
			}
			if (array[i] instanceof Employee) {
				Employee temp = (Employee) array[i];
				temp.showEmployeeInfo();
				System.out.println();
				continue;
			}
			if (array[i] instanceof Student) {
				Student temp = (Student) array[i];
				temp.showStudentInfo();
				System.out.println();
				continue;
			}
			array[i].showPersonInfo();
			System.out.println();
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				continue;
			}
			if (array[i] instanceof Employee) {
				Employee temp = (Employee) array[i];
				System.out.println(temp.getName() + " : " + temp.calculateOvertime(2));
				System.out.println();
				continue;
			}
		}
		
	}
}
