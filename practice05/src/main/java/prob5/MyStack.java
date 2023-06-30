package prob5;


public class MyStack{
//	private List<String> stack_list = new LinkedList<>();
	private String[] stack ;
	private int stack_count;
	
	public MyStack(int n) {
		super();
		stack = new String[1000];
		stack_count = 0;
	}

	public void push(String string) throws MyStackException {
		// TODO Auto-generated method stub
		if(stack_count>=stack.length) {
			throw new MyStackException("stack is FULL");
		}
		stack[stack_count++] = string;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (stack_count==0 ? true : false);
	}

	public String pop() throws MyStackException {
		// TODO Auto-generated method stub
		if(this.isEmpty()) {
			throw new MyStackException("stack is empty");
		}
		String s = stack[stack_count-1];
		stack[stack_count-1] = null;
		stack_count--;
		return s;	
	}

	
	
}