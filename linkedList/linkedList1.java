package linkedList;
public class linkedList1{
    public static Node insertAtTail(Node tail, int data) {
		Node temp = new Node(data);
		tail.next = temp;
		tail = temp;
		return tail;
	}
	

	public static void printLL(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
        Node node1 = new Node(10);
		Node head = node1;
		printLL(head);
    }
}