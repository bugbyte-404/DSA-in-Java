package L16_Mar1;

public class Queue {
	private int data[];
	private int front, size;

	public Queue() {
		data = new int[5];
		front = size = 0;

	}

	public Queue(int cap) {
		data = new int[cap];
		front = size = 0;
	}

	public void enqueue(int item) throws Exception {
		if(isFull())
			throw new Exception("Can't add Queue is Full ");

		int idx = (front + size) % data.length;
		data[idx] = item;
		size++;
	}

	public int dequeue() throws Exception{
		if(isEmpty())
			throw new Exception("Can't remove Queue is Empty.");
		int temp = data[front];
		front = (front + 1) % data.length;
		size--;
		return temp;

	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == data.length;
	}

	public void display() {
		System.out.println("--------------------");
		for (int i = front; i < front + size; i++) {
			System.out.print(data[i % data.length] + " ");
		}
		System.out.println("\n--------------------");
	}
}
