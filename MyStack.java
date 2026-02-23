package Queque;
import java.util.LinkedList;
import java.util.Queue;
class MyStack {
	private Queue<Integer> queue = new LinkedList<>();

	public void push(int x) {
		queue.add(x);
		for (int i = 1; i < queue.size(); i++) {
			queue.add(queue.remove());
		}
	}

	public int pop() {
		return queue.remove();
	}

	public int top() {
		return queue.peek();
	}

	public boolean empty() {
		return queue.isEmpty();
	}

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(10);
		stack.push(20);
		System.out.println(stack.top()); // 20
		System.out.println(stack.pop()); // 20
		System.out.println(stack.empty()); // false
	}
}
