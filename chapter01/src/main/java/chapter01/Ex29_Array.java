package chapter01;

import java.util.Scanner;

public class Ex29_Array {

	public static void main(String[] args) {		//Array는 객체취급  -> must use 'new'
		// TODO Auto-generated method stub
//			int[10] intArray;		//error ? 
			int[] intArray;
			
			Scanner scan = new Scanner(System.in);
			
			int size = scan.nextInt();
			
			intArray = new int[size];
			
			for(int i=0 ; i<size; i++) {
				intArray[i] = i*10;
				System.out.print(intArray[i]+" ");
			}
			System.out.println();
			
			int sum=0;
			for(int i=0; i<size ; i++) {
				sum += intArray[i];
			}
			System.out.println("Average = "+ sum/intArray.length);	//Araay can use library's function 'length'
			
			
			int[] scores = {90,60,30};		//Array can be declared as this method
			
	}

}
