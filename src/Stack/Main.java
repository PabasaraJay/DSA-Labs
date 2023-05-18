package Stack;

public class Main {

	public static void main(String[] args) {
		
		int i=0;
		
		Stack stack = new Stack(5);
		stack.push('S');
		stack.push('T');
		stack.push('A');
		stack.push('C');
		stack.push('K');
		
		stack.display();
		System.out.println("\n");
		System.out.println("The Peek value is : "+stack.peek() );
		System.out.println("\n");
		
		while(!stack.isEmpty()) {
			char ch2 = stack.pop();
			System.out.println("The Top deleted value is :"+ch2);
			i++;
		}
	}

}
