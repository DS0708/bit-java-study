package chapter01;

public class Ex23_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The multiplication table of 99
		for(int i=1; i<=9;i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%2d*%2d=%2d ",i,j,i*j);
			}
			System.out.println();
		}
	}

}
