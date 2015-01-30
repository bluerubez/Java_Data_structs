import java.util.Stack;

public class SPalindrome {

		public static boolean isPalindrome(String str) {

			//Make two Stacks
			Stack<Character> stack1 = new Stack<Character>();
			Stack<Character> stack2 = new Stack<Character>();
			
			//push string onto stack
			for (Character c : str.toCharArray()) {

				stack1.push(c);
			}

			// push half the stack onto stack two
			for (int i = 0, n = stack1.size() / 2; i < n; i++) {

	
				stack2.push(stack1.pop());
			}
			
			//But make sure they are the same size
			if (stack1.size() >stack2.size()) {

				stack1.pop();

			}
			return stack1.equals(stack2);

		}

	}



