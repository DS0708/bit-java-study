package chapter01;

public class Ex14_If_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Swap
		int n1 = 10;
		int n2 = 30;
		
		System.out.println("The Initial Value for n1, n2");
		System.out.println("n1 : "+n1);
		System.out.println("n2 : "+n2);
		
		if(n1 < n2) {
			int temp = n2;
			n2 = n1;
			n1 = temp;
		}
		
		System.out.println("n1 : "+n1);
		System.out.println("n2 : "+n2);
		
		//Max
		int a1 = 200;
		int a2 = 10;
		int a3 = 50;
		int max =0;
		
		if (a1 >= a2) {
			if (a1 >= a3) {
				max = a1;
			}else max = a3;
		}else if (a2>=a3) max = a2;
		else max = a3;
		
		System.out.println("max : " + max);
		
	}

}
