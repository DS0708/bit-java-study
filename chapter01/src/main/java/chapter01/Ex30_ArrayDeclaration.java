package chapter01;

public class Ex30_ArrayDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[10] a;		//Don't determine Array's size when you declare
		
		//비추 
		int a1[] = new int[10];
		System.out.println(a1.length);
		
		//강추 
		int[] a2 = new int[10] ;
		System.out.println(a2.length);
		
		//Initialization
		int[] a3 = {0,2,3,4};
	}

}
