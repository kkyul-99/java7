package j0121_01;

import java.util.Arrays;
import java.util.Scanner;

public class C0121_07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 1-100번 사이의 랜덤 번호를 생성해서
		// 10번의 기회 안에 번호를 맞히는 프로그램을 구현하시오.
		// 정답을 맞히면 프로그램을 종료하고
		// 입력한 번호: xx
		// 도전 횟수: xx
		// 정답 번호: xx
		
		int random = (int)(Math.random()*100)+1;
		int attempts = 0;
		int[] guesses = new int[10];
		
		for(int i=0; i<10; i++) {
			System.out.println("1-100 사이의 숫자를 맞혀보시오.>> ");
			int guess = scanner.nextInt();
			guesses[i] = guess;
			attempts++;
			if (random == guess) {
				System.out.println("정답입니다!");
			}else {
				System.out.println("틀렸습니다. 다시 시도하세요.");
			}
		}
		System.out.println("입력한 번호:"+Arrays.toString(guesses));
		System.out.println("도전 횟수: " + attempts);
		System.out.println("정답: " + random);

	}

}
