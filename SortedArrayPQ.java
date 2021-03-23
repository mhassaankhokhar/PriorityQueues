package PriorityQueues;

import PriorityQueues.UnSortedArrayPQ.Array;

public class SortedArrayPQ implements PriorityQueue {

	SArray[] arr;
	int index,min;
	SortedArrayPQ()
	{
		arr = new SArray[1];
		index = 0;
	}
	
	
	class SArray{
		String V;
		int K;
		
		
		
		String getVal() {return V;}
		int getKey() {return K;}
	}
	@Override
	public int size() {
		return this.arr.length;
	}

	@Override
	public boolean isEmpty() {
		return this.arr[0] == null;
	}

	@Override
	public double findMin() {
		return this.arr[0].K;
	}

	@Override
	public void insert(String V, int K) {
		try {
			this.arr[index] = new SArray();
			if(index==0)
			{
				this.arr[index].K = K;
				this.arr[index].V = V;
				min = K;
			}
			else {
				if(K<min)
				{
					this.arr[index].K = this.arr[index-1].K;
					this.arr[index].V = this.arr[index-1].V;
					this.arr[index-1].K = K;
					this.arr[index-1].V = V;
					min = K;
				}
				else if(K>this.arr[index-1].K)
				{
					this.arr[index].K = K;
					this.arr[index].V = V;				
				}
				else {
					for(int i=index-1;i>=0;i--)
					{
						if(K>=this.arr[i].K)
						{
							for(int j=index;j>i;j--)
							{
								this.arr[j].K = this.arr[j-1].K;
								this.arr[j].V = this.arr[j-1].V;
							}
							this.arr[i].K = K;
							this.arr[i].V = V;
							break;
						}
					}
				}
			}
			++index;
			if(index>=this.arr.length)
			{
				int newsize = 	this.arr.length+this.arr.length;
				SArray[] newArr = new SArray[newsize];
				SArray[] temp = this.arr;
				this.arr = newArr;
				for(int i=0; i<temp.length;i++)
				{
					this.arr[i] = new SArray();
					this.arr[i] = temp[i];
				}
			}
		}catch(Exception e)
		{
			System.out.println("Exception: "+e.getMessage());
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
			SArray[] newArr = new SArray[newsize];
			SArray[] temp = this.arr;
			this.arr = newArr;
			for(int i=0; i<index;i++)
			{
				this.arr[i] = new SArray();
				this.arr[i] = temp[i];
			}
		}
			index--;
			return this.arr[index-1] == null;
	}
	
	@SuppressWarnings("null")
	SArray[] sortArr(SArray[] ar, int size)
	{
		SArray[] temp = null; 
        for(int i=0; i < size; i++){  
                for(int j=1; j < (size-i); j++){  
                         if(ar[j-1].K > ar[j].K){  
                                //swap elements  
                                temp[j] = ar[j-1];  
                                ar[j-1] = ar[j];  
                                ar[j] = temp[j];  
                        }  
                         
                }  
        }  
        return ar;
	}
	
	void printArray()
	{
		for (int i=0;i<index;i++)
		{
			System.out.println(i + ": "+this.arr[i].V+":"+this.arr[i].K);
		}
	}

}
