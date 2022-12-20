package PriorityQueue;

public class InPlaceHeapSort {
	private static void insertInHeap(int[] arr, int i) {
		int childIndex = i;
		int parentIndex = (childIndex-1)/2;
		while(childIndex > 0) {
			if(arr[childIndex] < arr[parentIndex]) {
			int temp = arr[childIndex];
			arr[childIndex] = arr[parentIndex];
			arr[parentIndex] = temp;
			childIndex = parentIndex;
			parentIndex = (childIndex-1)/2;
			}
			else {
				return;
			}
		}
		
	}
	
	private static int removeMinFromHeap(int[] arr, int heapSize) {
	int ans = arr[0];
	arr[0] = arr[heapSize-1];
	heapSize--;
	int parentIndex = 0;
	int child1 = 2*parentIndex + 1;
	int child2 = 2*parentIndex + 2;
	int temp = 0;
	while(child1 < heapSize) {
		temp = parentIndex;
		if(arr[child1] < arr[temp]) {
			temp = child1;
		}
		if(child2 < heapSize && arr[child2] < arr[temp]) {
			temp = child2;
		}
		if(temp != parentIndex) {
			int t = arr[parentIndex];
			arr[parentIndex] = arr[temp];
			arr[temp] = t;
			parentIndex = temp;
			child1 = 2*parentIndex + 1;
		    child2 = 2*parentIndex + 2;
			
		}
		else
			return ans;
	}
		return ans;
}

	public static void main(String[] args) {
		int arr[] = {-2,7,0,-4,2,43,5,2,44,7,7,0};
		for(int i = 0; i < arr.length; i++) {
			insertInHeap(arr,i);
		}
		System.out.println("Heap");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int i = 0; i < arr.length; i++) {
			arr[arr.length-1-i] = removeMinFromHeap(arr,arr.length-i);
		}
		System.out.println();
		System.out.println("Sorted in descending order");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
