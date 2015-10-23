
public class DListNode {
	Object info;
    DListNode next;
	DListNode prev;
    
    public DListNode(){ // default val == 0, next == null
    	info = null;
    	next = null;
    	prev = null;
    }
    
    public DListNode(Object x){
    	info = x;
		prev = null;
		next = null;
    }
}