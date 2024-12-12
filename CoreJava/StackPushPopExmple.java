package CoreJava;
/*Write a program to declare stack.Store 10 elements into it.
Remove 4 elements from stack and display it.*/
import java.util.Stack;

public class StackPushPopExmple {

	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();

		// Adding elements to the stack
		st.push("Aachal");
		st.push("Shubhangi");
		st.push("Prabhat");
		st.push("Aman");
		st.push("Aman");
		st.push("Pooja");
		st.push("Vikas");
		st.push("Sai");
		st.push("Shree");
		st.push("Anuj");

		// Printing the initial stack
		System.out.println("Stack: " + st);

		// Using a loop to pop elements
		for (int i = 0; i < st.size() - 4; i++) { 
			System.out.println("Popped element: " + st.pop());
		}

		// Printing the remaining stack
		System.out.println("Remaining Stack: " + st);
	}
}
/*output:Stack: [Aachal, Shubhangi, Prabhat, Aman, Aman, Pooja, Vikas, Sai, Shree, Anuj]
		Popped element: Anuj
		Popped element: Shree
		Popped element: Sai
		Remaining Stack: [Aachal, Shubhangi, Prabhat, Aman, Aman, Pooja, Vikas]
 */