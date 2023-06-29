package chapter01;

public class Ex13IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = ' ';
		int score = 92;
		
		
//		if(score >= 90){
//			grade = 'A';
//		}else if(score >= 80){
//			grade = 'B';
//		}else {
//			grade = 'F';
//		}
			
		
		//Convert If_Statement to Switch_Statement
		switch(score/10) {
		case 10 :
		case 9  :
			grade = 'A';
			break;
		case 8 :
			grade = 'B';
			break;
		case 7 :
			grade = 'C';
			break;
		case 6 :
			grade = 'D';
			break;
		default :
			grade = 'F';
			break;
			
		}
		
		
		
		System.out.println("The grade is "+grade + ".");
		
	}
}

