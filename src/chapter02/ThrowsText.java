package chapter02;

import java.io.IOException;

public class ThrowsText {

	public void suspiciousMethod() throws IOException, MyException{
		System.out.println("���� �߻� ��");
		
		if(true){
			throw new MyException("Hello My Exception");
		}
		
		System.out.println("���� �߻� ��");	//����X
	}
}
