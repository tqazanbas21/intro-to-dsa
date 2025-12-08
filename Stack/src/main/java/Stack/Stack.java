package Stack;

/**
 * This is an array based implementation of Stack, i.e. static one. This data struture follows LIFO principle, i.e. last-in-first-out. 
 * Stack ADT: 
 * 	Data: Stack elements;
 * 	Operation: pop(), push(), top(), isEmpty(), size();
 *      Error conditions: top()/pop() from an empty stack, push() into full stack;
 * 
 * One of the features of stack is that its main methods have O(1) complexity.
 * 
 * Stack can be useful in variety of sectors such as CPU scheduling, memory management and so on. It is also used to store the actions history and apparently, 
 * can be used to perform arithmetic operations (e.g. using reversed polish notation).
 */

public class Stack {
	private int size = -1;
	private int[] arr;
	private int capacity;
	public Stack (int capacity) {
		this.capacity = capacity;	
		arr = new int[this.capacity];
	} 

	public Stack () {
		this(100);	
	}
	public boolean isEmpty() {
		return size < 0;
	}
	public int size () {
		return size + 1;
	}
	public void push (int a) throws StackException {
		if (size + 1 == capacity) throw new StackException("Stack is full: cannot push");
		arr[++size] = a;
	}
	public int pop() throws StackException {
		if (isEmpty()) throw new StackException("stack is empty: cannot pop");
		return arr[size--];
	}
	public int top() throws StackException {
		if (isEmpty()) throw new StackException("stack is empty: cannot top");
		return arr[size];
	}

}

class StackException extends RuntimeException {
	public StackException (String err) {
		super(err);
	}

}
