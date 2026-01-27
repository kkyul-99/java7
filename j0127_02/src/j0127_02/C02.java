package j0127_02;

public class C02 {

	public static void main(String[] args) {
		// Tv, Phone, Audio, NoteBook, Audio, NoteBook Tv 구매
		Buyer b = new Buyer();
		
		System.out.println("회원명: "+b.name);
		System.out.println("현재보유금액: "+b.money);
		System.out.println("현재보유포인트: "+b.bonusPoint);
		
		b.buy(new Tv());
		b.buy(new Phone());
		b.buy(new Audio());
		b.buy(new NoteBook());
		b.buy(new Audio());
		b.buy(new NoteBook());
		b.buy(new Tv());
		
		System.out.print("구매물품:");
		for(int i=0;i<b.count;i++) {
			// buy를 Product로 받고 있어서 Object -> Product 형변환 필요
			Product p = (Product)b.list.get(i);
			System.out.print(p.name+" ");
		}
		System.out.println();
		
		System.out.println("현재보유금액: "+b.money);
		System.out.println("현재보유포인트: "+b.bonusPoint);
	}

}
