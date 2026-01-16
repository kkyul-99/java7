package j0116_01;

public class Class0116_02 {

	public static void main(String[] args) {
		// boolean - true, false
		boolean aa = true;
		boolean aa2 = false;
		System.out.println(aa);
		System.out.println(aa2);
		
		// char - 문자
		char bb = 'a';
		char bb2 = '1'; // 문자 1
		System.out.println(bb);
		
		// 숫자 - 정수: byte, short, int, long
		// byte: -128~127
		byte cc = 1;
		byte cc2 = 127;
		byte cc3 = (byte) 5000; // overflow
		System.out.println(cc);
		System.out.println(cc2);
		System.out.println(cc3);
		
		short dd = 1;
		System.out.println(dd);
		
		int ee = 1;
		int ee2 = (int) 3_300_000_000L; // overflow: 약 21억까지 입력 가능
		System.out.println(ee2);
		
		long ff = 1;
		long ff2 = 2_200_000_000L; // 21억 밑으로는 생략가능, 21억 이상은 무조건 접미사 L을 무조건 붙여야 함.
		System.out.println(ff2);
		
		// 실수 - float, double
		float gg = 1.12345678f; // 접미사 f를 무조건 붙여야 함.
		double hh = 1.123456789123456789; // 접미사 d는 생략 가능
		
		//---------------------------------
		// 참조형 변수(객체 변수) - 무조건 new 객체명()
		// 문자열 변수 - 일반형 변수처럼 선언 가능
		String str = new String("aaa");
		String str2 = "bbb"; // String만 new 없이도 가능
		System.out.println(str);
		
		int abc = 10;
		abc = 20;
		abc = 30;
		System.out.println(abc);
		
		final int AAA = 100; // 상수
		// AAA = 20; // 상수명은 대문자로 작성하는 관례가 있음.
		
		char ch = '\u0041'; // u + 4자리 16진수 -> ASCII 코드
		System.out.println(ch);
		
	}

}
