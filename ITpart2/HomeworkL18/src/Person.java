
public class Person {

	private String name;
	private int age;
	private boolean isMale;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;	
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age > 0){
			this.age = age;
		}
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	Person(String name, int age, boolean isMale){
		this.setName(name);
		this.setAge(age);
		this.setMale(isMale);
	}
	
	public void showPersonInfo(){
		System.out.println("Name: " + this.getName());
		System.out.println("Age:  " + this.getAge());
		System.out.println(this.isMale ? "Sex:  male" : "Sex:  female");
	}
	
}
