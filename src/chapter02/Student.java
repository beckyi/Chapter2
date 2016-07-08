package chapter02;

public class Student extends Person{
		public void showInfo(){
			System.out.println(age);	//부모의   default 접근 O (같은 패키지이므로)
//			System.out.println(name);	// 부모 private 접근자는  접근 X
			System.out.println(height); // 부모 private 접근자는  접근 O
			System.out.println(weight); // 부모 protected 접근자는  접근 O (자식만)
			
			
		}
}
