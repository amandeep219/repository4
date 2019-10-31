import java.util.LinkedList;

public class Department extends College {
	
	String name = "";
	String yearOfComm = "";
	String DepartmentID = "";
	int numberOfLect = 0;
	// Head of Department
	//Lecturer headOfDept = new Lecturer(); instructor
	Lecturer headOfDept;
	
	public Department() {
		super();
		
	}
	
	



	public Department(String name, LinkedList<Lecturer> lecturers, LinkedList<Student> students, String name2,
			String yearOfComm, String departmentID, int numberOfLect, Lecturer headOfDept) {
		super(name, lecturers, students);
		name = name2;
		this.yearOfComm = yearOfComm;
		DepartmentID = departmentID;
		this.numberOfLect = numberOfLect;
		this.headOfDept = headOfDept;
	}





	

}
