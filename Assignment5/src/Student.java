//•	Create student class with name(String type) and regno (int type) attributes. 
//use any collection to Store 5 student information. (no duplicates).

//Create student class with name(String type) and regno (int type) attributes.
//use any collection to Store 5 student information. sort using student name

//•	Create student class with name(String type) and regno (int type) 
//attributes. use any collection to Store 5 student information. sort students using 
//name(only unique student objects should be printed (Ex s1(aa,11) s2(aa,12) s3(aa,11) s4(bb,12) then s1(aa,11) s2(aa,12) s4(bb,12) 
//should be printed.
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import java.util.List;


public class Student implements Comparable {
	String name;
	int regNo;
	
	

	public Student(String name, int regNo) {
		
		this.name = name;
		this.regNo = regNo;
	}
	
	
	@Override
	public int compareTo(Object o) {
		
		
		Student s = (Student)o;
		//return this.regNo-s.regNo;
		
		return this.name.compareTo(s.name);
}
	@Override
	 public boolean equals(Object obj){
	        System.out.println("In equals");
	        if (obj instanceof Student) {
	            Student ss = (Student) obj;
	            return (ss.name.equals(this.name) && ss.regNo==this.regNo);
	        } else {
	            return false;
	        }
	    }
	
	
	
	


	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Student s1 = new Student("Aman",1001);
		Student s2 = new Student("Harry",1002);
		Student s3 = new Student("Garry",1003);
		Student s4 = new Student("Taran",1004);
		Student s5 = new Student("Aman",1001);// duplicate object
		
		
		
		HashSet<Student> s = new HashSet<Student>();
		
		
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		
		List<Student> a = new ArrayList<Student>(s);
		
		
		
		

		Collections.sort(a);	
		
	    Iterator<Student> student = a.iterator();
		while(student.hasNext())
		{
			
			
			Student st = student.next();
			
			System.out.println("Student name is: "+st.name);
			System.out.println("Student's registration number is: "+st.regNo);
		}
		
		
		
		
	}



	
}
