package PriorityQueues;



public class UnSortedArrayPQ implements PriorityQueue {
	Array arr[];
	int index = 0;
	
	UnSortedArrayPQ()
	{
		arr = new Array[1];
		for(int i=0; i<arr.length;i++)
		{
			arr[i] = new Array();
		}
	}
	UnSortedArrayPQ(int size)
	{
		this.arr = new Array[size];
	}
	
	class Array{
		String V;
		int K;
		
		
		String getVal() {return V;}
		int getKey() {return K;}
	}
	
	

	@Override
	public int size() {
		return arr.length;
	}

	@Override
	public boolean isEmpty() {
		if(this.arr[0]==null)
			return true;
		else
			return false;
	}
	
	

	@Override
	public double findMin() {
		return this.arr[0].K;
	}

	@Override
	public void insert(String V, int K) {
		try {
			this.arr[index] = new Array();
			this.arr[index].V=V;
			this.arr[index].K=K;
			index++;
			if(index==this.arr.length)
			{
				int newsize = this.arr.length+this.arr.length;
				Array[] newArr = new Array[newsize];
				Array[] temp = this.arr;
				this.arr = newArr;
				for(int i=0; i<temp.length;i++)
				{
					this.arr[i] = new Array();
					this.arr[i] = temp[i];
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("This is: "+e.getMessage());
		}
	}
	
	@Override
	public boolean removeMin() {
		for(int i=1;i<index;i++)
		{
			this.arr[i-1] = this.arr[i];
		}
		this.arr[index-1] = null;
		float percentfill = ((float)index/(float)this.arr.length)*100;
		if(percentfill<=25.0)
		{
			int newsize = arr.length - arr.length/2;
			Array[] newArr = new Array[newsize];
			Array[] temp = this.arr;
			this.arr = newArr;
			for(int i=0; i<index;i++)
			{
				this.arr[i] = new Array();
				this.arr[i] = temp[i];
			}
		}
		
//		for(int i=0;i<index-1;i++)
//		{
//			System.out.println(this.arr[i].V);
//		}
		if(this.arr[index-1] == null)
		{
			index--;
			return true;
		}
		return false;
	}


}
