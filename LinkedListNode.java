package stacksAndQueues2L;

public class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;
	
	LinkedListNode(T data) {
		this.data = data;
		this.next = null;
	}
}