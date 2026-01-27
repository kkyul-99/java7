package j1223_01;

import java.util.Scanner;

public class C08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stuscore[] s = new Stuscore[10];
		String name = "";
		int kor=0,eng=0,math=0;
		int choice=0;
		
		System.out.println("[ 학생성적프로그램 ]");
		System.out.println("1.학생성적입력");
		System.out.println("2.학생성적출력");
		System.out.println("------------------");
		System.out.print("원하는 번호를 입력하세요.>> ");
		choice = scanner.nextInt();
		switch(choice) {
		case 1:
			while(true) {
				System.out.println("이름을 입력하세요.(0.이전페이지 이동)>> ");
				name = scanner.next();
				if(name.equals("0")) break; //반복문 종료
				System.out.println("국어점수를 입력하세요.>> ");
				kor = scanner.nextInt();
				System.out.println("영어점수를 입력하세요.>> ");
				eng = scanner.nextInt();
				System.out.println("수학점수를 입력하세요.>> ");
				math = scanner.nextInt();
//				s[0] = new Stuscore("홍길동",100,100,99);
				s[Stuscore.count] = new Stuscore(name,kor,eng,math);
				System.out.println();
			}
			
			for(int i=0;i<Stuscore.count;i++) {
				System.out.printf(
				"%d,%s,%d,%d,%d,%d,%.2f\n",		
					s[i].no,s[i].name,s[i].kor,
					s[i].eng,s[i].math,s[i].total,
					s[i].avg);
			}
			break;
		}
		
		System.out.println("[ 프로그램을 종료합니다. ]");

	}

}
