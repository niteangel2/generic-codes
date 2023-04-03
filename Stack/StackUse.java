package Stack;

public class StackUse {
    public static void main(String[] args) {
		Stack.push(2);
		Stack.push(4);
		Stack.push(6);
		System.out.println(Stack.peek());
		while(! Stack.isEmpty()) {
			System.out.println(Stack.pop());
		}
	}
}
