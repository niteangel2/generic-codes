package PriorityQueue;

public class PriorityQueueUse {

	public static void main(String[] args) throws PriorityQueueException {
	
		PriorityQueue pq = new PriorityQueue();
		int arr[] = {1,-4,22,7,3};
		for(int i = 0;i < arr.length;i++) {
			pq.insert(arr[i]);
		}
		System.out.println(pq.getMin());
		System.out.println(pq.removeMin());
		System.out.println(pq.getMin());
		while(!pq.isEmpty()) {
			System.out.print(pq.removeMin() + " ");
		}
		

	}

}

