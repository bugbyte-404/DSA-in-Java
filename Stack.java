package L16_Mar1;

public class Stack {
	private int data[];
	private int tos;

	public Stack() {
		data = new int[5];
		tos = -1;
	}

	public Stack(int cap) {
		data = new int[cap];
		tos = -1;
	}

	public void push(int item) throws Exception {
		if (isFull())
			throw new Exception("Can't push: Overflow\n");
		data[++tos] = item;

	}

	public int pop() throws Exception {

		if (isEmpty())
			throw new Exception("Can't pop: Underflow");
		int temp = data[tos];
		tos--;
		return temp;
	}

	public int peek() {
		return data[tos];
	}

	public int size() {
		return tos + 1;
	}

	public boolean isEmpty() {
		return (tos == -1);
	}

	public boolean isFull() {
		return (tos == data.length - 1);
	}

	public void display() {

		for (int i = tos; i >= 0; i--)
			System.out.println(data[i]);
		System.out.println("--------------------");
	}
}
