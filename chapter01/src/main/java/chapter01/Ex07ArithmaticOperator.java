package chapter01;

public class Ex07ArithmaticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 7;
		
		//binary operator(이항연산자)
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		//unary operator(단항연산)
		++ a;
		a ++;
		
		a = a + 1;
		System.out.println(a);	// System.out.println(++a);
	}

}
