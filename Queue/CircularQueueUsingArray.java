package Queue;

public class CircularQueueUsingArray {
	
	int arr[];
	int size;
	int rear = -1;
	int front = -1;
	
	public CircularQueueUsingArray(int n) {
		this.size = n;
		arr = new int[n];
	}
	
	public boolean isEmpty() {
		return rear == -1 && front == -1;
	}
	
	public boolean isFull() {
		return (rear + 1) % size == front;
	}
	
	public void add(int data) {
		if(isFull()) {
			System.out.println("Queue is Full");
			return;
		}
		if(front == -1) {
			front = 0;
		}
		rear = (rear + 1) % size;
		arr[rear] = data;
	}
	
	public int remove() {
		if(isEmpty()) {
			System.out.println("Empty Queue");
			return -1;
		}
		int res = arr[front];
		if(rear == front) {
			rear = front = -1;
		}
		else {
			front = (front + 1) % size;
		}
		return res;
	}
	
	public int peek() {
		if(isEmpty()) {
			return -1;
		}
		return arr[front];
	}
}
