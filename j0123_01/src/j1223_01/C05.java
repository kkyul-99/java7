package j1223_01;

import java.util.Arrays;

public class C05 {
	long a,b;
	static int aa;
	
	
	long add() { //오버로딩 - 메소드명은 동일 - 매개변수 개수 또는 타입
		return a+b;
	}
	
	static long add(long a,long b) {
		return a+b;
	}
	
	static long add(int a,long b) {
		return a+b;
	}
	

	public static void main(String[] args) {
		int aa=0; 
		//long a=0; 같은메소드 내에 같은 변수명은 사용할수 없음.
		
		int[] num = new int[3];
		AMethod a = new AMethod();
		a.input(num);
		System.out.println(Arrays.toString(num));
		
		System.out.println(1);
		System.out.println(1.0);

	}

}
