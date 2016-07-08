package chapter02;

public class ArrayUtilsTest {

	public static void main(String[] args) {
		
		//1. ArrayUtils.intToDouble 테스트
		int[] arrayInt = {10,20,30,40,50};
		double[] arrayDouble = ArrayUtils.intToDouble(arrayInt);
		for(double d : arrayDouble){
			System.out.println(d);
		}
		System.out.println("");

		//2. ArrayUtils.doubleToInt 테스트
		double[] arrayDOUBLE = {2.14,5.5,7.6,10.1,20.9};
		int[] arrayINT =  ArrayUtils.doubleToInt(arrayDOUBLE);
		for(int n : arrayINT){
			System.out.println(n);
		}
		System.out.println("");
		
		//3. ArrayUtils.concat 테스트
		int[] s1 = {10,20,30};
		int[] s2 = {40,50,60};
		
		int[] arrayCon = ArrayUtils.concat(s1,s2);
		for(int c : arrayCon){
			System.out.println(c);
		}
		
		//4. ArrayUtils.concatA 테스트
		int[] a1 = {10,30,40};
		int[] a2 = {20,50,60};
		
		int[] arrayA = ArrayUtils.concatA(a1,a2);
		for(int a : arrayA){
			System.out.println(a);
		}
	}

}
