package chapter02;

import java.io.IOException;

public class ThrowsText {

	public void suspiciousMethod() throws IOException, MyException{
		System.out.println("예외 발생 전");
		
		if(true){
			throw new MyException("Hello My Exception");
		}
		
		System.out.println("예외 발생 후");	//츨력X
	}
}
