package j0129;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class C04 {

	public static void main(String[] args) {
		
		try {
			// 외부에서 파일을 읽어오기 때문이 try-catch 필요
			// FileNotFoundException(Exception의 자식)
			FileReader fr = new FileReader("c:/aaa/a2.txt");
			BufferedReader br = new BufferedReader(fr);
			while (true) {
				// 1줄씩 읽어오기
				String line = br.readLine();
				if (line == null) break;
				System.out.println(line);
			}
		} catch (Exception e) { // 모든 예외 처리(FileNotFoundException 포함)
			e.printStackTrace();
		}
		System.out.println("프로그램을 잘 종료했습니다.");
		
		
		
//		TryClass t = new TryClass();
//		// method()에서 발생한 예외를 main()에서 처리
//		// method()에서 throws로 예외를 미뤘기 때문에 여기서 처리 가능
//		// 예외처리를 하지 않으면 컴파일 에러 발생
//		try {
//			t.method();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("프로그램을 종료합니다.");
		
		
		
//		System.out.println(1);
//		System.out.println(2);
//		try {
//			System.out.println(3);
//			System.out.println(0/0);
//			System.out.println(4);
//			System.out.println(5);
//		} catch (Exception e) {
//			System.out.println(6);
//			e.printStackTrace(); // 에러 정보,위치,메시지 출력
//		} finally {
//			System.out.println(7);
//		}
//		System.out.println(8);
		
		
		
//		System.out.println(1);
//		System.out.println(2);
//		try {
//			System.out.println(3);
////			System.out.println(0/0); // 에러
//            System.out.println(4);
//            System.out.println(5);
//            throw new Exception("고의로 발생"); // 강제 에러 발생
//		} catch (Exception e) {
//			System.out.println(6);
//			System.out.println(e.getMessage());
//			e.printStackTrace(); // 에러 정보,위치,메시지 출력
//		}
//		System.out.println(7);
		
		
		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("안녕"); // 컴파일 에러
//		
//		int[] a = new int[3];
//		a[0] = 1;
//		a[1] = 2;
//		a[2] = 3;
//		System.out.println("값을 입력하세요.>> ");
//		int b = scanner.nextInt();
//		System.out.println(b);
//		a[3] = b; // 런타임 에러
		
		
		
//		int[] arr = {1,2,3,4,5};
//		System.out.println(arr.length);
//		arr[2] = 0;
//		System.out.println(arr.length);
		
//		int[] arr = {1,2,3};
//		Stuscore s = new Stuscore("홍길동",85,90,95);
//		System.out.println(s);
//		
//		String str = "aaa";
//		String str2 = "bbb";
//
//		// if(str == str2) -> 주소비교(∴ 객체/문자열에서는 사용 X)
//		// 객체/문자열에서는 equals() 사용
//		if(str.equals(str2)) {
//			System.out.println("같음");
//		}else {
//			System.out.println("다름");
//		}

	}

}
