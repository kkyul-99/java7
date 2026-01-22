package j0121_01;

import java.util.Arrays;
import java.util.Scanner;

public class C0121_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 퀴즈 - 1조 123456
		// 6 - 500원 / 56 - 1,000원 / 456 - 10,000원 / 3456 - 100,000원 / 23456 - 1,000,000원 / 123456 - 10,000,000원
		
		// 6자리를 랜덤으로 복권번호 생성
		// 0 - 999999 랜덤번호 생성해서 출력하시오.
		int random = (int)(Math.random()*1000000);
		String lotto = String.format("%06d", random);
		System.out.println(lotto);
		
		// 프로그램을 구현하시오
		while(true) {
			System.out.println("6자리 번호를 입력하세요.>> ");
			String input = scanner.next();
			
			if(input.length() != 6) {
				System.out.println("6자리 숫자를 입력해야 합니다.");
				continue;
			}
			
			// 끝자리부터 연속으로 맞는 자리수 계산
			int match = 0;
			for(int i=lotto.length()-1; i>=0; i--) {
				if (lotto.charAt(i) == input.charAt(i)) {
					match++;
				} else {
					break; // 연속이 끊기면 바로 종료
				}
			}
			
			int prize;
	        switch (match) {
	            case 1: prize = 500; break;
	            case 2: prize = 1000; break;
	            case 3: prize = 10000; break;
	            case 4: prize = 100000; break;
	            case 5: prize = 1000000; break;
	            case 6: prize = 10000000; break;
	            default: prize = 0;
	        }
	        
	        System.out.println("상금: "+prize+"원");
	        break;
		} // while end
		
		// 내가 해본 방법
//		char[] lottoArr = new char[6];
//		char[] inputArr = new char[6];
//		int count = 0;
//		
//		for(int i=0; i<lotto.length(); i++) {
//			char lottoDigit = lotto.charAt(i);
//			char inputDigit = input.charAt(i);
//			lottoArr[i] = lottoDigit;
//			inputArr[i] = inputDigit;
//		}
//		System.out.println(Arrays.toString(lottoArr));
//		System.out.println(Arrays.toString(inputArr));
//		
//		for(int i=0; i<lottoArr.length; i++) {
//			for (int j=0; j<inputArr.length; j++) {
//				if(lottoArr[i] == inputArr[j]) {
//					count++;
//					break;
//				}
//			}
//		}
//		System.out.println("맞힌 개수: "+count);

		// 입력번호와 끝번호가 맞는지 확인해서 맞힘/틀림 출력
//		char endLotto = lotto.charAt(5);
//		char endInput = input.charAt(5);
//		if (endLotto == endInput) {
//			System.out.println("맞힘");
//		} else {
//			System.out.println("틀림");
//		}
		
//		String[] binary = {
//			"0000", "0001", "0010", "0011", // 0,1,2,3
//			"0100", "0101", "0110", "0111", // 4,5,6,7
//			"1000", "1001"                  // 8,9
//		};
//		
//		// 1987 -> 0001 1001 1000 0111
//		// 0752 -> String 타입으로 입력받음.
//		System.out.println("숫자를 입력하세요.>> ");
//		
//		// 숫자 1개를 입력받아, 2진수를 출력하시오.
//		// int로 받는 경우
//		int input = scanner.nextInt();
//		System.out.println(binary[input]);
//		
//		// String으로 받는 경우
//		String input = scanner.next();
//		System.out.println(binary[input.charAt(0)-'0']);
//		System.out.println(binary[Integer.parseInt(input)]);
//		
//		// 1234
//		String input = scanner.next();
//		for(int i=0; i<input.length(); i++) {
//			// binary['1'-'0']
//			System.out.println(binary[input.charAt(i)-'0']);
//		}
		
//		// 숫자타입 -> 문자열타입: "" + 숫자
//		System.out.println(""+7+7.7); // 문자열타입으로 변경
//		
//		// 문자열타입 -> 숫자타입: Integer.parseInt(문자열), Double.parseDouble(문자열)
//		int a = Integer.parseInt("77");
//		double b = Double.parseDouble("77.7");
//		
//		// 문자(char)숫자타입 -> int타입
//		System.out.println('9'-'0'); // int 9
//		
//		// int타입 -> char타입
//		System.out.println((char)(9+'0')); // char '9'

	}

}
