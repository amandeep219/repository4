
public class Name {
	
	public void printing(String a,String b) {
		System.out.println("My first name is "+a);
		System.out.println("My last name is "+b);
		
		}
	
	public String printing1(String a,String b) {
		
		return a+" "+b;
		
		}
	
public void parents(String myName,String fatherName, String motherName, int age) {
		
	System.out.println("My name is "+myName+"\nMy fathers name is :"+fatherName+"\nMy mothers name is: "+motherName+ "\nMy age is: "+age);
	
	
		
		}

public String ageGroup(int age) {
	String result;// its a local variable,  
	
	if(age>0&&age<=10)
	{
		result = " you are kid";
	}
	else if(age>=11&&age<=19)
	{
		result = " you are teenager";
	}
	else
	{
		result = "you are adult";
	}
	
	return result;
		
	}

public void printNme(String a,String b) {
	for(int i =0;i<10;i++)
	{
	System.out.println("My first name is "+a);
	System.out.println("My last name is "+b);
	}
	
}
 
}
