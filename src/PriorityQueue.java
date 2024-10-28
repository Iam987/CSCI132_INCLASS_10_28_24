import java.util.Collections;
import java.util.LinkedList;

public class PriorityQueue {
	private LinkedList<Patient> data;
	private int size;
	
	public PriorityQueue() {
		data = new LinkedList<Patient>();
		size = 0;
	}
	
	public void enqueue(Patient newPatient) {
		data.add(newPatient);
		size += 1;
		Collections.sort(data);
	}
	
	public Patient dequeue() {
		Patient removed = data.removeFirst();
		size += -1;
		return removed;
	}
	
	public Patient peek() {
		return data.getFirst();
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
}
