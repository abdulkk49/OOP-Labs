
public class StudentList {
	public static Student[] list = new Student[3];
	public static int count = 0;
	
	public static void addStudent(Student std){
		if(count >= 10){
			return;
		}
		list[count] = std;
		count++;
	}
	
	public static Student[] getStudentsWithAge(int age){
		Student[] ageList = new Student[list.length];
		for(int i = 0, j = 0; i < list.length; i++){
			if(list[i].getAge() == age){
				ageList[j] = list[i];
				j++;
			}
		}
		if(ageList.length == 0){ 
			return null;
		}
		return ageList;
	}
	
	public static Student[] getStudentsWithLastName(String lastName){
		Student[] lastNameList = new Student[list.length];
		for(int i = 0, j = 0; i < list.length; i++){
			if(list[i].getName().getLname().equals(lastName)){
				lastNameList[j] = list[i];
				j++;
			}
		}
		if(lastNameList.length == 0){ 
			return null;
		}
		return lastNameList;
	}

	public static Student[] getStudentsInAgeRange(int minAge, int maxAge){
		Student[] ageRangeList = new Student[list.length];
		for(int i = 0, j = 0; i < list.length; i++){
			if(list[i].getAge() >= minAge && list[i].getAge() <= maxAge){
				ageRangeList[j] = list[i];
				j++;
			}
		}
		if(ageRangeList.length == 0){ 
			return null;
		}
		return ageRangeList;
	}


}
