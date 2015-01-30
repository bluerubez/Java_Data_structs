
import java.io.*;
import java.nio.*;
import java.util.*;

public class bubbleSort {
	static int n, c, d, swap,temp;
	

	
	public static void main(String[] args) throws FileNotFoundException {
		List<Integer> array1 = new ArrayList<Integer>();
		long startTime1 = System.currentTimeMillis();
 
		Scanner mydata = new Scanner(new File("C:\\Users\\bluerubez\\workspace\\data.txt"));
	    while (mydata.hasNext()) {          // Read file content using a while loop
            array1.add(mydata.nextInt()); 
		}
		if (array1.size()>1) // check if the number of orders is larger than 1
	    {
	        for (int x=0; x<array1.size(); x++) // bubble sort outer loop
	        {
	            for (int i=0; i < array1.size()-i; i++) {
	                if (array1.get(i).compareTo(array1.get(i+1)) > 0)
	                {
	                    temp = array1.get(i);
	                    array1.set(i,array1.get(i+1) );
	                    array1.set(i+1, temp);
	                }
	            }
	        }
	    }

		 long endTime2=System.currentTimeMillis();
	     long totalTime2=endTime2 - startTime1;
	     System.out.println(" Time is " +totalTime2 + " in milliseconds");
	   
	    
	  
		System.out.println(array1);}
	}


