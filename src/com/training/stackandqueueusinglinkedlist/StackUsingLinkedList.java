package com.training.stackandqueueusinglinkedlist;

public class StackUsingLinkedList<T> {

	private Node<T> head = null;

	/**
	 * implementation to create push function of stack
	 */
	public void push(T value) {

		Node<T> newNode = new Node<T>(value);
		if (head == null) {
			head = newNode;
		}

		else {
			newNode.setNext(head);
			head = newNode;
		}
	}

	/**
	 * To print stack
	 */
	public void printStack() {

		Node<T> temp = head;
		while (temp != null) {
			System.out.print(temp.getKey() + "-->");
			temp = temp.getNext();
		}
		System.out.println();
	}

	/**
	 * To display the top element of the stack
	 */
	public void peek() {
		System.out.println("The top element is " + head.getKey());
	}

	/**
	 * To pop element from the stack
	 */
	public void pop() {
		Node<T> temp = head;
		head = temp.getNext();
		System.out.println("Item popped");
	}

	public static void main(String[] args) {

		StackUsingLinkedList<Integer> stack = new StackUsingLinkedList<>();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.printStack();
		stack.peek();
		stack.pop();
		stack.printStack();
		stack.peek();
		stack.pop();
		stack.printStack();
		stack.peek();
		stack.pop();
		stack.printStack();

	}

}
