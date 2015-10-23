package DS2015;

public class ArrayQueue {
	private int CAPACITY = 7;
	private int [] data;
	private int headIndex =0, tailIndex=0;
	private int size =0;
	
	// good habit to clearly define the constructor
	public ArrayQueue(){
		data = new int[CAPACITY];
	}

	public ArrayQueue(int capacity){
		data = new int[capacity];
		this.CAPACITY=capacity;
	}
	
	public int getSize(){
		return size;
	}
	public boolean isEmpty(){
		return size == 0;
	}
	
	public void enQueue(int x){
		if(size == this.CAPACITY){
			throw new IllegalStateException("Queue is full, cannot add anymore");
		}
		data[tailIndex ] = x;
		tailIndex = (tailIndex+1) % this.CAPACITY;
		size++;		
	}
	public int deQueue(){
		if(isEmpty())
			throw new IllegalStateException("Queue is empty , cannot dequeue");
		int result = data[headIndex];
		headIndex = (headIndex+1) % this.CAPACITY;
		size--;
		return result;
	}
	
	public int peekFirst(){
		if(size == 0)
			throw new IllegalStateException("Queue is empty , cannot find any value");
		return data[headIndex];
	}
	public void printQueue(){
		for(int i =0;i<size;i++)
			System.out.print(data[(headIndex+i)%this.CAPACITY]+"\t");		
		System.out.println();
	}
}

