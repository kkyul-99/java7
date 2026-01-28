package j0128;

public class C04 {

	public static void main(String[] args) {
		Buyer b = new Buyer(); // aaa, 1111, 홍길동, 10_000_000, 0
		System.out.println(b.userName+"님 환영합니다.");

		b.buy(new Tv()); // Tv 객체 생성 후 buy() 메서드에 전달
		b.buy(new NoteBook());
		b.buy(new Audio());
		b.buy(new Refrigerator());
		
		System.out.print("구매한 제품 목록: ");
		for(int i=0;i<b.list.size();i++) {
			Product p = (Product) b.list.get(i);
			System.out.print(p.name+" "+p.price+"원, ");
		}
		System.out.println();
		
		System.out.println("총 구매 개수: "+b.list.size()+"개");
		System.out.println("보유 금액: "+b.money+"원");
		System.out.println("보너스 포인트: "+b.bonusPoint+"포인트");
	}

}
