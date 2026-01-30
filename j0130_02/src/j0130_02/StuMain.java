package j0130_02;

import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuDeck s = new StuDeck();
		
		loop:while(true) {
			s.screen();
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				break;
			case 2:
				s.stu_output();
				break;
			case 4:
				break;
			case 8:
				break;
			case 0:
				System.out.println("[ 프로그램 종료 ]");
				break loop;
			} // switch end
		} // while end

	}

}
