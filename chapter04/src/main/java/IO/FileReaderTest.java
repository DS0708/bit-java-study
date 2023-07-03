package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class FileReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader in = null;
		InputStream is  = null;
		
		try {
			in = new FileReader("1234.txt");			//default : utf-8
			
			int count = 0;
			int data = -1;
			while((data = in.read()) != -1) {
				System.out.print((char)data);
				count++;
			}
			
			System.out.println("\n"+count);
			System.out.println("=================");
			count = 0;
			data = -1;
			is = new FileInputStream("1234.txt");
			while((data = is.read()) != -1) {
				System.out.print((char)data);		//byte단위로 읽기때문에 글자가 깨진다.
				count++;
			}
			System.out.println("\n"+count);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File Not Found:" + e);
		}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		finally {
			try {
				if(in != null)	in.close();
				if(is != null)	is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}
