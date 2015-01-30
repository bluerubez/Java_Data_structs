
public class SLinkedListTest {
	public static void main(String args[]){
	
	SLinkedList list = new SLinkedList();		
	list.printAll();
	
	// add "Diana", "Peter" using addFirst
	list.addFirst("Diana");
	list.addFirst("Peter");
	
	// print out the list
	System.out.println("Expected print: Peter  Diana");
	list.printAll();
	System.out.println();
	
	
	// add "Helen" "Joe" "Mary" using addLast
	list.addLast("Helen");
	list.addLast("Joe");
	list.addLast("Mary");
	
	// print out the list
	System.out.println("Expected print: Peter Diana Helen Joe Mary");
	list.printAll();
	System.out.println();
	
	// remove "Peter" using removeFirst
	list.removeFirst();
	
	// print out the list
	System.out.println("Expected print: Diana Helen Joe Mary");
	list.printAll();
	System.out.println();
	
	// remove "Mary" using removeLast
	list.removeLast();		
	
	// print out the list
	System.out.println("Expected print: Diana Helen Joe");
	list.printAll();
	System.out.println();
	
}


}

