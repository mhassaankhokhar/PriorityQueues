package PriorityQueues;



public interface PriorityQueue {
	public int size();
	// Returns whether the priority queue is empty.
	public boolean isEmpty();
	public double findMin();
	public void insert(String V, int K);
	public boolean removeMin();
}
