package IO;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedOutputStream bs = null;
		
		try {
//			//주 스트림 (기반 스트림 ) 
//			OutputStream fs = new FileOutputStream("test.txt");	
//			
//			//보조 스트림 
//			bs = new BufferedOutputStream(fs);
			
			bs = new BufferedOutputStream(new FileOutputStream("test.txt"));
			
			//for(int i = 97; i <= 122 ; i++) 	아래와 같음 
			for(char c= 'a'; c <= 'c'; c++) {
				bs.write(c);
				//bs.flush();			//아래에 bs.close할때 어차피 닫아짐 
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(bs!=null)	bs.close();			//하나만 닫아주면 모두 닫아진다 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
