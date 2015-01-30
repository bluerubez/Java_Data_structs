import java.util.Stack;

public class Palindrome {
	
			//create a stack that will hold char data type
			private String example;
			private Stack<Character> charStack = new Stack<Character>();
			
			//method Palindrome will accept a string as an input then fill a
			//stack only with letters to evaluate the palindrome
			public Palindrome(String str) {	
				example= str;
				
				example = example.replace(" ", "");
				example = example.replace(".", "");
				example = example.replace(",", "");
				example = example.replace("?", "");
				example = example.replace("!", "");
				example = example.replace("\"", "");
				
				fillStack();
			}

			//take the string and go through it and fill in the stack
			public void fillStack(){
				
				for(int i = 0; i < example.length(); i++)
				{
					charStack.push(example.charAt(i));	
				}
			}
			
			//build a new string as the backwards original string
			public String reverseString(){
				
				StringBuilder result = new StringBuilder();
				
				//pop off the stack to append the backwards string
				while(!charStack.empty()){
					
					result.append(charStack.pop());				
				}
				
				return result.toString();					
			}

			//checks to see if the contents of the two strings are the same
			public boolean isPalindrome(){
				
				return example.equalsIgnoreCase(reverseString());
			}
			

			//Here is the test
			public static void main(String args[]){
				
				
		    Palindrome onePalindrome = new Palindrome("Sore was I ere I saw Eros");
		  	Palindrome twoPalindrome = new Palindrome("Marge let a moody baby doom a telegram");												
			Palindrome threePalindrome = new Palindrome("Straw? No, too stupid a fad. I put soot on warts");
		  	Palindrome fourPalindrome = new Palindrome("\"Stop!\"" +" nine myriad murmur. " +"\"Put up rum, rum, dairymen, in pots.\"");


		   	
		 	
		   	if(onePalindrome.isPalindrome()){
		   		System.out.println("Sore was I ere I saw Eros is a palindrome");	
		   	}
		   	else {
		   		System.out.println("Sore was I ere I saw Eros is NOT a palindrome");
		   	}
		    	if(twoPalindrome.isPalindrome()){
		   		System.out.println("Marge let a moody baby doom a telegram is a palindrome");
		   	}
		   	else {
		   		System.out.println("Marge let a moody baby doom a telegram is NOT a palindrome");
		   	}
		    	if(threePalindrome.isPalindrome()){
		   		System.out.println("Straw? No, too stupid a fad. I put soot on warts is a palindrome");	
		   	}
		   	else {
		   		System.out.println("Straw? No, too stupid a fad. I put soot on warts is NOT a palindrome");
		   	}
		    	if(fourPalindrome.isPalindrome()){
		   		System.out.println("\"Stop!\"" +" nine myriad murmur. " +"\"Put up rum, rum, dairymen, in pots.\" is a palindrome");   		
		   	}
		   	else {
		   		System.out.println("\"Stop!\"" +" nine myriad murmur. " +"\"Put up rum, rum, dairymen, in pots.\" is  NOT a palindrome");
		   	}
		   }
		  
		}





