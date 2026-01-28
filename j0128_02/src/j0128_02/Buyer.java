package j0128_02;

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
	
	void buy(Product p) {
		money -= p.price;
		bonusPoint += p.bonusPoint;
		list.add(p);
		System.out.println(p.name+" 을(를) 구매하였습니다.");
	}

}
