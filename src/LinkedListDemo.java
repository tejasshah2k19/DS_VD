
public class LinkedListDemo {

	public static void main(String[] args) {
		SingleLinkedList sl = new SingleLinkedList();
		sl.addNode(10);
		sl.addNode(20);
		sl.addNode(30);
	}
}

class SingleLinkedList {

	Node head = null;
	Node last = null;

	void addNode(int data) {
		if (head == null) {
			head = new Node();
			head.data = data;
			head.next = null;
			last = head;
		} else {
			Node tmp = new Node();
			tmp.data = data;
			tmp.next = null;
			last.next = tmp;
			last = tmp;
			
		}
	}

	void display() {

	}
}

class Node {
	int data;
	Node next;
}