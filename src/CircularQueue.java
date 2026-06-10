
public class CircularQueue {

	int front;
	int rear;
	final int SIZE = 5;
	int queue[] = new int[SIZE];

	public CircularQueue() {
		front = -1;
		rear = -1;
	}

	public static void main(String[] args) {

		CircularQueue q = new CircularQueue();

		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.display();
		q.enqueue(100);

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
			} else if (front == SIZE - 1) {
				front = 0;
			} else {
				front++;
			}
		}
		// 50 60 X X 80
		// r f
	}

	void enqueue(int num) {

		if (rear == SIZE - 1 && front == 0) {
			System.out.println("Queue is Full :: " + num);
		} else if (rear == front - 1) {
			System.out.println("Queue is Full :: " + num);
		} else {
			if (rear == SIZE - 1) {
				rear = 0;
			} else {
				rear++;
			}

			queue[rear] = num;
			if (front == -1) {
				front = 0;// first time insertion
			}
			System.out.println("data inserted..." + num);
		}
	}

	void display() {
		if (front == -1) {
			System.out.println("Queue empty ");

		} else {
			if (rear >= front) {
				for (int i = front; i <= rear; i++) {
					System.out.println(queue[i]);
				}
			} else {
				for (int i = front; i < SIZE; i++) {
					System.out.println(queue[i]);
				}
				for (int i = 0; i <= rear; i++) {
					System.out.println(queue[i]);
				}

			}

		}
	}
}