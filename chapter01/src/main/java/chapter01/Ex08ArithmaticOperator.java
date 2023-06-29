package chapter01;

public class Ex08ArithmaticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int Time = 200000;
		int hour = Time/60/60 ;
		int minutes = Time/60 % 60 ;
		int second = Time % 60;
		
		
		System.out.println(Time + "초는 " +hour+"시간 "+minutes+"분 "+second+"초 입니다."); 
	}

}
