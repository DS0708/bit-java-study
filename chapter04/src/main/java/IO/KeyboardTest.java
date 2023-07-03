package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class KeyboardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		try {
		//1. 기반 스트림 (standard input -> 'System.in' in JAVA)
		//System.in
		
		//2. 보조 스트림1(byte|byte|byte -> char) : utf-8
		InputStreamReader is = new InputStreamReader(System.in,"UTF-8");
		//InputStreamReader is = new InputStreamReader(socket.getSocketInputStream,"UTF-8");	//socket생성 후 
		
		//3. 보조 스트림2 (char1|char2|char3|\n -> "char1char2char3") 
		br = new BufferedReader(is);
		
		String line = null;
		while((line = br.readLine()) != null) {
			if("quit".equals(line)) break;
			
			System.out.println(line);
		}
		
		} catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(br!=null)
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}
