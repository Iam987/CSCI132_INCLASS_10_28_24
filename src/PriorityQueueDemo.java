
public class PriorityQueueDemo {

	public static void main(String[] args) {
		Patient e1 = new Patient("Ian", 80);
		Patient e2 = new Patient("Iasdf", 32);
		Patient e3 = new Patient("adsan", 46);
		Patient e4 = new Patient("Iadsfn", 4);
		Patient e5 = new Patient("an", 0);
		Patient e6 = new Patient("erg", 1000);
		Patient e7 = new Patient("oakds", 24);
		
		PriorityQueue queue = new PriorityQueue();
		queue.enqueue(e1);
		queue.enqueue(e2);
		queue.enqueue(e3);
		queue.enqueue(e4);
		queue.enqueue(e5);
		queue.enqueue(e6);
		queue.enqueue(e7);
		
		System.out.println("Patient Removed: " + queue.dequeue());
		System.out.println("Patient Removed: " + queue.dequeue());
		System.out.println("Patient Removed: " + queue.dequeue());
		System.out.println("Patient Removed: " + queue.dequeue());
		System.out.println("Patient Removed: " + queue.dequeue());
		System.out.println("Patient Removed: " + queue.dequeue());
		System.out.println("Patient Removed: " + queue.dequeue());
	}

}
