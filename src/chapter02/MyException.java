package chapter02;

public class MyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MyException(){
		super("���� ���� �׽�Ʈ ����");
	}
	public MyException(String message){
		super(message);
	}

}
