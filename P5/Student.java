
public class Student {
	private Name name;
	private int age;
	
	Student(Name name, int age){
		this.name = name;
		this.age = age;
	}
	
	public Name getName(){
		return this.name;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public String toString(){
		return name.getName() + " " + age;
	}
}
