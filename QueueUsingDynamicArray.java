package stacksAndQueues2L;

public class QueueUsingDynamicArray {
	private int[] arr;
	private int counter;
	
	QueueUsingDynamicArray() {
		this.arr = new int[5];
		this.counter = 0;
	}
	
	public void enqueue(int data) {
		if(this.counter == this.arr.length - 1) {
			this.reStructure();
		}
		this.arr[counter] = data;
		counter += 1;
	}
	
	public int dequeue() {
		if(this.isEmpty()) {
			System.out.println("Queue is Empty!");
			return -1;
		}
		int temp = this.arr[0];
		for(int i = 1; i <= this.counter; i++) {
			this.arr[i-1] = this.arr[i];
		}
		counter -= 1;
		return temp;
	}
	
	public boolean isEmpty() {
		if(this.arr[0] == 0) {
			return true;
		}
		return false;
	}
	
	public int size() {
		return this.counter;
	}
	
	public int front() {
		if(this.isEmpty()) {
			System.out.println("Queue is Empty!");
			return -1;
		}
		return this.arr[0];
	}
	
	private void reStructure() {
		int[] temp = new int[this.arr.length * 2];
		for(int i = 0; i < this.arr.length; i++) {
			temp[i] = this.arr[i];
		}
		this.arr = temp;
	}
}
