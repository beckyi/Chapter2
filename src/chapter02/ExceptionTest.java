package chapter02;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		double d = 0.;
		
		try{
			//�ǽɰ��� �ڵ�
			d = 10 /a;	//�������� (double d = 10/a)
		}catch(ArithmeticException ex){ //����ó�� (���ܰ� �߻��Ǹ� ����Ǵ� �ڵ�)
			//1.logging(����, DB)
			System.out.println("Error: "+ ex);			
			//3.����ڿ��� �޼���
			System.out.println("�˼��մϴ�. ������ ��Ȳ�� �Ǿ� �����մϴ�.");
			//4.�������� 
			return;	//�Ʒ� ���X (d)
		}finally{	//return �ص� �ݵ�� �ѹ� ����!
			//2.�ڿ����� (���� �ݾ������!)
			System.out.println("�ڿ�����!!!");
		}
		System.out.println(d);
	}
}
