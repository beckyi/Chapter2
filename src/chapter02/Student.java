package chapter02;

public class Student extends Person{
		public void showInfo(){
			System.out.println(age);	//�θ���   default ���� O (���� ��Ű���̹Ƿ�)
//			System.out.println(name);	// �θ� private �����ڴ�  ���� X
			System.out.println(height); // �θ� private �����ڴ�  ���� O
			System.out.println(weight); // �θ� protected �����ڴ�  ���� O (�ڽĸ�)
			
			
		}
}
