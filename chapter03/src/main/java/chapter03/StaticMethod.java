package chapter03;

public class StaticMethod {
	int n;
	static int s_n;
	
	public void f1() {		
		System.out.println(n);
	}
	
	public void f2() {
		System.out.println(StaticMethod.s_n);
		//같은 클래스의 클래스(static) 변수 접근에서는 클래스 이름 생략이 가능하다. 
		//System.out.println(s_n);
	}
	
	public void f3() {
		f2();
	}
	
	public void f4() {
		s1();
	}
	
	public static void s1() {
		//error : static method에서는 인스턴스 변수에 접근 할 수 없다.
//		System.out.println(n);
	}
	
	public static void s2() {
		System.out.println(StaticMethod.s_n);
	}
	
	public static void s3() {
		//error : static method에서는 인스턴스 메소드에 접근 할 수 없다.
//		f2();
	}
	
	public static void s4() {
		StaticMethod.s1(); 				// same with s1();
	}
	
	//결론적으로 static은 static만 접근할 수 있다. 다른건 상관 없음.
}
