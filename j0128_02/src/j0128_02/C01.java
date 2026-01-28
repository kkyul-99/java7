package j0128_02;

public class C01 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		System.out.println(b.userName+" 님 환영합니다.");
		
		b.buy(new Tv());
		b.buy(new NoteBook());
		b.buy(new Audio());
		
		System.out.println("구매한 목록: ");
		for(int i=0;i<b.list.size();i++) {
			Product p = (Product) b.list.get(i);
			System.out.println((i+1)+". "+p.name+" "+p.price+"원");
		}
		
		System.out.println("구매개수: "+b.list.size()+"개");
		System.out.println("보유금액: "+b.money+"원");
		System.out.println("보유포인트: "+b.bonusPoint+"p");

	}

}
