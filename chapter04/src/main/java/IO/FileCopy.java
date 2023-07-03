package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("dog.png");
			os = new FileOutputStream("dog.copy.png");
			
			int data = -1;
			while((data=is.read()) != -1) {
				os.write(data);
				data = is.read();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File Not Found:"+e);
		}catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IOException:"+e);
		}
		finally {
			try {
				if(is != null)	is.close();
				if(os != null)	os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
