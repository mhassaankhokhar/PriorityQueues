package PriorityQueues;



public class UnsortedArrayPriorityQueue {
	// main method for Unsorted Array PQ
	public static void main(String[] args) {
		UnSortedArrayPQ USAPQ =new UnSortedArrayPQ();
		System.out.println(USAPQ);
		USAPQ.insert("H", 1);
//			System.out.print("Enter length: ");
			USAPQ.insert("Hassan", 1);
			USAPQ.insert("Rizwan", 2);
			USAPQ.insert("Saif", 1);
			USAPQ.insert("Nabeel", 3);
			USAPQ.insert("Kashif", 2);
			System.out.print(USAPQ.removeMin());
			System.out.println("Size is: "+USAPQ.size());
	}
	
}
