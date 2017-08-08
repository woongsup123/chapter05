package prob5;

import java.util.Arrays;
import java.util.stream.Stream;

public class MyStack <E>{
	
	private final int BOTTOM = 0;
	private int top;
	private int capacity;
	private E[] buffer;
	
	@SuppressWarnings("unchecked")
	public MyStack(int capacity) {
		top = -1;
		this.capacity = capacity;
		buffer = (E[])new Object[capacity];
	}

	@SuppressWarnings("unchecked")
	public void push(Number n) {
		
		if (top >= capacity - 1) { //if stack is full
			E[] tempBuffer = (E[])new Object[capacity];
			capacity *= 2;
			tempBuffer = (E[]) Stream.concat(	Arrays.stream(buffer),
										Arrays.stream(tempBuffer)
									  ).toArray();
			buffer = (E[])new Object[capacity];
			buffer = tempBuffer;
		}
		buffer[++top] = (E) n;
	}

	public E pop() throws MyStackException {
		
		if (top < BOTTOM) {
			throw new MyStackException();
		}
		
		E returnVal = buffer[top];
		buffer[top] = null;
		top--;
		
		return returnVal;
	}

	public boolean isEmpty() {
		return top == -1;
	}
}
