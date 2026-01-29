package j0129;

import java.util.Scanner;

public class C03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuDeck s = new StuDeck();
		
		loop:while(true) {
			s.screen_print();
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				s.stu_input(); // 학생 성적 입력
				break;
			case 2:
				s.stu_output(); // 학생 성적 출력
				break;
			case 3:
				break;
			case 4:
				break;
			case 0:
				System.out.println("[ 프로그램종료 ]");
				break loop;
			}
		} // while end
		
	}

}
