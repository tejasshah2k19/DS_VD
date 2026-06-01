import java.util.Scanner;
import java.util.Stack;

public class StackParaValidator {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

		Stack<Character> stack = new Stack<Character>();

		String expr = scr.next();// [][][[]][][]

		boolean flag = true;
		for (int i = 0; i < expr.length(); i++) {

			char c = expr.charAt(i);

			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else {
				char p = stack.pop();

				// ) (

				if (c == ')' && p == '(') {
					continue;
				} else if (c == ']' && p == '[') {
					continue;
				} else if (c == '}' && p == '{') {
					continue;
				} else {
					flag = false;
					break;
				}
			}

		}

		if(flag && stack.isEmpty()) {
			System.out.println("Valid");
		}else {
			System.out.println("Not Valid");
		}
	}
}
