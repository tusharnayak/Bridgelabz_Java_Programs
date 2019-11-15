package com.Bridgelabz.DataStructure;

public class Deque {
	Node front;
	Node rear;

	public Deque() {
		front = null;
		rear = null;
	}

	class Node {
		char data;
		Node next;

		public Node(char item) {
			this.data = item;
			this.next = null;
		}
	}

	public int size() {
		int count = 0;
		Node temp = front;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public void addRear(char item) // ADD DATA IN REAREND
	{
		Node n = new Node(item);
		n.data = item;
		n.next = null;
		if (front == null) {
			front = rear = n;
		} else {
			rear.next = n;
			rear = n;
		}
	}

	public void addFront(char item) {
		Node n = new Node(item);
		n.data = item;
		n.next = null;
		if (front == null) {
			front = null;
			rear = null;
		} else {
			n.next = front;
			front = n;
		}
	}

	public char removeRear() {
		Node temp = front;
		char c = 0;
		if (isEmpty()) {
			System.out.println("underflow");
		} else {
			if (front.next == null) {
				c = temp.data;
				temp = null;
			} else {
				for (int i = 1; i < size() - 1; i++) {
					temp = temp.next;
				}
				c = temp.next.data;
				temp.next = null;
				rear = temp;
			}
		}
		return c;
	}

	public void removeFront() {
		if (isEmpty()) {
			System.out.println("underflow");
		} else {
			front = front.next;
		}
	}

	public boolean isEmpty() {
		boolean flag = (front == null ? true : false);
		return flag;
	}

	public char display() {
		Node temp = front;
		char temp2;
		if (isEmpty()) {
			System.out.println("not displayed");
		}
		if (temp.next == null) {
			temp2 = temp.data;
			temp = null;
			return temp2;
		} else {
			while (temp.next.next != null) {
				temp = temp.next;
			}
			temp2 = temp.next.data;
			temp.next = null;
			return temp2;
		}
	}
}
