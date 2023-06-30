package exception;

import java.io.*;

public class MyClass {
	public void danger() throws MyException  {
		System.out.println("some code1");
		
		if(true) {
//			throw new IOException();
			throw new MyException("My Exception");
		}
		
		
		System.out.println("some code2");
	}
}
