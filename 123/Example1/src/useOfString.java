
public class useOfString {

	public static void main(String[] args) {
		// String is built in class in java library
		// it has both static and non static members
		// reference variable can be created in 2 ways
		
		
		String s = new String("aman");// s is a reference varibale
		// String s = "aman" 
		String s1 = "bajwa";    // int a=20, S1 is a reference variable
		//String s1 = new String("bajwa"); c
		
		System.out.println("Length of aman is "+s.length());
		System.out.println("Length of bajwa is "+s1.length());
		System.out.println("upper case of aman is "+s.toUpperCase());
		System.out.println("upper case of bajwa is "+s1.toUpperCase());
		System.out.println(s.charAt(3));
		System.out.println(s1.concat("kaur"));
		System.out.println(s1.contains("j"));
		System.out.println(s1.indexOf("j"));
		System.out.println(s1.replace("w","v"));
		System.out.println(s1.replaceAll("a","c"));
		System.out.println(s1.replaceFirst("a","c"));
		
		System.out.println("khatkar".toUpperCase());
		 String myname = "aman".toUpperCase()+"khatkar".toUpperCase();
		 System.out.println(myname);
		 String add = "2"+"4";// becoz 2 and 4 is a string not int
		 System.out.println(add);
		 int add1 = 2+4;
		 System.out.println(add1);
		 String add2 = "aman"+87;// aman will convert 87 into string internally
		 System.out.println(add2);
		 
		 System.out.println("my first name is"+" "+s+" "+"My last namt is"+" "+s1);
		 System.out.println("my first name is "+s+" My last namt is "+s1);
		 System.out.println(String.valueOf(s));// static function
		 
		  String a = "priya"; // value is called litterls in java
		  String b = "jaspreet";
		  String c = a;// the value of c is now priya
		  System.out.println("The value of a is: "+a);
		  System.out.println("The value of c is: "+c);
		  System.out.println("The value of a is still: "+a);
		  System.out.println("The value of b is: "+b);
		  b = c;// the value of a is now priya, 
		  System.out.println("The value of b is: "+b);
		  
		  int a1 =10; // 10 is littrle
		  int b1 = 20;// 20 is littrle
		  int c1=5;
		  
		  c1 = b1;// b1 is variable name
		  System.out.println("The value of a1 is: "+a1);
		  System.out.println("The value of b1 is: "+b1);
		  System.out.println("The value of c1 is: "+c1);
		  
		  String s3 = s+" "+s1;
		  System.out.println(s3);
		 
		  
		
		 
		 
		
		
		
		
		
		
		
		
		
	}
}

