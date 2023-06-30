package chapter04;

public class StringTest03 {
	public static void main(String[] args) {
		String s1 = "aBcABCabcAbc";
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf("AB"));		//해당 문자열이 없을 경우 return -1;
		System.out.println(s1.indexOf("abc", 5));	//인덱스 5부터 "abc"라는 문자열을 찾아 인덱스 리턴/ 없으면 return -1;	
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3, 5));
		
		String s2 = "   ab    cd   ";
		String s3 = "efg,hij,klm,nop,qrs";
		
		String s4 = s1.concat(s3);
		System.out.println(s4);
		
		System.out.println("----" + s2.trim() + "----");		//trim 은 앞 뒤 공백 제
		System.out.println("----" + s2.replaceAll(" ", "") + "----");	//replaceAll은 첫번째 매개변수를 두번째 매개변수로 대체함.
		
		String[] tokens = s3.split(",");
		for(String s : tokens) {
			System.out.println(s);
		}
		
		String[] tokens2 = s3.split(" ");
		for(String s : tokens2) {
			System.out.println(s);
		}
	}
}