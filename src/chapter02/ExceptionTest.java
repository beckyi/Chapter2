package chapter02;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		double d = 0.;
		
		try{
			//의심가는 코드
			d = 10 /a;	//지역변수 (double d = 10/a)
		}catch(ArithmeticException ex){ //예외처리 (예외가 발생되면 실행되는 코드)
			//1.logging(파일, DB)
			System.out.println("Error: "+ ex);			
			//3.사용자에게 메세지
			System.out.println("죄송합니다. 비정상 상황이 되어 종료합니다.");
			//4.정상종료 
			return;	//아래 출력X (d)
		}finally{	//return 해도 반드시 한번 실행!
			//2.자원정리 (파일 닫아줘야함!)
			System.out.println("자원정리!!!");
		}
		System.out.println(d);
	}
}
