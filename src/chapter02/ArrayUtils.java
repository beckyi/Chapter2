package chapter02;

public class ArrayUtils {

	// int �迭�� double �迭�� ��ȯ
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
	
	// double �迭�� int �迭�� ��ȯ
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
	
	// int �迭 �� ���� ������ ���ο� �迭 ����
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
	// int �迭 �� ���� ������ ���ο� �迭 ũ������� ���Ͽ� ����
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
