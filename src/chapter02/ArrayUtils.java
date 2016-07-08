package chapter02;

public class ArrayUtils {

	// int 배열을 double 배열로 변환
	public static double [] intToDouble( int[] arrayInt ){
		
		if(arrayInt == null){
			return null;
		}
		
		int length = arrayInt.length;	
		double[] arrayDouble = new double[length];
		
		for(int i =0;i<length;i++){
			arrayDouble[i] = arrayInt[i];
		}
		
		return arrayDouble;
	}
	
	// double 배열을 int 배열로 변환
	public static int [] doubleToInt( double[] arrayDOUBLE ){
		
		if(arrayDOUBLE == null){
			return null;
		}
		
		int length = arrayDOUBLE.length;	
		int[] arrayINT = new int[length];
		
		for(int j =0; j<length; j++){
			arrayINT[j] = (int) arrayDOUBLE[j];
		}
		
		return arrayINT;
	}
	
	// int 배열 두 개를 연결한 새로운 배열 리턴
	static int [] concat( int[] s1, int[] s2 ){
		
		if(s1 == null || s2 == null){
			return null;
		}
		
		int length = s1.length + s2.length;
		int[] arrayCon = new int[length];
		
		for(int k=0; k<s1.length; k++){
			arrayCon[k] = (int) s1[k];
		}
		
		for(int q=0; q<s2.length; q++){
			arrayCon[q+3] = (int) s2[q];
		}
		
		return arrayCon;
	}
	// int 배열 두 개를 연결한 새로운 배열 크기순으로 비교하여 리턴
	public static int [] concatA( int[] a1, int[] a2 ){
		
		if(a1 == null || a2 == null){
			return null;
		}
		
		int length = a1.length + a2.length;
		int[] arrayCon = new int[length];
		int k=0, q=0;
		int w=1;

		for(int m=0; m<length; m++){
			if(k>a1.length){
				w=2;
			}
			if(q>a2.length){
				w=1;
			}
			if(a1[k]<=a2[q]){
				w=1;
			}else{
				w=2;
			}
			switch(w){
			case 1:
				if(k>a1.length){
					break;
				}
				arrayCon[m] = (int)a1[k];
				k++;
				break;
			case 2:
				if(q>a2.length){
					break;
				}
				arrayCon[m] = (int)a2[q];
				q++;
				break;
			}
		}
		
		return arrayCon;
	}

}
