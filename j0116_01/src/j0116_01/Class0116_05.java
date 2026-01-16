package j0116_01;

import java.util.Scanner;

public class Class0116_05 {

	public static void main(String[] args) {
		// String 문자열타입: next() - 사이띄움 X, enter key 입력 X, nextLine() - 사이띄움 O, enter key 입력 O
		// 정수 타입: nextInt(), nextLong()
		// 실수 타입: nextFloat(), nextDouble()
		
		// 이름, 국어, 영어 입력받아서 출력하시오.
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요.>> ");
		String name = scanner.next();
		System.out.println("국어 점수를 입력하세요.>> ");
		int kor = scanner.nextInt();
		System.out.println("영어 점수를 입력하세요.>> ");
		int eng = scanner.nextInt();
		System.out.printf("이름: %s, 국어 점수: %d, 영어 점수: %d", name, kor, eng);
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("이름을 입력하세요.>> ");
//		String name = scanner.next();
//		System.out.println("국어 점수를 입력하세요.>> ");
//		int kor = scanner.nextInt();
//		System.out.println("이름: "+name+", 국어 점수: "+kor);
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("이름을 입력하세요.>> ");
//        String name = scanner.nextLine();
//        System.out.println("이름: " + name);
//        System.out.println("아이디를 입력하세요.>> ");
//        String id = scanner.nextLine();
//        System.out.println("아이디: " + id);
        
	}

}
