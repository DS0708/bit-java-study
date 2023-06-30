package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 10 - a;
		
		System.out.println(" some code1 ");
		
		try {
			System.out.println(" some code2 ");
			
			int result = (1 + 2 + 3) / b;
			
			System.out.println(" some code3 ");		//The code block behind the exception code is not excuted.
		} catch(ArithmeticException ex) {			//When the exception caused, this code block is excuted.
			/* Exception Handling */
			
			//ex.printStackTrace();					//정 할게 없으면 이거라도 써라 .
			
			//1. Applogize
			System.out.println("Sorry");
			
			//2. Logging to do debugging
			System.out.println(" error: "+ ex);
			
			//3. Normal Termination
			return ;
		} finally {									//After Catch block's 'return' is excuted, this block is excuted.
			System.out.println("Resource Arrangement");		//자원정리 
		}
		
		// 예외가 발생한 이 후에 실행할 가능성이 있는 코드 이기 때문에 비추 
//		System.out.println(" some code5");
		
		
	}

}
