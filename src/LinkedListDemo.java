
public class LinkedListDemo {

	public static void main(String[] args) {
		SingleLinkedList sl = new SingleLinkedList();
		sl.addNode(10);
		sl.addNode(20);
		sl.addNode(30);
		sl.addNodeBEG(5); // 5 10 20 30
		sl.display();

		sl.search(110); // not found
		sl.search(20); // found

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

	public void addNodeBEG(int data) {
		Node tmp = new Node();
		tmp.data = data;
		tmp.next = head;
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
}