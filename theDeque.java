import java.util.Deque;
import java.util.LinkedList;

public class theDeque {
	public static Deque<Character> fillDeque(String string){
		Deque<Character> theDeque1= new LinkedList<Character>();
		for (Character c: string.toCharArray()){
		theDeque1.offerFirst(c);
		}
		return theDeque1;
	}
	public static Deque<Character> fillrevDeque(Deque<Character> theDeque1){
		Deque<Character> theDeque2= new LinkedList<Character>();
		while(theDeque1.size()!=0){
			theDeque2.offer(theDeque1.removeLast());
			
		}
		return theDeque2;
	}
	
	public static void main(String[] args) {
		Deque<Character> theDeque1= new LinkedList<Character>();
		Deque<Character> theDeque2= new LinkedList<Character>();
		String theString=("Sore was I ere I saw Eros");
		String theString2=("I love data structures class");
		
		theDeque1=fillDeque(theString);
		System.out.println(theDeque1);
		theDeque2=fillrevDeque(theDeque1);
		System.out.println(theDeque2);
		
		theDeque1=fillDeque(theString2);
		System.out.println(theDeque1);
		theDeque2=fillrevDeque(theDeque1);
		System.out.println(theDeque2);
	}

}
