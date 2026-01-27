package j0127_02;

import java.util.ArrayList;

public class Buyer {
	String name = "홍길동";
	int money = 1000;
	int bonusPoint = 0;
	
	int count = 0;
	ArrayList list = new ArrayList();
	
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 " + p.name + "을(를) 구매할 수 없습니다.");
		}else {
			list.add(p);
			count++;
			money -= p.price;
			bonusPoint += p.bonusPoint;
			System.out.println(p.name+"구매가 완료되었습니다.");
		}
	}
	
	void print(int a) {
		System.out.println(a);
	}
	
}
