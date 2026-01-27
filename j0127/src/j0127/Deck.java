package j0127;

public class Deck extends Object {
	Card[] c = new Card[52];
	String[] shape = {"SPADE","HEART","DIAMOND","CLOVER"};
	
	Deck() {
		super();
		for(int i=0;i<c.length;i++) {
			c[i] = new Card(shape[i/13],(i%13)+1);
		}
	}
	
	void shuffle() {
		Card temp;
		for(int i=0;i<1000;i++) {
			int no = (int)(Math.random()*52);
			temp = c[0];
			c[0] = c[no];
			c[no] = temp;
		}
	}
	
	// 전체출력
	void cardAllPrint() {
		for(int i=0;i<c.length;i++) {
//			System.out.println(c[i].num[ c[i].number ]+","+c[i].kind);
			System.out.println(c[i]);
		}
	}
	// 5장 출력
	void card5Print() {
		for(int i=0;i<5;i++) {
			System.out.println(c[i].number+","+c[i].kind);
		}
	}
	void pick() {
		int random = (int)(Math.random()*52);
		System.out.println(c[random].number+","+c[random].kind);
	}
	void pick(int index) {
		index = index%52;
		System.out.println(c[index].number+","+c[index].kind);
	}
}
