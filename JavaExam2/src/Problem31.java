import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

//Read a file content and write it to a new file in reverse order.(reverse line 1-10 to line 10-1) *
public class Problem31 {

	
	 
	    public static void main(String[] args) throws IOException {
	        FileReader fr = new FileReader("C:\\Users\\AMANDEEP\\Desktop\\textFile.txt");
	        BufferedReader fw = new BufferedReader(fr);
	 
	        FileWriter out = new FileWriter("C:\\Users\\AMANDEEP\\Desktop\\textfileOP.txt");
	        BufferedWriter br = new BufferedWriter(out);
	 
	        String data;
	        int i =0;
	        int n =0;
	        
	 
	        while ((data = fw.readLine()) != null) {
	 
	        	String[]  values = data.split(",");
	        	System.out.println(Arrays.toString(values));
	        	
	        	
	        	br.write(Arrays.toString(values));
	        	
	        }
	        
	        
	        
	        
	        
	        br.close();
	 
	 
	 
	    }
	 
	     
	}

	

