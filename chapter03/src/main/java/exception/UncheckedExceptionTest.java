package exception;

public class UncheckedExceptionTest {
	public static void main(String[] args){
		int[] a = {1,2,3,4,5};
		
		for(int i=0; i<= a.length; i++) {
			System.out.println(a[i]);
		}
		
		//이런 예외 처리는 try catch를 쓰는 것이 아닌 고쳐야 된다. 근데 해도 됨 해보자
		//unchecked exception은 에러가 터지면 try catch문에 넣어 놓는 것이 아닌 에러를 찾아서 고쳐야하는 것 임 . Because this is logical error.
		//ArrayIndexOutOfBoundsException
		//ArithmeticException
		//NullPointException
		
//		try {
//			for(int i=0; i<= a.length; i++) {
//				System.out.println(a[i]);
//			}
//		}catch(ArrayIndexOutOfBoundsException ex) {
//			ex.printStackTrace();
//		}
		
		
	}
}
