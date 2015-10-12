package DS2015;

public class SList {
	private SListNode header;
	private int size = 0;
	
	
	public SList(){
		header = new SListNode();
		// only for circular list
		// header.next = header;
	}
	
	public int getCount(){
		return size;
	}
	
	public void delFirst(){
		if(header.next!=null)
			header.next = header.next.next;
	}
	
	public void addFirst(int x){
		SListNode tmp = new SListNode(x);
		tmp.next = header.next;
		header.next= tmp;
	}
	
	public void printList(){// print the whole list	
		SListNode runner = header;
		while(runner.next != null){
			System.out.print(""+runner.next.val + "\t" );
			runner = runner.next;
		}
		System.out.println();
	}
	
	public int getSum(){
		int total = 0;
		SListNode runner = header;
		while(runner.next != null){
			total+=runner.next.val;
			runner = runner.next;
		}
		return total;
	}
}
}
