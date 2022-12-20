package PriorityQueue;

import java.util.ArrayList;
// Min Heap;
public class PriorityQueue {
    private ArrayList<Integer> heap;
    
    public PriorityQueue() {
    	heap = new ArrayList<>();
    }
    
    public boolean isEmpty() {
    	return heap.size() == 0;
    }
    
    public int size() {
    	return heap.size();
    }
    
    public int getMin() throws PriorityQueueException {
    	if(isEmpty()) {
    		throw new PriorityQueueException();
    	}
    	return heap.get(0);
    }
    
    public void insert(int element) {
    	heap.add(element);
    	int childIndex = heap.size()-1;
    	int parentIndex = (childIndex - 1)/2;
    	while(childIndex > 0) {
    		if(heap.get(childIndex) < heap.get(parentIndex)) {
    			int temp = heap.get(childIndex);
    			heap.set(childIndex, heap.get(parentIndex));
    			heap.set(parentIndex, temp);
    			childIndex = parentIndex;
    			parentIndex = (childIndex-1)/2;
    		}
    		else {
    			return;
    		}
    	}
    }
    
    int removeMin() throws PriorityQueueException {
		if(isEmpty()) {
			throw new PriorityQueueException();
		}
		int ans = heap.get(0);
		heap.set(0,heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		int parentIndex = 0;
		int child1 = 2*parentIndex + 1;
		int child2 = 2*parentIndex + 2;
		int temp=0;
		while(child1 < heap.size() ){
		if(child1 < heap.size()){
			temp = child1;
			if(child2 < heap.size()){
				if(heap.get(child1) <= heap.get(child2)){
					temp = child1;
				}
				else{
					temp = child2;
				}
			}
		}
		if(heap.get(parentIndex)>heap.get(temp)){
			int t = heap.get(parentIndex);
			heap.set(parentIndex,heap.get(temp));
			heap.set(temp,t);
			parentIndex++;
			 child1 = 2*parentIndex + 1;
			 child2 = 2*parentIndex + 2;
		}
		else{
			return ans;
		}
	}
		return ans;
	}
}