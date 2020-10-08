package com.training.stackandqueueusinglinkedlist;

public class QueueUsingLinkedList<T> {

	Node<T> head = null;
	Node<T> tail = null;

	/**
	 * Insertion implementation in queue
	 */
	public void enqueue(T value) {
		Node<T> newNode = new Node<T>(value);
		if (head == null) {
			head = newNode;
			tail = newNode;
		}

		else {
			tail.setNext(newNode);
			tail = newNode;
		}
	}

	/**
	 * printing queue
	 */
	public void printQueue() {

		Node<T> temp = head;
		while (temp != null) {
			System.out.print(temp.getKey() + "-->");
			temp = temp.getNext();
		}
		System.out.println();
	}

	public static void main(String[] args) {

		QueueUsingLinkedList<Integer> queue = new QueueUsingLinkedList<>();
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
		queue.printQueue();

	}

}
