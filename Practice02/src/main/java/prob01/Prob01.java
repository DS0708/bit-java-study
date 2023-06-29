package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );

		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int[] Money_count = new int[MONEYS.length];
		
		/* 코드 작성 */
		System.out.print("금액:");
		int cost = scanner.nextInt();
		System.out.println();
		System.out.println();
		
		for(int i=0; i<MONEYS.length; i++) {
			Money_count[i] = cost/MONEYS[i];
			cost -= Money_count[i]*MONEYS[i];
		}
		
		for(int i=0; i<MONEYS.length; i++) {
			System.out.println(MONEYS[i]+"원 : "+Money_count[i]+"");
		}
		
		
		scanner.close();
 	}
}