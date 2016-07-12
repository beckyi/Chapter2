package chapter02;

import java.io.IOException;

public class ThrowsTestApp {

	public static void main(String[] args) {
		try{
			test();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		ThrowsText tt = new ThrowsText();
		try {
			tt.suspiciousMethod();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void test()throws IOException, MyException{
		ThrowsText tt = new ThrowsText();
		tt.suspiciousMethod();
	}
}
