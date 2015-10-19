package DS2015;

public class ArrayStack {
	int CAPACITY = 1000;
	int size = 0;
	int[] stack = new int[CAPACITY];
//  public ArrayStack(){
//
//  }
	public int getSize(){
		return size;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public void push(int x){
		try{
			stack[size++]=x;
		}catch(Exeption e){
			System.out.println("stack is fulll. too many elements in Stack");
		}
	}
	
	public int pop(){
		int result = 0;
		try{
			result = stack[--size];
		}catch(Exception e){
			System.out.println("stack is already empty, cannot delete anymore");
		}
		return result;
	}
	
	public int top(){
		int result = 0;
		try{
			result = stack[size-1];
		}catch(Exception e){
			System.out.println("stack is already empty, cannot delete anymore");
		}
		return result;
		}
	}


