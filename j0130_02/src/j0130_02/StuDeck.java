package j0130_02;

import java.util.ArrayList;
import java.util.Scanner;

public class StuDeck {
	Scanner scan = new Scanner(System.in);
	ArrayList list = new ArrayList();
	
	String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
	
	// 2. 성적출력
	void stu_output() {
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
				title[0],title[1],title[2],title[3],title[4],title[5],title[6]);
		System.out.println("-------------------------------------------------------");
		for(int i=0;i<list.size();i++) {
			System.out.println();
		}
	}
	
	// 00. 화면출력
	void screen() {
		System.out.println("[ 학생성적프로그램 ]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 성적삭제");
		System.out.println("5. 성적검색");
		System.out.println("6. 성적정렬");
		System.out.println("8. 파일불러오기");
		System.out.println("9. 파일저장하기");
		System.out.println("0. 프로그램종료");
		System.out.println("---------------------");
		System.out.println("원하는 번호를 입력하세요.>> ");
	} // screen end

}
