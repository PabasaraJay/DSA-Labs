package Stack;

public class Stack {
	
	private int top;
	private int maxSize;
	private char[] stackArray;
	
	public Stack(int maxSize) {
		super();
		this.top = -1;
		this.maxSize = maxSize;
		this.stackArray = new char[maxSize];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == maxSize-1);
	}
	
	//push method- insert
	public void push(char ch) {
		if(!isFull()) {
			stackArray[++top]=ch;
		}
		else {
			System.out.println("Stack is Full");
		}
	}
	
	//pop method- delete
	public char pop() {
		if(!isEmpty()) {
			return stackArray[top--];
		}
		else {
			System.out.println("Stack is Empty");
		}
		return 0;
	}
	
	//peek method- top element
	public char peek() {
		if(!isEmpty()) {
			return stackArray[top];
		}
		else{
			System.out.println("Stack is Empty");
		}
		
		return 0;
	}
	
	//display method
	public void display() {
		System.out.println("Printing the stack elements");
		
		int i=top;
		do {
			System.out.println(stackArray[i] + "");
			i--;
		}
		while(i>=0);		
		
	}

}
