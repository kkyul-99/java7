package j1223_01;

public class C1223_02 {

	public static void main(String[] args) {
		//객체사용목적 - 여러개 값을 저장
		//배열사용목적 - 각각 여러개 값을 저장
		
		int[] a = {1,4,3};
		int[] b = {1,2,3};
		
		
		
		//클래스명.변수명
		Card.width = 200;
		Card.height = 300;
		System.out.println(Card.width);
		
//		Card.kind = "SPADE";
		Card c1 = new Card();
		c1.kind = "SPADE";
		c1.number = 10;
		c1.width=500;
		System.out.println(c1.number);
		System.out.println(Card.width);
		Card c2 = new Card();

	}

}
