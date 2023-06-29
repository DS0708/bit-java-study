package chapter03;

public class SwapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		
		System.out.println("a:"+a+"\nb:"+b);
		
		//Local version
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("Call by value\na:"+a+"\nb:"+b);
		
		//Global version
		System.out.println("\n\n");
		IntValue a_c = new IntValue(10);
		IntValue b_c = new IntValue(20);
		
		System.out.println("a:"+a_c.getValue()+"\nb:"+b_c.getValue());
		
		System.out.println("Call by reference");
		swap(a_c,b_c);
		
		System.out.println("a:"+a_c.getValue()+"\nb:"+b_c.getValue());
		
		
	}

	private static void swap(IntValue a, IntValue b) {
		// TODO Auto-generated method stub
		int temp = a.getValue();
		a.setValue(b.getValue());
		b.setValue(temp);
	}
}
