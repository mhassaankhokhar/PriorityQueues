package PriorityQueues;

public class SortedLinkedListPriorityQueue {

	public static void main(String[] args) {
		SortedLinkedListPQ SLLPQ = new SortedLinkedListPQ();
		SLLPQ.insert("Hassan", 1);
		SLLPQ.insert("Zohran", 2);
		SLLPQ.insert("Kundan", 1);
		SLLPQ.insert("Javed", 3);
		SLLPQ.insert("Saif", 1);
		SLLPQ.printList();
		SLLPQ.removeMin();
		System.out.println("After Deletion");
		SLLPQ.printList();
	}

}
