package PriorityQueues;

public class SortedLinkedListPQ implements PriorityQueue {
	
	SLinkedList head;
	int size;
	
	class SLinkedList{
		String V;
		int K; 
		SLinkedList next;
		SLinkedList()
		{
			V = null;
			K = 1;
			next = null;
		}
		SLinkedList(String v, int k)
		{
			V = v;
			K = k;
			next = null;
		}
		SLinkedList(String v, int k, SLinkedList next)
		{
			V = v;
			K = k;
			this.next = next;
		}
		
		int getKey() {return K;}
		String getValue() {return V;}
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public double findMin() {
		return head.K;
	}

	@Override
	public void insert(String V, int K) {
		if (head == null) {
			head = new SLinkedList(V,K);
		} else if (K < head.K) {
			SLinkedList temp = head;
			head = new SLinkedList(V,K, temp);
		} else {
			SLinkedList curr = head;
			while (curr.next != null && curr.next.K < K) {
				curr = curr.next;
			}
			SLinkedList temp = curr.next;
			curr.next = new SLinkedList(V,K, temp);
		}
		size++;

	}

	@Override
	public boolean removeMin() {
		if (this.isEmpty()) {
			return false;
		}
		head = head.next;
		this.size--;
		return true;
	}
	void printList()
	{
		SLinkedList curr = head;
		while(curr.next!=null)
		{
			System.out.println(curr.V + " : " + curr.K);
			curr = curr.next;
		}
	}

}
