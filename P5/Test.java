import java.io.IOException;
import java.util.Scanner;
public class Test {
	
	public static Student readStudent() throws IOException{
		System.out.println("Values entered :");
		Scanner sc = new Scanner(System.in);
		
		String fname = sc.nextLine();
		String mname = sc.nextLine();
		String lname = sc.nextLine();
		
		int nameFormat = sc.nextInt();
		int age = sc.nextInt();
		
		String fullName = "";
		if(nameFormat == 1){
			fullName = fname + "," + mname + "," + lname;
		}
		else{
			fullName = lname + ";" + mname + ";" + fname;
		}
		Name name = new Name(fullName);
		Student std = new Student(name, age);
		//sc.close();
		
		return std;
	}

	public static void main(String[] args) throws IOException {
		
		
		for(int i = 0; i < StudentList.list.length ; i++){
			StudentList.list[i] = readStudent();
		}
		Student[] ageList = new Student[StudentList.list.length];
		ageList = StudentList.getStudentsWithAge(20);
		for(int i = 0; i < ageList.length; i++){
			System.out.println(ageList[i]);
		}
		
		Student[] lastNameList = new Student[StudentList.list.length];
		lastNameList = StudentList.getStudentsWithLastName("Sharma");
		for(int i = 0; i < lastNameList.length; i++){
			System.out.println(lastNameList[i]);
		}
		
		Student[] ageRangeList = new Student[StudentList.list.length];
		ageRangeList = StudentList.getStudentsInAgeRange(16,20);
		for(int i = 0; i < ageRangeList.length; i++){
			System.out.println(ageRangeList[i]);
		}
		
		
		
		
	}

}
