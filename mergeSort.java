import java.io.*;
import java.nio.*;
import java.util.*;

	public class mergeSort {
	static int temp,i,n;
					
		public static void main(String[] args) throws FileNotFoundException {
			ArrayList<Integer> array1 = new ArrayList<Integer>();
			ArrayList<Integer> array2 = new ArrayList<Integer>();
			ArrayList<Integer> array3 = new ArrayList<Integer>();


			
			
			Scanner mydata = new Scanner(new File("C:\\Users\\bluerubez\\workspace\\data.txt"));
		    while (mydata.hasNext()) {          // Read file content using a while loop			            array1.add(mydata.nextInt()); }
		    	 array1.add(mydata.nextInt());}  
		    
		    	n=(int)Math.floor(array1.size()/2);
		    	for(i=0;i<2*n ;i++){
			    	if(i<n)
			    		array2.add(i,array1.get(i));
			    	else
			    		array3.add(i-n,array1.get(i));
		    	}
		    	
		    	merge(array2,array3);
		    	
		   }		
		
		public static void merge(ArrayList<Integer> array2,ArrayList<Integer> array3){
			i=0;
			int j=0,k=0;
			long startTime1 = System.currentTimeMillis();
			ArrayList<Integer> array4 = new ArrayList<Integer>();
			
     		while (i < array2.size() &&  j< array3.size()) {
     	  	if (array2.get(i) < array3.get(j))
     	    	array4.add(k++,array2.get(i++));
     	  		
     	  	else
     	    	array4.add(k++,array3.get(j++));
     	  		
     		}

     		while (i < array2.size()){
     			array4.add(k++,array2.get(i++));}
     	  	

     		while (j < array3.size()){
     			array4.add(k++,array3.get(j++));}
     		  long endTime2=System.currentTimeMillis();
     	      long totalTime2=endTime2 - startTime1;
     	      System.out.println(" Time is " +totalTime2 + " in milliseconds");
     		System.out.println(array4);
     	  }

		
		}
	
	
		
		
			
			
				



