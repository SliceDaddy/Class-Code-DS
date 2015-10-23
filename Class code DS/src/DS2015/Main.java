package DS2015;

public class Main {

	public static void main(String[] args)  {
		SList list = new SList();
		list.addFirst(25);
		list.addFirst(0);
		list.addFirst(1);
		list.addFirst(2);
//		list.printList();
		

//		DList dList = new DList();
//		dList.addFirst(25);
//		dList.addFirst(0);
//		dList.addFirst(1);
//		dList.addFirst(2);
//		dList.printList();
/** for mid-term test
		int x= 0;
		System.out.println(x++);
		System.out.println(++x*10);
		System.out.println(x%2);
		
		x = 0;
		System.out.println(x+=3);
		System.out.println(x/2);
		// how to delete the first student
		System.out.println(Math.pow(2, 10));
		
		System.out.println(Math.sqrt(10));
		int sum =0;
		for(int i =7;i<=98;i+=7)
			sum+=i;
		System.out.println(sum);
		System.out.println(7*7*15);
		int A[] = {23,45,66};
		int[] B = getArrayClone(A);
		
		// clone list
		list.printList();
		SList clonedList = list.cloneList(list);
		clonedList.printList();
		clonedList = list.cloneList2(list);
		clonedList.printList();
		
		
		int[] C = {2,34,5,6};
		
		reverse(C);
		
		**/
		// class Array Stack
//		ArrayStack stack = new ArrayStack();
//		stack.push(1);
//		stack.pop();
//		stack.push(3);
//		stack.top();
//		stack.pop();
//		stack.pop();
//
//		stack.push(3);
//		stack.push(4);
//		stack.push(5);
		
		// class Array Queue
		ArrayQueue queue = new ArrayQueue();
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(5);
		
		queue.deQueue();
		queue.printQueue();
		
		
	}

	private static int[] getArrayClone(int[] a) {
		int n = a.length;
		int B[] = new int[2*n];
		for(int i =0;i<n;i++)
			B[i] = a[i];
		return B;
	}
	
	public static void reverse(int A[]){
		reverse(A,0,A.length-1);
	}
	
	private static void reverse(int [] A, int i,int j){
		if(i<j){
			int tmp = A[i];
			A[i] = A[j];
			A[j] = tmp;
			
			reverse(A,i+1,j-1);
		}
	}
}