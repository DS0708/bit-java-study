package chapter01;

public class Ex26_Continue_And_StaticFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		testFor();
		
		//When you use the Continue_Statement in While_code, keep in mind that they have condition!
		testWhile();
	}

	private static void testWhile() {
		// TODO Auto-generated method stub
		int i=0;
		while(i<10) {
			if(i % 2 !=0) {
				i++;		//key_code
				continue;
			}
			
			System.out.println(i);
			i++;
		}
	}

	private static void testFor() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}
	

}
