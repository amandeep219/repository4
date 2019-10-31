// college - Address + Size + Name + NoOfClassrooms + NoOStudents + lecute... etc
// classrooms = NoOfSeating Capacity + Size + Floor etc
// students = Name + Age + ID + Addre + Contact + Parents + Department etc... 
// lecturers
// staffs
// cafeteria
// hostel 
// Library


public class Entry {

	public static void main(String[] args) {
		
		int i = 0;
		char c = 'a';
		boolean isValid = true;
		float f = 1.3f;

		College c = new College();
		c.name = "XYZ College";
		Lecturer l1 = new Lecturer();
		l1.name = "Vinod";
		Lecturer l2 = new Lecturer();
		l2.name = "Abhi";
		c.lecturers.add(l1);
		c.lecturers.add(l2);
		
		
		Student s1 = new Student();
		s1.name = "Meenakshi";
		Student s2 = new Student();
		s2.name = "Jyoti";
		
		c.students.add(s1);
		c.students.add(s2);
		
		
		
		
		

	}

}