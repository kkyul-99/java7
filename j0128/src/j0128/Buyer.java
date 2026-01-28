package j0128;

import java.util.ArrayList;

public class Buyer {
	String id;
	String pw;
	String userName;
	int money;
	int bonusPoint;
	ArrayList list = new ArrayList();
	
	Buyer() {
		id = "aaa";
		pw = "1111";
		userName = "홍길동";
		money = 10_000_000;
		bonusPoint = 0;
	}
	
	// 조상의 참조변수로 자손의 객체선언
	// Product p = new Tv();
	// Product p = new NoteBook();
	// Product p = new Audio();
	// Product p = new Refrigerator();
	void buy(Product p) {
		money -= p.price; // 보유금액에서 구매금액 차감
		bonusPoint += p.bonusPoint; // 보너스 포인트 적립
		list.add(p); // 구매한 제품을 리스트에 추가
		System.out.println(p.name+" 을(를) 구매하셨습니다.");
	}
	
}
