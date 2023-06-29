package chapter01;

import java.util.Scanner;

public class Ex20_PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//While-use
//		int result = 1;
//		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("power:");
//		int pow = scan.nextInt();
//		
//		while(pow>0) {
//			result  *= 2;
//			pow--;
//		}
		
		
		
		//For-use
		final int pow = 10;
		int result = 1;
		
		for(int i=0; i< pow; i++) {
			result *= 2;
		}
		System.out.println("2^"+pow+" = "+result);
	}

}
