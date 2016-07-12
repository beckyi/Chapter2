package chapter02;

public class MyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MyException(){
		super("내가 만든 테스트 예외");
	}
	public MyException(String message){
		super(message);
	}

}
