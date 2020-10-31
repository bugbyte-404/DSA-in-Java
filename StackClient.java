package L16_Mar1;

public class StackClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack s = new Stack(3);
		s.push(10);
		s.push(20);
		s.push(30);
//		s.push(40);
		s.display();
		s.pop();
		s.display();
		int peek = s.peek();
		System.out.println(peek);
		s.push(10);
		s.push(20);
		s.display();
		System.out.println(s.isFull());
	}

}
