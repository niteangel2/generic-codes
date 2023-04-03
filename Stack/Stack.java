package Stack;
class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}
public class Stack {
    public static Node head = null;
	
	public static boolean isEmpty() {
		return head == null;
	}
	
	public static void push(int element) {
		Node newNode = new Node(element);
		if(isEmpty()) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	public static int pop() {
		if(isEmpty()) {
			return -1;
		}
		int top = head.data;
		head = head.next;
		return top;
	}
	public static int peek() {
		if(isEmpty()) {
			return -1;
		}
		return head.data;
}
}
