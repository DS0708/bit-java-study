package chapter03;

public class ArrayUtil {

	public static double[] intToDouble(int[] a1) {
		// TODO Auto-generated method stub
		double[] result = null;
		
		if(a1 ==null) {
			return result;
		}
		
		result = new double[a1.length];
		for(int i=0; i<a1.length; i++) {
			result[i] = a1[i];
		}
		
		
		return result;
	}

	public static int[] doubleToInt(double[] d2) {
		
		int[] result = null;
		
		if(d2 ==null) {
			return result;
		}
		
		result = new int[d2.length];
		for(int i=0; i<d2.length; i++) {
			result[i] = (int)d2[i];
		}
		
		
		return result;
	}

	public static int[] concat(int[] is, int[] is2) {
		// TODO Auto-generated method stub
		int[] result = null;
		int is2_copy_count=0;
		
//		System.out.println("Call concat");
		
		if(is==null && is2==null) {
			return result;
		}
		
		result = new int[is.length+is2.length];
		
		for(int i=0; i<result.length; i++) {
//			System.out.println("Call concat : For");
			if(i>=is.length) {
				result[i] = is2[is2_copy_count++];
				continue;
			}
			result[i] = is[i];
		}
		
		
		return result;
	}
}









