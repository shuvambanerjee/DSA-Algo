package arraysPart2;

import java.util.Stack;

public class StackProblem {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.add(1);
		st.add(2);
		st.add(3);
		st.add(4);
		st.add(5);
		st.add(6);
		st.add(7);
		st.add(8);
		st.add(9);
		st.add(10);
		st.add(11);
		st.add(12);
		printElement(st);

	}

	public static void printElement(Stack<Integer> st) {
		if (st.size() < 5) {
			System.out.println("There are not enough elements in the stack");
			return;
		}
		while (!st.isEmpty()) {
			if(st.size() == 5) {
				System.out.println(st.peek()); break; }
			st.pop();
		}
	}

}
