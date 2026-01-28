package j0128;

import java.util.ArrayList;
import java.util.Scanner;

public class StuDeck {
	StuDeck() { //초기화 메서드
		// 샘플 3개 입력
		list.add(new Stuscore("홍길동",100,100,99));
		list.add(new Stuscore("유관순",90,90,95));
		list.add(new Stuscore("이순신",80,80,81));
	}
	
	Scanner scan = new Scanner(System.in);
	ArrayList list = new ArrayList();
	// 클래스 내부(body) - 변수, 메서드, 초기화 블록 자리
	// 실행문은 메소드 내에서만 가능
	// 실행문: 값 계산, 변수 변경, 조건 판단, 반복, 객체 생성, 메서드 호출 등등
//	int a = 10; // 가능
//	System.out.println("ArrayList 크기: "+list.size()); // 에러(∵ 실행문)
	
	int no,kor,eng,math,total;
	String name;
	double avg;
	
	String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
	
	// 상단메뉴출력
	void screen_print() {
		System.out.println("[ 학생성적프로그램 ]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 성적삭제");
		System.out.println("5. 성적검색");
		System.out.println("0. 프로그램종료");
		System.out.println("=====================");
		System.out.print("원하는 번호를 입력하세요.>> ");
	}
	
	// 학생성적입력
	void stuInput() {
		System.out.println((Stuscore.count+1)+"번 학생 이름을 입력하세요.(0.이전페이지 이동)>> ");
		name = scan.next();
		if(name.equals("0")) return;
		System.out.println("국어 점수를 입력하세요.>> ");
		kor = scan.nextInt();
		System.out.println("영어 점수를 입력하세요.>> ");
		eng = scan.nextInt();
		System.out.println("수학 점수를 입력하세요.>> ");
		math = scan.nextInt();
		list.add(new Stuscore(name,kor,eng,math)); // list 추가
		System.out.println("학생 성적이 추가되었습니다!");
		System.out.println();
		
	} // stuInput end
	
	// 학생성적출력
	void stuOutput() {
		System.out.println();
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
				title[0],title[1],title[2],title[3],title[4],title[5],title[6]);
		System.out.println("===============================================");
		for(int i=0;i<list.size();i++) {
			Stuscore s = (Stuscore)list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
				s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg());
		}
		System.out.println();
	} // stuOutput end
	
	// 학생성적삭제
	void stuDelete() {
		int temp = 0; // 검색 확인 변수
		System.out.println();
		System.out.println("삭제하려는 학생 이름을 입력하세요.>> ");
		name = scan.next();
		for(int i=0;i<list.size();i++) {
			Stuscore s = (Stuscore)list.get(i);
			if (s.getName().equals(name)) {
				temp = 1; // 학생이 검색되었을 때 1로 변경
				System.out.println(name+" 학생을 찾았습니다. 삭제하시겠습니까?(Y/N)>> ");
				String choice = scan.next();
				if (choice.equalsIgnoreCase("Y")) {
					// 삭제코드
					list.remove(i); // 삭제명령어
					System.out.println(name+" 학생이 삭제되었습니다.");
					System.out.println();
				} else {
					System.out.println("삭제가 취소되었습니다.");
					System.out.println();
				}
			}
		}
		
		if(temp==0) {
			System.out.println("삭제하려는 학생이 없습니다. 다시 입력하세요.");
			System.out.println();
		}
		
	}

}
