package com.svr.singlylinkedlist;

public class LinkedListInsertAtFirst<T> {
	private Node<T> head;

	private static class Node<T> {
		private T data;
		private Node<T> next;

		public Node(T data) {
			super();
			this.data = data;
			this.next = null;
		}
	}

	public void insertFirst(T data) {
		Node<T> newNode = new Node<T>(data);
		newNode.next = head;
		head = newNode;
	}

	public void displayLinkedList() {
		Node<T> currentNode = head;
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
		System.out.println(currentNode);
	}

	public static void main(String[] args) {
		LinkedListInsertAtFirst<Integer> ls = new LinkedListInsertAtFirst();
		ls.insertFirst(10);
		ls.insertFirst(20);

		ls.displayLinkedList();
	}

}
