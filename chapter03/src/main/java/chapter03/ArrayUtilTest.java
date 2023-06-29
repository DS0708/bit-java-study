package chapter03;

import java.util.Arrays;

public class ArrayUtilTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int to double
		int[] a1 = {0,1,2,3,4};
		
		double[] d1 =  ArrayUtil.intToDouble(a1);
		
//		System.out.println(d1);
		System.out.println(Arrays.toString(d1));		//array를 string으로 출력하고 싶을때 사용하는 유틸리티 함수 
		
		
		//double to int
		double[] d2 = {0.0,1.1,2.2,3.3};
		int[] a2 = ArrayUtil.doubleToInt(d2);
		System.out.println(Arrays.toString(a2));
		
		//merge two arrays
		int[] a3 = ArrayUtil.concat(new int[] {1,2,3,4}, new int[] {5,6,7,8});
		System.out.println(Arrays.toString(a3));
	}

}
