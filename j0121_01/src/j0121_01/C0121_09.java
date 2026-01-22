package j0121_01;

import java.util.Scanner;

public class C0121_09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 변수 선언
		String[] title = {"번호", "이름", "국어", "영어", "수학", "합계", "평균"};
		int[] no = new int[5]; // 학생 번호
		String[] name = new String[5];
		int[][] score = new int[5][4]; // 국어, 영어, 수학, 합계
		double[] avg = new double[5];
		int total = 0, count = 0; // 같은 타입이면 한줄에 선언 가능
		
		loop:while(true) {
			// 화면 출력
			System.out.println("[ 학생성적프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 성적검색");
			System.out.println("0. 종료");
			System.out.println("==============================");
			System.out.println("원하는 번호를 입력하세요.>> ");
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1: // 성적입력
				while(true) {
					total = 0; // 합계 초기화
					System.out.println("[ 학생성적입력 ]");
					System.out.printf("%d번째 이름을 입력하세요.>> \n", count+1);
					name[count] = scanner.next();
					for(int i=0; i<3; i++) {
						// 국어, 영어, 수학 점수 입력
						System.out.println(title[i+2]+" 점수를 입력하세요.>> ");
						score[count][i] = scanner.nextInt();
						// 합계 구하기
						total += score[count][i];
					}
					score[count][3] = total; // 합계
					avg[count] = total / 3.0; // 평균
					no[count] = count+1; // 번호
					count++;
					System.out.println("학생 성적이 입력되었습니다.");
					
					// 계속 입력할지 여부 확인
					System.out.println("계속 입력할까요? (Y/N)>> ");
					String yn = scanner.next();
					if (!yn.equalsIgnoreCase("y")) {
					    break; // case1 - while 탈출
					}
				} // case1 - while end
				break; // case1 탈출
				
			case 2: // 성적출력
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t\n",title[0],title[1],title[2],title[3],title[4],title[5],title[6]);
				System.out.println("=====================================================");
				for(int i=0; i<count; i++) {
					System.out.printf("%d\t",no[i]); // 번호
					System.out.printf("%s\t",name[i]); // 이름
					for(int j=0; j<score[i].length; j++) {
						System.out.printf("%d\t", score[i][j]); // 국어, 영어, 수학, 합계
					}
					System.out.printf("%.2f\n", avg[i]); // 평균
				}
				break;
				
			case 3: // 성적수정
				break;
				
			case 4: // 성적검색
				break;
				
			default: // 종료
				System.out.println("[ 프로그램 종료 ]");
				System.out.println("프로그램을 종료합니다.");
				break loop;
			} // switch end
		} // loop:while end
		
//		int[] a = {1,2,3,4,5};
//		for(int i=0; i<a.length; i++) {
//			System.out.print(a[i]+"\t");
//		}
//		System.out.println();
//		
//		for(int i=a.length-1; i>=0; i--) {
//			System.out.print(a[i]+"\t");
//		}
		
//		// 검색
//		int[] a = {1,2,0,4,0};
//		int temp = 0;
//		int count = 0;
//		
//		for(int i=0; i<a.length; i++) {
//			if (a[i] == 0) {
//				count++;
//				temp = 1;
//			}
//        }
//		if(temp == 0) {
//			System.out.println("해당문자가 없습니다.");
//		}else {
//			System.out.println("해당문자가 있습니다.");
//			System.out.println("해당문자 개수: "+count);
//		}

	}

}
