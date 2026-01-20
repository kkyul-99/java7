package j0120_01;

import java.util.Scanner;

public class C0120_01 {

	public static void main(String[] args) {
//		// boolean, char, byte, short, int, long, float, double
//		// 등가비교(==) 가능
//		int a = 10;
//		if(a==10) {
//			System.out.println("맞습니다.");
//		} else {
//			System.out.println("틀립니다.");
//		}

		// String 타입 - 등가비교(==) 불가능
		// 객체타입 -> .equals()
		String str1 = "10";
		String str2 = "100";
		String str3 = new String("10");
		String str4 = "10";
		
		System.out.printf("%s,%s,%s \n",str1,str2,str3);
		if(str1==str4) { // 10==10
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		if(str1==str3) { // 10==10
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		if(str1.equals(str3)) { // 10==10
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		
//		String str1 = "['게임','골프','수영','조깅','독서']";
//		String str2 = "['수영','조깅','독서']";
//		String str3 = "['게임','골프','독서']";
//		String str4 = "['게임','수영','조깅','독서']";
//		String str5 = "['게임','골프','독서']";
	
//		// 수영이 있습니다. / 수영이 없습니다. 출력하시오. 
//		//str1 수영이 포함되어 있나요?
//		if(str1.contains("수영")) System.out.println("수영이 있습니다.");
//		else System.out.println("수영이 없습니다.");
//		
//		if(str2.contains("수영")) System.out.println("수영이 있습니다.");
//		else System.out.println("수영이 없습니다.");
//		if(str3.contains("수영")) System.out.println("수영이 있습니다.");
//		else System.out.println("수영이 없습니다.");
//		if(str4.contains("수영")) System.out.println("수영이 있습니다.");
//		else System.out.println("수영이 없습니다.");
//		if(str5.contains("수영")) System.out.println("수영이 있습니다.");
//		else System.out.println("수영이 없습니다.");
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.>> ");
//		String str = scanner.next();
//		System.out.println("찾으려는 번호를 입력하세요.>> ");
//		String input = scanner.next();
//				
//		// 포함 여부 확인
//		// contains: boolean, indexOf: 포함되어 있으면 위치값, 없으면 -1
//		// indexOf
//		int startNo = 0;
//		int count = 0;
//		String s_print = "";
//		for (;;) {
//			int temp = str.indexOf(input, startNo);
//			if (temp == -1) break;
//			// input을 찾았을 경우
//			count++;
//			s_print += temp + " ";
//			startNo = temp + 1;
//		}
//		System.out.printf("%s의 위치: %s \n", input, s_print);
//		System.out.printf("%s의 개수: %d \n", input, count);
		
//		// contains
//		if (str.contains("3")==true) {
//            System.out.println("3이 포함되어 있습니다.");
//        } else {
//            System.out.println("3이 포함되어 있지 않습니다.");
//        }
				
//		// 7이 몇번 입력되었는지 개수를 출력하시오.
//		int count = 0;
//		String s_print = "";
//		for (int i = 0; i < str.length(); i++) {
//			int no = str.charAt(i) - '0';
//			if (no == 7) {
//				count++;
//				if(count==1) s_print = i + "";
//				else s_print += ("," + i);
//			}
//		}
//		System.out.println("입력된 숫자길이: "+str.length());
//		System.out.println("7의 위치: "+s_print);
//		System.out.println("7의 개수: "+count);
		
//		// 1459 -> 입력받은 숫자들의 합을 구하시오.
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.>> ");
//		String str = scanner.next();
//		// (char)(2 + '0')
//		// '2' - '0'
//		int sum = 0;
//		String s_print = "";
//		for (int i = 0; i < str.length(); i++) {
//			int no = str.charAt(i) - '0';
//			sum += no;
//			if(i==0) s_print = no + "";
//			else s_print += ("," + no); // 1,4,5,9
//		}
//		System.out.println("입력된 숫자길이: "+str.length());
//		System.out.println("출력: "+s_print);
//		System.out.println("결과 값: "+sum);
		
//		// 34.1592
//		double num = 34.1592;
//		double num2 = Math.round(num*100)/100.0; // long/double = double -> 34.16
//		System.out.println(num2);
		
//		// 소수점 반올림: round, 올림: ceil, 내림: floor
//		System.out.println(Math.round(34.95)); // long -> 35
//		System.out.println(Math.ceil(34.95));  // double -> 35.0
//		System.out.println(Math.floor(34.95)); // double -> 34.0
		
//		// Math.random() 0*10=0+1 <= int(Math.random()*10)+1 < 1*10+1
//		// 1~3번까지 랜덤 숫자를 중복이 없도록 입력하시오.
//		int no1 = 0;
//		int no2 = 0;
//		int no3 = 0;
//		
//		no1 = (int)(Math.random() * 3) + 1;
//		
//		for (;;) {
//			no2 = (int) (Math.random() * 3) + 1;
//			no3 = (int) (Math.random() * 3) + 1;
//			if (no1 != no2 && no1 != no3 && no2 != no3) break;
//		}
//		
//		System.out.println("no1: "+no1);
//		System.out.println("no2: "+no2);
//		System.out.println("no3: "+no3);
		
//		// 문자숫자 타입 -> 숫자 타입
//		int no = '2'-'0';
//		System.out.println(no); // 숫자(int)로 치환
//		
//		// 숫자 타입 -> 문자숫자 타입
//		char ch = (char)(2 + '0'); // 2 + 48 = 50
//		System.out.println(ch); // 문자(char)로 치환
//		
//		// String 타입 -> char 타입
//		String str = "123";
//		char str2 = str.charAt(0); // 문자 1개 가져옴
//		
//		// 숫자 타입 -> String 타입
//		String str3 = 234 + "";
//		
//		// String 타입 -> int 타입
//		String str4 = "20";
//		int num = Integer.parseInt(str4); // int 타입 변환
//		String str5 = "10";
//		int num2 = Integer.parseInt(str5);
//		System.out.println(num + num2);
				
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("[ 학생성적프로그램]");
//		System.out.print("1. 학생성적입력 ");
//		System.out.print("2. 학생성적출력 ");
//		System.out.print("3. 학생성적수정 ");
//		int choice = scanner.nextInt();
//		if (choice == 1) {
//			System.out.println("학생성적입력입니다.");
//		} else if (choice == 2) {
//			System.out.println("학생성적출력입니다.");
//		} else {
//			System.out.println("학생성적수정입니다.");
//		}
		
//		switch(choice) {
//		case 1:
//			System.out.println("[학생성적입력]");
//			break;
//		case 2:
//			System.out.println("[학생성적출력]");
//			break;
//		case 3:
//			System.out.println("[학생성적수정]");
//			break;
//		default:
//			break;
//		}
		
	}

}
