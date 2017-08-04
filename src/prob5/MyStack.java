package prob5;

import java.util.Arrays;
import java.util.stream.Stream;

public class MyStack {
	
	private final int BOTTOM = 0;
	private int top = -1;
	private int capacity;
	private String[] buffer;
	
	public MyStack(int capacity) {
		this.capacity = capacity;
		buffer = new String[capacity];
	}

	public void push(String str) {
		
		if (top >= capacity - 1) { //if stack is full
			String[] tempBuffer = new String[capacity];
			capacity *= 2;
			tempBuffer = Stream.concat(Arrays.stream(buffer), Arrays.stream(tempBuffer)).toArray(String[]::new);
			buffer = new String[capacity];
			buffer = tempBuffer;
		}
		buffer[++top] = str;
	}

	public String pop() throws MyStackException {
		
		if (top < BOTTOM) {
			throw new MyStackException();
		}
		
		String returnVal = buffer[top];
		buffer[top] = null;
		top--;
		
		return returnVal;
	}

	public boolean isEmpty() {
		
		if (buffer[BOTTOM] == null) {
			return true;
		}
		return false;
	}
}
