package prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요: ");
		
		int n = scanner.nextInt();
		int sum = 0;
		int i =0;
		
		if(n%2!=0) {
			i = 1;
		}
		
		for(; i<=n; i+=2) {
			sum += i;
		}
		
		System.out.print("결과 값 : "+sum);
		
		scanner.close();
	}
}
