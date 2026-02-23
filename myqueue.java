package Queque;
import java.util.Stack;
class myqueue {
 private Stack<Integer> stack1;
 private Stack<Integer> stack2;
 public myqueue() {
 stack1 = new Stack<>();
 stack2 = new Stack<>();
 }
 public void push(int x) {
 stack1.push(x);
 }
 public int pop()
{
    if (stack2.isEmpty()) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }
 }
 public int peek()
{
    if (stack2.isEmpty()) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }
    return stack2.peek();
}
 public boolean empty() {
 return stack1.isEmpty() && stack2.isEmpty();
 }
 public static void main(String[] args)
{
   myqueue q = new myqueue();
   q.push(1);
   q.push(2);
   q.push(3);
   System.out.println(q.peek()); // 1
   System.out.println(q.pop());  // 1
   System.out.println(q.empty()); // false
}
}

