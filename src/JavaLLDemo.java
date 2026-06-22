import java.util.LinkedList;
import java.util.Stack;

public class JavaLLDemo {

	public static void main(String[] args) {

		// stack

		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);

		System.out.println(stack.size());
		System.out.println(stack.pop());// 50
		System.out.println(stack.size());

		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		
		//1 2 3 
		
		 
		

		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l2.add(10);
		l2.add(20);
		l2.add(30);

		for (int i = 0; i < l1.size(); i++) {
			int ans = l1.get(i) + l2.get(i);
			System.out.println(ans);
		}

		// 35

		// 15
		// 16
	}
}
