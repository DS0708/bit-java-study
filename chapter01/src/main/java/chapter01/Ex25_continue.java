package chapter01;

public class Ex25_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(int i=1; i<=20; i+=2) {
//			System.out.println(i);
//		}
		
		//Use Continue
		for(int i=1; i<=20; i+=2) {
			if(i%2==0) continue;
			System.out.println(i);
		}
	}

}
