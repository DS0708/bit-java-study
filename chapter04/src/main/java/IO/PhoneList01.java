package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PhoneList01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("phone.txt");
		
		if(!file.exists()) {//파일이 있는지 없는지를 exception으로 처리하는 거랑 Logic로 처리하는 거랑 천지 차이임, 될 수 있으면 logical하게 처리할
			System.out.println("File Not Found");
			return;
		}
		
		System.out.println("===The Information of file===");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.length() + "bytes");
		
//		Date d = new Date(file.lastModified());
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(file.lastModified())));
		//System.out.println(file.lastModified());
		
		System.out.println("===Phone Number===");
		InputStream fs = new FileInputStream(file);		//1. 기반 스트림 
		Reader isr = new InputStreamReader(fs); //2. 보조 스트림1
		BufferedReader br = new BufferedReader(isr);		//3. 보조 스트림2
		
		String line = null;
		while((line = br.readLine())!=null) {
			String[] ss = line.split("\t");
			System.out.print("name:"+ss[0]);
			System.out.println("\tTel.NO:"+ss[1]);
			
//			StringTokenizer st = new StringTokenizer(line,"\t ");
//			
//			int index = 0;
//			while(st.hasMoreElements()) {
//				String token = st.nextToken();
//				if(index ==0) {
//					System.out.print(token+":");
//				}else if(index ==1){
//					System.out.print(token+"-");
//				}else if(index ==2){
//					System.out.print(token+"-");
//				}else if(index ==3){
//					System.out.print(token+"\n");
//				}
//				index ++;
//			}
			
		}
		
	}

}
