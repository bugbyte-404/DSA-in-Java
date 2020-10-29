
public class StackUsingArraysClient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
StackUsingArrays stack = new StackUsingArrays(5);
stack.push(10);
stack.display();
for(int i=0;i<5;i++)
{
	stack.push(i*10);
	stack.display();
}
while(!stack.size()==0)
{
	stack.display();
	stack.pop();
}
}
}