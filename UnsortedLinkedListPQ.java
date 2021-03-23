package PriorityQueues;



public class UnsortedLinkedListPQ implements PriorityQueue {
	
	USLinkedList head;
	int size = 0;
	UnsortedLinkedListPQ()
	{
		head = null;
	}
	
	class USLinkedList {
		String V;
		int K;
		USLinkedList next;
		
		
		int getKey() {return K;}
		String getValue() {return V;}
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return head==null;
	}

	@Override
	public double findMin() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void insert(String V, int K) {
		USLinkedList nN = new USLinkedList();
		nN.V = V;
		nN.K = K;
		nN.next = null;
		
		if(head == null)
		{
			head = nN;
			size++;
		}
		else
		{
			USLinkedList curr = head;
			while(curr.next!=null)
			{
				curr = curr.next;
			}
			curr.next = nN;
			size++;
		}
	}

	void printList() {
		USLinkedList curr = head;
		while(curr.next!=null)
		{
			curr = curr.next;
			System.out.println(curr.V);
		}
		
	}

	@Override
	public boolean removeMin() {
		head = head.next;
		size--;
		return true;
	}

}
