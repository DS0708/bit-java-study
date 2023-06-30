package chapter04;

public class StringTest04 {

	public static void main(String[] args) {
		// String s1 = "Hello" + " World " + "Java " + 17;
		String s1 = new StringBuffer("Hello ")		//StringBuilder은 동기화가 구현되어 있지않지만 StringBuffer은 동기화가 구현되어 thread-safe하다.
				.append(" World ")			//StringBuffer은 문자열을 object를 새로 생성하지 않고 수정하는 것이여서 String보다 성능상 이점이 있다.
				.append("Java ")
				.append(17)
				.toString();
		
		System.out.println(s1);
		
//		String s2 = "";
//		for(int i = 0; i < 100000; i++) {
//			s2 = s2 + i;
//			// s2 = new StringBuffer(s2).append(i).toString();
//		}

		StringBuffer sb = new StringBuffer("");
		for(int i = 0; i < 100000; i++) {
			sb.append(i);
		}
		String s2 = sb.toString();
		System.out.println(s2.length());
	}
}