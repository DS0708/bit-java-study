package chapter01;

public class Ex01Literal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
	      String s = "Hello";
	      
	      System.out.println(i);   //기본 변수
	      System.out.println(s);   //얘는 사실 클래스임, c에서 char배열을 통해 String을 구현하던것과 다르게 더 추상화시켜서 변수처럼 쓸 수 있도록 만듦
	      
	      System.out.println("변수 변경 로직(algorithm)");
	      i = 2000;
	      s = "Hello World";
	      
	      System.out.println(i);
	      System.out.println(s);
	      
	      final double pi = 3.14;
	      System.out.println(pi);
	      
	      //pi는 상수여서 값을 변경할 수 없음.
	      //pi = 3.1416;
	}

}
