
class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}


public class QueueUsingLL {
	static class Queue{
		static Node head = null;
		static Node tail = null;
		static int size = 0;
		Queue(){
			
		}
	
		public static boolean isEmpty() {
			return head == null && tail == null;
		}
		
		public static void add(int data) {
			Node newNode = new Node(data);
			//First Node
			if(head == null) {
				head = newNode;
				tail = newNode;
				size++;
			}
			else {
				tail.next = newNode;
				tail = newNode;
				size++;
			}
		}
		
		public static int remove() {
			if(head == null) {
				System.out.println("Empty queue");
				return -1;
			}
			if(head == tail) {
				tail = null;
			}
			int res = head.data;
			head = head.next;
			size--;
			return res;
		}
		
		public static int peek() {
			if(head == null) {
				System.out.println("Empty Queue");
				return -1;
			}
			return head.data;
		}
		public static void main(String[] args) {
			Queue q = new Queue();
			q.add(1);
			q.add(2);
			q.add(3);
			System.out.println(q.peek() + "\n" + "Size of queue : " + size );
			while(! q.isEmpty()) {
				System.out.println(q.remove() + " ");
			}
			System.out.println("Size of queue: " + size);
			}
	}
}