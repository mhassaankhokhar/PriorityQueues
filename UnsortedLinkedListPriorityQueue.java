package PriorityQueues;

public class UnsortedLinkedListPriorityQueue {

	public static void main(String[] args) {
		
		UnsortedLinkedListPQ USLLPQ = new UnsortedLinkedListPQ();
		USLLPQ.insert("Hassan", 1);
		USLLPQ.insert("Zohran", 2);
		USLLPQ.insert("Saif", 3);
		USLLPQ.insert("Rizwan", 1);
		USLLPQ.insert("Asad", 2);
		USLLPQ.insert("Aanand", 2);
		System.out.println("After Insertion!");
		USLLPQ.printList();
		USLLPQ.removeMin();
		System.out.println("After Deletion!");
		USLLPQ.printList();
	}

}
