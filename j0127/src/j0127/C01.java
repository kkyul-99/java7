package j0127;

import java.util.*;

import member.Login;

public class C01 extends Object {

	public static void main(String[] args) {
		Deck d = new Deck(); // 카드한묶음
//		d.pick(39);
//		d.pick(50);
//		d.pick(2);
//		d.pick(1);
//		d.pick(0);
//		d.c[1].number = 1;
		d.cardAllPrint(); // 순차출력
		d.shuffle();
		System.out.println("------------------");
		d.cardAllPrint(); // 랜덤섞기후 출력
		//d.cardAllPrint();
		
		Login l = new Login();
		System.out.println(l.pw);
		
		System.out.println(d.c[0].number);
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Circle c1 = new Circle();
//		System.out.println(c1.color);
		
		
		//		Scanner scanner = new Scanner(System.in);
//		Date today = new Date();
//		System.out.println(today);

	}

}
