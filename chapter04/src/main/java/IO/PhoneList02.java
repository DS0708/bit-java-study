package IO;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PhoneList02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner filescan=null;
		
		try {
			
		File file = new File("phone.txt");
		
		if(!file.exists()) {
			System.out.println("File Not Found");
			return;
		}
		
		System.out.println("===The Information of file===");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.length() + "bytes");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(file.lastModified())));
		
		System.out.println("===Phone Number===");
		filescan = new Scanner(file);
		while(filescan.hasNextLine()) {
			System.out.println(
					filescan.next() + ":" +
					filescan.next() + "-"
					+ filescan.next() + "-"
					+ filescan.next()
					);
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(filescan != null)	filescan.close();
		}
	}

}
