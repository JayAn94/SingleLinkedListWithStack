// ***************************************************************
//   StackTest.java
//
//   A simple driver to test a stack.
//
// ***************************************************************
import java.util.Stack;

public class StackTest {
	
	public static void main(String[] args) {
		
		// Element to be removed for part II, Stack removeElement
		int removeVal = 5;
		
		// Declare and instantiate a stack
		Stack stack = new Stack<>();
		
		//push some stuff on the stack
		for (int i=0; i < 10; i++)
			stack.push(i);		
		stack.push(5);
		
		// call printStack to print the stack
		System.out.println("Original Stack List");
		printStack(stack);
		System.out.println(); // Spacing
		
		// call reverseStack to reverse the stack
		System.out.println("Reverse Stack List");
		printStack(reverseStack(stack));
		System.out.println(); // Spacing
		
		// call printStack to print the stack again
		System.out.println("Original Stack List");
		printStack(stack);
		System.out.println(); // Spacing
		
		// call removeElement to remove all occurrences of the value 5 - save the
		// stack returned from this call		
		System.out.println(removeVal + " Removed from Stack List");
		printStack(removeElement(stack, removeVal));
		System.out.println(); // Spacing
		
		// call printStack to print the original stack and the new stack.
		System.out.println("Original Stack List");
		printStack(stack); // Spacing
	}
	

	// prints all elements in a stack
	public static void printStack(Stack s) {	
		System.out.println(s);
	}
	
	// return a new stack who elements are in reverse order from the S
	public static Stack reverseStack(Stack s) {
		// If stack is empty return S
		if (s.isEmpty()) {
			return s;
		}
		
		// Creates a new empty Stack
		Stack reverseStack = new Stack<>();;
		
		// Reverse the Stack from the back to the front
		for(int i = s.size() - 1; i >= 0; i--) {
			reverseStack.push(s.get(i));
		}		
		return reverseStack;		
	}
	
	// return a new stack whose elements are in the same as those in S in the same order
	// Except all elements of val have been removed
	public static Stack removeElement(Stack s, int val) {
		if (s.isEmpty()){
			return s;
		}
		
		Stack removedElement = new Stack<>();
		
		for(int i = 0; i < s.size(); i++) {			
			if((int) s.get(i) != val) {
				removedElement.push(s.get(i));
			}
		}		
		return removedElement;
		
	}
}

	
