package j0116_01;

public class Class0116_03 {
	public static void main(String[] args) {
		System.out.println("안녕하세요.");
		System.out.println("hello");
		
		char ch = 'A';
		char ch2 = 'a';
		char ch3 = '\u0041';
		char tab = '\t';
		System.out.print(ch);
		System.out.print(tab);
		System.out.print(ch2);
		System.out.print(ch3);
		
		char ch4 = 'a';
		// char ch4 = 'aa'; // error
		
		// char ch5 = ''; // '' 빈문자는 불가능
		char ch6 = ' '; // ' ' 공백문자는 가능
		
		String str = ""; // 빈문자열 가능
		
		System.out.println();
		// 문자열은 모든 타입을 포함시킬 수 있음.
		String str2 = "7";
		// "7" + 7 + 7 = 777
		// 7 + 7 + "7" = 14 + "7" = "147"
		System.out.println("7"+7+7);
		
		String str3 = "aaa";
		// str3 + 7 = "aaa7";
		System.out.println(str3+7);
		
		int a = 7;
		int b = 8;
		String str4 = "7";
		System.out.println(a+b+str4); // 15 + "7" = "157"
		
	}

}
