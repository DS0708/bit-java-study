package exception;

import java.io.*;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream is = null;
		
		try {
			is = new FileInputStream("hello.txt");
			int data = is.read();
			System.out.println((char)data);
		}catch (FileNotFoundException e) {
			System.out.println("error" + e);
		}catch (IOException e) {
			System.out.println("error" + e);
		}finally {
			try {
				if(is != null)	is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//핵심코드는 되게 짧지만 try/catch를 쓰면 매우 비효율적임. 가독성이 떨어짐 
		
	}

}
