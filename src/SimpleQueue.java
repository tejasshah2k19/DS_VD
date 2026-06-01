
public class SimpleQueue {

	int front;
	int rear;
	final int SIZE = 5;
	int queue[] = new int[SIZE];

	public SimpleQueue() {
		front = -1;
		rear = -1;
	}

	public static void main(String[] args) {

		SimpleQueue q = new SimpleQueue();

		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.display();
		q.enqueue(100);

		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.display();
		
		q.enqueue(1000);
		q.display();
	}

	void dequeue() {
		if (front == -1) {
			System.out.println("Queue empty ");
		} else {
			System.out.println(queue[front] + " deleted ... ");
			if (front == rear) {
				front = -1;
				rear = -1;
			} else {
				front++;
			}
		}

	}

	void enqueue(int num) {

		if (rear == SIZE - 1) {
			System.out.println("Queue is Full :: " + num);
		} else {
			rear++;
			queue[rear] = num;
			if (front == -1) {
				front = 0;// first time insertion
			}
			System.out.println("data inserted..."+num);
		}
	}

	void display() {
		if (front == -1) {
			System.out.println("Queue empty ");

		} else {
			for (int i = front; i <= rear; i++) {
				System.out.println(queue[i]);
			}
		}
	}
}
