package j0121_01;

import java.util.Arrays;
import java.util.Scanner;

public class C0121_08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 1-45까지 랜덤숫자 6개를 추출해서
		// 입력받은 6개 숫자와 몇개 일치하는지 출력하시오.
		// 로또번호: xx xx xx xx xx xx
		// 입력번호: xx xx xx xx xx xx
		// 당첨된 번호: xx xx xx
		// 당첨된 개수: xx
		
		int[] num = new int[45];
		int[] lotto = new int[6];
		int[] input = new int[6];
		
		int[] winNo = new int[6];
		int count = 0;
		
		// 1. 1-45까지 순차번호 넣기(num 배열)
		for(int i=0; i<num.length; i++) {
			num[i] = i+1;
		}
		
		// 2. num 배열 섞기
		for(int i=0; i<300; i++) {
			int no = (int)(Math.random()*45);
			int temp = num[0];
			num[0] = num[no];
			num[no] = temp;
		}
		
		// 3. num 배열에서 앞에서 6개 번호를 lotto 배열에 복사
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = num[i];
		}
		
		// 4. 6개 번호 입력받고 input 배열에 저장
		for(int i=0; i<input.length; i++) {
			System.out.println("1-45까지 번호를 입력하세요.>> ");
			input[i] = scanner.nextInt();
		}
		
		// 5. 당첨번호와 입력번호 비교
		for(int i=0; i<lotto.length; i++) {
			for(int j=0; j<input.length; j++) {
				if (lotto[i] == input[j]) {
					winNo[count] = lotto[i];
					count++;
					break;
				}
			}
		}
		
		// 6. 결과 출력
		System.out.println("로또번호: "+Arrays.toString(lotto));
		System.out.println("입력번호: "+Arrays.toString(input));
		System.out.println("당첨된번호: "+Arrays.toString(winNo));
		System.out.println("당첨된개수: "+count);
		
	}

}
