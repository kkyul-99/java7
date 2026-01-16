package j0116_01;

import java.util.Scanner;

public class Class0116_06 {

	public static void main(String[] args) {
		// Scanner
		// 타입 크기 순서: byte<short,char<int<long<float<double<char<string<boolean
		
		int a = 5;
		int b = 0;
		
		b = a++;
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
//		int a = 5;
//		int b = 10;
//		int c = 7;
//		// 최댓값 -> 삼항식
//		// 최솟값 -> 삼항식
//		// (a+b+c) - 최댓값 - 최솟값 = 중간값
//		// 최댓값, 중간값, 최솟값
//		int max = (a>b) ? ((a>c) ? a:c) : ((b>c) ? b:c);
//		int min = (a<b) ? ((a<c) ? a:c) : ((b<c) ? b:c);
//		int mid = (a+b+c) - max - min;
//		System.out.printf("내림차순 정렬: %d, %d, %d", max, mid, min);
		
//		Scanner scanner = new Scanner(System.in);
//		int result = Math.max(5, 10);
//		int result2 = Math.max(5, Math.max(10, 7));
//		System.out.println(result2);
		
		// 3개의 숫자를 입력받아, 가장 큰 수를 출력하시오.
		// 3항 연산자를 2번 사용
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.>> ");
//		int a = scanner.nextInt();
//		int b = scanner.nextInt();
//		int c = scanner.nextInt();
//		int result = (a>b) ? ((a>c) ? a:c) : ((b>c) ? b:c);
//		System.out.println("최댓값: "+result);
		
		// 대입 연산자
//		int a = 10;
//		int b = 3;
		
		// 삼항 연산자
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("두 수를 입력하세요.>> ");
//		a = scanner.nextInt();
//		b = scanner.nextInt();
//		int result = (a>b) ? a:b;
//		System.out.println("더 큰 수: "+result);
		
//		Scanner scanner2 = new Scanner(System.in);
//		a = -5;
//		int result2 = (a>0) ? a:-a;
//		System.out.println("절대값: "+result);
		
//		Scanner scanner3 = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.>> ");
//		a = scanner3.nextInt();
//		String result3 = (a>0) ? "0보다 큰 수 입니다." : "0보다 작은 수 입니다.";
//		System.out.println(result3);
		
		// 논리 연산자(&&(and), ||(or))
		
		// 비교 연산자
//		System.out.println(a>b);  // true
//		System.out.println(a<b);  // false
//		System.out.println(a==b); // false
//		System.out.println(a!=b); // true
		
		// 산술 연산자
//		System.out.println(a+b); // 13
//		System.out.println(a-b); // 7
//		System.out.println(a*b); // 30
//		System.out.println(a/b); // 3: 몫
//		System.out.println(a%b); // 1: 나머지
		
		// 이름, 국어, 영어 -> 이름, 합계, 평균을 출력하시오.
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("이름을 입력하세요.>> ");
//		String name = scanner.next();
//		System.out.println("국어 점수를 입력하세요.>> ");
//		int kor = scanner.nextInt();
//		System.out.println("영어 점수를 입력하세요.>> ");
//		int eng = scanner.nextInt();
//		int total = kor + eng;
//		double avg = total / 2.0;
//		System.out.printf("이름: %s, 합계: %d, 평균: %.2f", name, total, avg);
		
//		int a = 10;
//		int b = 3;
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println(a*b);
//		System.out.println(a/(double)b); // 3.33333 -> 3(정수타입/정수타입 = 정수타입)
//		
//		boolean bool = true;
//		System.out.println(!bool);
		
//		System.out.println(2.0*100);
//		int a = 1;
//		a += 1; // a = a+1
//		a++;    // a = a+1 - 증감연산자
//		a--;    // a = a-1
//		System.out.println(a);
		
	}

}
