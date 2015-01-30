import java.io.*;
import java.nio.*;
import java.util.*;
	
public class selectionSort {

	static int temp;
	
		

		
		public static void main(String[] args) throws FileNotFoundException {
			List<Integer> array1 = new ArrayList<Integer>();
			long startTime1 = System.currentTimeMillis();

			Scanner mydata = new Scanner(new File("C:\\Users\\bluerubez\\workspace\\data.txt"));
		    while (mydata.hasNext()) {          // Read file content using a while loop
	            array1.add(mydata.nextInt()); }
	            System.out.println(array1);
	    		// just return if the array list is null
	    		if (array1 == null)
	    			return;

	    		// just return if the array list is empty or only has a single element
	    		if (array1.size() == 0 || array1.size() == 1)
	    			return;

	    		// declare an int variable to hold value of index at which the element
	    		// has the smallest value
	    		int smallestIndex;

	    		// declare an int variable to hold the smallest value for each iteration
	    		// of the outer loop
	    		int smallest;

	    		// for each index in the array list
	    		for (int i = 0; i < array1.size(); i++) {

	    			/* find the index at which the element has smallest value */
	    			// initialize variables
	    			smallest = array1.get(i);
	    			smallestIndex = i;

	    			for (int j = i + 1; j < array1.size(); j++) {
	    				if (smallest > array1.get(j)) {
	    					// update smallest
	    					smallest = array1.get(j);
	    					smallestIndex = j;
	    				}
	    			}

	    			/* swap the value */
	    			// do nothing if the curIndex has the smallest value
	    			if (smallestIndex == i)
	    				;
	    			// swap values otherwise
	    			else {
	    				int temp = array1.get(i);
	    				array1.set(i, array1.get(smallestIndex));
	    				array1.set(smallestIndex, temp);
	    			}	            

	    			
	    		}long endTime2=System.currentTimeMillis();
	     	     long totalTime2=endTime2 - startTime1;
	     	     System.out.println(" Time is " +totalTime2 + " in milliseconds");
	    		 System.out.println(array1);
	    	}
	}
	
		


		   