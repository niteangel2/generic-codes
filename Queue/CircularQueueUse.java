package Queue;

public class CircularQueueUse {
    public static void main(String[] args){
        CircularQueueUsingArray q = new CircularQueueUsingArray(5);
			q.add(1);
			q.add(2);
			q.add(3);
			q.add(4);
			q.add(5);
			System.out.println(q.remove());
			q.add(6);
			System.out.println(q.remove());
			q.add(7);
			System.out.println("Remaining elements in Circular Queue");
			while(! q.isEmpty()) {
				System.out.print(q.remove() + " ");
			}
    }
}
