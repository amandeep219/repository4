

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MyArrayList {
	private Object[] myList;
	int actLen=0;// actual occupied length 
	
	
	public MyArrayList(){
        myList = new Object[10];
    }
	
	
	
	public void add(Object o)
	{
		if(myList.length - actLen<=5)
		{
	            increaseListSize();
	    }
	        
	        myList[actLen++]=o;
	      
	}
	
	
	 public Object remove(int index){
		 
		 
	        if(index < actLen){
	            Object obj = myList[index];
	            myList[index] = null;
	            int tmp = index;
	            while(tmp < actLen){
	                myList[tmp] = myList[tmp+1];
	                myList[tmp+1] = null;
	                tmp++;
	            }
	            actLen--;
	            return obj;
	        } else {
	            throw new ArrayIndexOutOfBoundsException();
	        }
	         
	    }
	     
	

	private void increaseListSize() {
		 myList = Arrays.copyOf(myList, myList.length*2);
		
	}
	
	public int size(){
        return actLen;
    }

	 public Object get(int index){
	        if(index < actLen){
	            return myList[index];
	        } else {
	            throw new ArrayIndexOutOfBoundsException();
	        }
	 }
	 
	 public HashMap frequency()
	 {
	 HashMap<Object,Integer> h = new HashMap<Object,Integer>();
    // int arr[] = new int[]{2,2,3,3,5,6,7,9,9,0};
     for(int i=0; i<myList.length; i++){
         if(h.containsKey(myList[i])){
             h.put(myList[i], h.get(myList[i]) + 1);
         } else {
             h.put(myList[i], 1);
         }
     }
     System.out.println(h);
     return h;
     
	 }


	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();    
		   
		   list.add(2);
		   list.add(1);   
		   list.add("5");
		   list.add(2.7);
		   list.add('1');
		   list.frequency();
		   
		   
		   for (int i = 0; i < list.size(); i++)  {
			   //System.out.println(list.get(i));
			   //System.out.println(list.frequency().);
			   
	           
	    } 
		  

	}

}
