
public class DList {
	private DListNode header;
	private int size = 0;
	
	
	public DList(){
		header = new DListNode();
		// only for circular list
		// header.next = header;
	}
	
	public int getSize(){
		return size;
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	
	public void delFirst(){
		if(header.next!=null){
			header.next = header.next.next; //    Tiger point to Jared
			header.next.prev = header;
		}
	}
	
	public void addFirst(Object x){ // x can be a String 
		DListNode tmp = new DListNode(x);		
		tmp.next = header.next;
		tmp.prev = header;
		
		tmp.prev.next = tmp;
		if(tmp.next != null)
			tmp.next.prev = tmp;
	}
	
	public void printList(){// print the whole list	
		DListNode runner = header;
		while(runner.next != null){
			System.out.print(""+runner.next.info.toString() + "\t" );
			runner = runner.next;
		}
		System.out.println();
	}
	

}