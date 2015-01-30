import java.io.*;
import java.nio.*;
import java.util.*;
		
public class insertSort {

		static int temp;
				
			public static void main(String[] args) throws FileNotFoundException {
				List<Integer> array1 = new ArrayList<Integer>();
				  
				Scanner mydata = new Scanner(new File("C:\\Users\\bluerubez\\workspace\\data.txt"));
			    while (mydata.hasNext()) {          // Read file content using a while loop
		            array1.add(mydata.nextInt()); }
		            System.out.println(array1);
					long startTime1 = System.currentTimeMillis();

		            for (int i = 1; i < array1.size(); i++) {
		                int next = array1.get(i);
		                // find the insertion location while moving all larger element up
		                int j = i;
		                while (j > 0 && array1.get(j - 1) > next) {
		                    array1.set(j,array1.get(j-1));
		                    j--;
		                }
		                // insert the element
		                array1.set(j,next);
		            }long endTime2=System.currentTimeMillis();
		     	     long totalTime2=endTime2 - startTime1;
		     	     System.out.println(" Time is " +totalTime2 + " in milliseconds");
		             System.out.println(array1);
		            
		        }
		    	
		    			
	}
	
	
		
		
			


