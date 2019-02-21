package stacksAndQueues2L;

public class QueueUse {

	public static void main(String[] args) {
		QueueUsingDynamicArray queue = new QueueUsingDynamicArray();
		
//		queue.enqueue(10);
//		queue.enqueue(20);
//		queue.enqueue(30);
//		queue.enqueue(40);
//		queue.enqueue(50);
//		queue.enqueue(60);
		System.out.println(queue.front());
		System.out.println(queue.size());
		
		while(!queue.isEmpty() ) {
			System.out.println(queue.dequeue());
		}
		System.out.println(queue.dequeue());
		System.out.println(queue.size());

	}

}
