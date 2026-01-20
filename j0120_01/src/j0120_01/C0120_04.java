package j0120_01;

import java.util.Arrays;
import java.util.Scanner;

public class C0120_04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 1~45까지 랜덤번호를 출력하시오.
		int[] random = new int[45];
		
		for(int i=0; i<random.length; i++) {
			random[i] = i+1;
		}
		System.out.println("순차번호: "+Arrays.toString(random));
		
		for(int i=0; i<300; i++) {
			int no = (int)(Math.random()*45);
			int temp = random[0];
			random[0] = random[no];
			random[no] = temp;
		}
		
		// 번호 6개를 입력받아 출력하시오.
		int[] input = new int[6];
		
		for(int i=0; i<6; i++) { // 1~45번 아닌 번호를 입력했을 경우 다시 입력받기
			System.out.printf("%d 번째 번호를 입력하세요.>> \n",i+1);
			input[i] = scanner.nextInt();
			if (input[i]<1 || input[i]>45) {
				System.out.printf("입력번호: %d, 1~45까지의 번호만 입력 가능합니다.\n",input[i]);
				i -= 1;
				continue;
			}
		}
		System.out.println("입력번호: "+Arrays.toString(input));
		
		// 랜덤번호를 앞자리 6개만 출력하시오.
		System.out.print("랜덤번호: ");
		for(int i=0; i<6; i++) {
            System.out.print(random[i]+" ");
        }

	}

}
