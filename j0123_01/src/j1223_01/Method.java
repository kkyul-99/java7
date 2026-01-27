package j1223_01;

import java.util.Scanner;

public class Method {

	static Scanner scanner = new Scanner(System.in);
	
	//avg()
	double avg(int a,int b) {
		double result = (a+b)/2.0;
		return result;
	}
	
	//total()
	int total(int a,int b,int c) {
		int result = a+b+c;
		return result;
	}
	
	// input() 리턴없이 2개의 값을 입력받아, 합을 출력하는메소드
	void input() {
		System.out.println("숫자를 입력하세요.>> ");
		int a = scanner.nextInt();
		System.out.println("숫자를 입력하세요.>> ");
		int b = scanner.nextInt();
		System.out.println("합계 : "+(a+b));
	}
	
	//input2() 합의 값을 리턴해줌.
	int input2() {
		System.out.println("숫자를 입력하세요.>> ");
		int a = scanner.nextInt();
		System.out.println("숫자를 입력하세요.>> ");
		int b = scanner.nextInt();
		System.out.println("합계 : "+(a+b));
		return a+b;
	}
	
	// 1. 리턴없이 2개 숫자를 입력받아 더하기,빼기,곱하기 값을 출력하는 메소드구현
	// 2. 2개 숫자를 입력받아, 더하기,빼기,곱하기 값을 리턴 1개만 리턴 가능
	void addSubMulti() {
		System.out.println("숫자를 입력하세요.>> ");
		int a = scanner.nextInt();
		System.out.println("숫자를 입력하세요.>> ");
		int b = scanner.nextInt();
		System.out.println("합 : "+(a+b));
		System.out.println("차 : "+(a-b));
		System.out.println("곱 : "+(a*b));
	}
	int[] addSubMulti2() {
		int[] result = new int[3];
		System.out.println("숫자를 입력하세요.>> ");
		int a = scanner.nextInt();
		System.out.println("숫자를 입력하세요.>> ");
		int b = scanner.nextInt();
		result[0] = (a+b);
		result[1] = (a-b);
		result[2] = (a*b);
		return result; //리턴1개만 가능
	}
	
	// 배열,객체를 매개변수로 보낼시 리턴이 필요없음
	// 기본타입 8가지 -> 리턴을 받아야 함.
	void addSubMulti3(int[] result) {
		System.out.println("숫자를 입력하세요.>> ");
		int a = scanner.nextInt();
		System.out.println("숫자를 입력하세요.>> ");
		int b = scanner.nextInt();
		result[0] = (a+b);
		result[1] = (a-b);
		result[2] = (a*b);
	}
	
	
	
	
}
