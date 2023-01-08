import java.util.*;
class Stack {
	class Node {
		int data;
		Node next;
		public Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	Node top = null;
	public void push(int data){
		Node newNode = new Node(data);
		if(top == null)
			top = newNode;
		else {
			newNode.next = top;
			top = newNode;
		}
	}
	public void pop(){
		if(top == null)
			System.out.println("Stack is empty");
		else
			top = top.next;
	}
	public void peak(){
		System.out.println("peak is "+top.data);
	}
	public void display(){
		Node currNode = top;
		if(top == null)
			System.out.println("Stack is empty");
		else {
			System.out.println("Elements in stack:");
			while(currNode != null){
				System.out.println(currNode.data);
				currNode = currNode.next;
			}
		}
	}
	public static void main(String[] args){
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.display();
		stack.peak();
		stack.pop();
		stack.pop();
		stack.display();
		stack.peak();	
	}
}
			