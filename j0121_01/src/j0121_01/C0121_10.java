package j0121_01;

import java.util.Scanner;

public class C0121_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 변수 선언
		String[] title = {"번호", "이름", "국어", "영어", "수학", "합계", "평균"};
		int no[] = new int[10];
		String[] name = new String[10];
		int score[][] = new int[10][4];
		double[] avg = new double[10];
		int total = 0, count = 0;
		
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
					System.out.printf("%d번째 이름을 입력하세요.(0.이전페이지 이동)>> \n",count+1);
					name[count] = scanner.next(); // 이름 입력
					
					// 0 입력시 이전페이지 이동
					if(name[count].equals("0")) break; // 이전페이지 이동
					
					// 국어, 영어, 수학, 합계 입력
					for(int i=0; i<3; i++) {
						// 국어, 영어, 수학 점수 입력
						System.out.printf("%s 점수를 입력하세요.>> \n",title[i+2]);
						score[count][i] = scanner.nextInt();
						// 합계 구하기
						total += score[count][i];
					}
					// 합계
					score[count][3] = total;
					// 평균
					avg[count] = total / 3.0;
					// 번호
					no[count] = count+1;
					count++;
					System.out.println("학생 성적이 입력되었습니다.");
					System.out.println();
				}
				break;
				
			case 2: // 성적출력
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t\n",title[0],title[1],title[2],title[3],title[4],title[5],title[6]);
				System.out.println("=====================================================");
				for(int i=0; i<count; i++) {
					System.out.printf("%d\t",no[i]); // 번호
					System.out.printf("%s\t",name[i]); // 이름
					for(int j=0; j<score[i].length; j++) { // 국어, 영어, 수학, 합계
						System.out.printf("%d\t",score[i][j]);
					}
					System.out.printf("%.2f\n",avg[i]); // 평균
				}
				break;
				
			case 3: // 성적수정
				break;
				
			case 4: // 성적검색
				System.out.println("[ 학생검색 ]");
				System.out.println("검색할 학생 이름을 입력하세요.>> ");
				String search = scanner.next();
				int temp = 0;
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t\n",title[0],title[1],title[2],title[3],title[4],title[5],title[6]);
				System.out.println("=====================================================");
				for(int i=0; i<count; i++) {
//					if(name[i].equals(search)) {   // 검색어가 이름과 동일하면 출력
					if(name[i].contains(search)) { // 검색어가 이름에 포함되면 출력
						temp = 1;
						System.out.printf("%d\t",no[i]); // 번호
						System.out.printf("%s\t",name[i]); // 이름
						for(int j=0; j<score[i].length; j++) { // 국어, 영어, 수학, 합계
							System.out.printf("%d\t",score[i][j]);
						}
						System.out.printf("%.2f\n",avg[i]); // 평균
					}
				}
				if(temp == 0) System.out.println("검색된 학생이 없습니다.");
				System.out.println();
				break;
				
			default: // 종료
				System.out.println("[ 프로그램 종료 ]");
				System.out.println("프로그램을 종료합니다.");
				break loop;
				
			} // switch end
		} // loop:while end

	}

}
