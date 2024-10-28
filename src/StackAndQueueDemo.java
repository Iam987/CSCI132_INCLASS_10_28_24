import java.util.Stack;

public class StackAndQueueDemo {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("AAA");
		stack.push("Aasdf");
		stack.push("Agreg");
		stack.push("ttt");
		stack.push("ahhrhbbesr");
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
