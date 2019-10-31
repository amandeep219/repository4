//Consider student class with name and sem attribute and Library class with lib Num and total
//Books attributes. Store 5 Library objects as key and Student object as value in Tree Map
//object and print the content
package student.library;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Entry {

	public static void main(String[] args) {
		Student s1 = new Student("Aman",1);
		Student s2 = new Student("Tina",2);
		Student s3 = new Student("Chandan",2);
		Student s4= new Student("Kiran",3);
		Student s5= new Student("Rehmat",6);
		
	Library l1 = new Library(1001,2);
	Library l2 = new Library(1002,5);
	Library l3 = new Library(1003,2);
	Library l4 = new Library(1004,6);
	Library l5 = new Library(1005,1);
	
	TreeMap<Library,Student> t = new TreeMap<Library,Student>();
	t.put(l1,s1);
	t.put(l2,s2);
	t.put(l3,s3);
	t.put(l4,s4);
	t.put(l5,s5);
	
	for (java.util.Map.Entry<Library, Student> entry : t.entrySet()) {
        Student value = entry.getValue();
        Library key = entry.getKey();
        System.out.println("Library number: "+entry.getKey().libNum+" Name: "+entry.getValue().name+" Semester: "+entry.getValue().semester+" Number of books: "+entry.getKey().totalBooks);
   }
	
	}

}
