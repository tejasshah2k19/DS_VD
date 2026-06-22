package doubleLL;

public class DoubleLLDemo {

	public static void main(String[] args) {
	
		DoubleLinkedList d = new DoubleLinkedList();
		d.addNode(10);
		d.addNode(20);
	}
}

class DoubleLinkedList {

	Node head = null;
	Node last = null;

	void addNode(int data) {
		if (head == null) {
			head = new Node();
			head.data = data;
			head.next = null;
			head.prev = null;
			last = head;
		} else {
			Node tmp = new Node();
			tmp.data = data;
			tmp.next = null;
			last.next = tmp;
			tmp.prev = last;
			last = tmp;
		}
	}

	public void addNodeBEG(int data) {
		Node tmp = new Node();
		tmp.data = data;
		tmp.next = head;
		tmp.prev=null;
		head.prev=tmp;
		head = tmp;
	}

	void display() {
		Node p = head;

		while (p != null) {
			System.out.println(p.data);// 10
			p = p.next;
		}

	}

	void search(int data) {
		Node p = head;
		boolean flag = false;

		while (p != null) {
			if (p.data == data) {
				flag = true;
			}
			p = p.next;
		}

		if (flag) {
			System.out.println(data + " found ");
		} else {
			System.out.println(data + " not found");
		}
	}

	void delBeg() {
		Node p = head;
		head = head.next;
		p = null;
	}

	void delLast() {
		Node p = head; 
		
		while(p.next != last) {
			p=p.next;
		}
		
		p.next = null;
		last =p;
	}
	
	void addAny(int source,int data) {//30,90  44,90=>invalid source
		
	}
	
	void delAny(int source) {
		
	}
}

class Node {
	int data;
	Node next;
	Node prev;
}
