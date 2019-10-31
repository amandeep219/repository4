//Write a program to print the names of students by creating a
//Student class. If no name is passed while creating an object of Student class, 
//then the name should be "Unknown", otherwise the name should be equal to the String value passed while creating object of Student class
public class Student {
	String name;
	

	public Student() {
		 name = "unknown";
	}
	
	public Student(String name) {
		 this.name = name;
	}
	

	public static void main(String[] args) {
		Student s = new Student();
		Student s1 = new Student("Amandeep");
		System.out.println(s.name);
		System.out.println(s1.name);
		
		

	}

}
