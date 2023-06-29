package prob04;

public class StringUtil {
	
	
	public static String concatenate(String[] strArr) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<strArr.length;i++) {
			sb.append(strArr[i]);
		}
		return sb.toString();
	}
}
