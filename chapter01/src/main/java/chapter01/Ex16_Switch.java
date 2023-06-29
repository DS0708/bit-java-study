package chapter01;

public class Ex16_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'F';
				
		switch(grade) {
			case 'A' :
				System.out.println("Great!!");
				break;
			case 'B' :
				System.out.println("Good!!");
				break;
			case 'C' :
				System.out.println("try your best.");
				break;
			case 'D' :
				System.out.println("try your best!!!!");
				break;
			case 'F' :
				System.out.println("try your best!!!!!!!!!!!!!!!!!!");
				break;
			default :
				System.out.println("Please enter correctly");
		}
	}

}
