package j1223_01;

import java.util.Scanner;

public class C04 {

	
	
	// 메소드 리턴이 없으면 void
	static void add(int a,int b) { // 클래스메소드-객체선언없이 클래스명.메소드명
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		Method m = new Method();
		int a = 10;
		int b = 9;
		int c = 5;
//		C04.add(a, b);
		//a,b를 보내서 평균값을 리턴해서 받아, 출력
//		double result = m.avg(a, b);
//		System.out.println(result);
		
		//a,b,c를 보내서 합계를 리턴해서 출력
//		int result2= m.total(a, b, c);
//		System.out.println(result2);
		
		// input()호출해서 출력하시오.
//		m.input();
		
		// 
//		int result3 = m.input2();
//		System.out.println(result3);
		

		// 함수호출
//		m.addSubMulti();
		
		// 함수호출
//		int[] result = m.addSubMulti2();
//		for(int i=0;i<result.length;i++) {
//			System.out.println(result[i]);
//		}
		
		// 함수호출 - 매개변수 보내서 받기
		int[] score = new int[3];
		m.addSubMulti3(score);
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]);
		}

	}

}
