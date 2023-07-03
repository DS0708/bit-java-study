package IO;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PhoneList01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("phone.txt");
		
		if(!file.exists()) {//파일이 있는지 없는지를 exception으로 처리하는 거랑 Logic로 처리하는 거랑 천지 차이임, 될 수 있으면 logical하게 처리할
			System.out.println("File Not Found");
			return;
		}
		
		System.out.println("The Information of file");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.length() + "bytes");
		
//		Date d = new Date(file.lastModified());
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(file.lastModified())));
		
		//System.out.println(file.lastModified());
		
		System.out.println("Phone Number");
				
	}

}
