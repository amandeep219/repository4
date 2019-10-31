import java.util.LinkedList;

public class College {
	
	String name = "";
	LinkedList<Lecturer> lecturers = new LinkedList<Lecturer>();
	LinkedList<Student> students = new LinkedList<Student>();
	
	
	public College(String name, LinkedList<Lecturer> lecturers, LinkedList<Student> students) {
		super();
		this.name = name;
		this.lecturers = lecturers;
		this.students = students;
	}


	public College() {
		
	}


	

}
