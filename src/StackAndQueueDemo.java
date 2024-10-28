import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.PriorityQueue;

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
		
		Queue<String> queue = new LinkedList<String>();
		queue.add("xxx");
		queue.add("yyy");
		queue.add("zzz");
		
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.remove());
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(40);
		pq.add(4);
		pq.add(76);
		pq.add(233);
		pq.add(10);
		pq.add(1);
		
		System.out.println(pq.peek());
		System.out.println(pq.remove());
		System.out.println(pq.poll());
	}

}
