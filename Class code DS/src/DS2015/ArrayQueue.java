package DS2015;

public class ArrayQueue {
	private final int CAPACITY = 7;
	private int [] data;
	private int headIndex =0, tailIndex = 0;
	private int size;
	
	// good habit to clearly define the constructor
	public ArrayQueue(){
		data = new int[7];
		headIndex =0;
		tailIndex = 0;
		size = 0;
	}
	
	public int getSize(){
		return size;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public void enQueue(int x){
		if (size == this.CAPACITY){
			throw new IllegalStateException("Queue is full");
		}
		tailIndex = (tailIndex+1) % this.CAPACITY;
		data[tailIndex ] = x;
		size++;
	}
	public int deQueue(){
		if(size == 0)
			throw new IllegalStateException("Queue is empty , cannot deQueue");
		int result = data[headIndex];
		headIndex = (headIndex+1) & this.CAPACITY;
		return result;
		}
	
	public int peekFirst(){
		
		return 0;
	}
}


