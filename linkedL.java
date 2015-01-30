import java.util.LinkedList;
import java.util.*;

public class linkedL {
	
	
	public static void main(String[] args){
		LinkedList<String> names=new LinkedList<String>();
		names.addFirst("Sam");
		names.addLast("George");
		names.offer("hello");
		int size=names.size();
		System.out.println(names);
		System.out.println(size);
		
	}

}
