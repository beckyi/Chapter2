package chapter02;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
//		int c = add(a,b);
//		System.out.println(c);
		System.out.println(a + " , " + b);	//10, 20
		swap(a,b);	//20, 10
		System.out.println(a + " , " + b);	//10, 20
		
		System.out.println("=========================");
		
		Value v1 = new Value();
		v1.setVal(30);
		Value v2 = new Value();
		v2.setVal(40);
		
		System.out.println(v1.getVal() + " , " + v2.getVal());	//30, 40
		swap(v1,v2);	//40, 30
		System.out.println(v1.getVal() + " , " + v2.getVal());	//40, 30
	}
	public static void swap( Value val1, Value val2){
		int temp = val1.getVal();
		val1.setVal(val2.getVal());
		val2.setVal(temp);
	}	//사라지지않고 영구적으로 변경됨.
	public static void swap (int i, int j){
		int temp=i;
		i = j;
		j= temp;
		System.out.println("# "+i + " , " + j);	//20, 10
	}	// 함수가 끝나면 temp 등 계산 값이 사라짐.
	public static int add(int i, int j){
		int result = i+j;
		return result;
	}

}
