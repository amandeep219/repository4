import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	     
		 System.out.println("Enter String");
		 String str= input.nextLine();
		
		 
	      String[] strArray = str.split("\\s+");
	      Map<String, String> hMap = new LinkedHashMap<String, String>();
	      for(int i = 0; i < strArray.length ; i++ ) {
	         if(!hMap.containsKey(strArray[i])) {
	            hMap.put(strArray[i],"Unique");
	         }         
	      }
	      System.out.println(hMap);		
	   }

	}

