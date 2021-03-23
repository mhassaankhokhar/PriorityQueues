package PriorityQueues;

public class SortedArrayPriorityQueue {
	public static void main(String[] args)
	{
		SortedArrayPQ SAPQ = new SortedArrayPQ();
		SAPQ.insert("Hassan", 1);
		SAPQ.insert("Rizwan", 0);
		SAPQ.insert("Tahir", 2);
		SAPQ.insert("Kundan", 1);
		SAPQ.insert("Javed", 3);
		SAPQ.insert("Hashir", 2);
		SAPQ.printArray();
		System.out.println("After Deletion");
		SAPQ.removeMin();
		SAPQ.printArray();
	}
}
