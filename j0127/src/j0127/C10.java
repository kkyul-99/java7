package j0127;

import java.util.ArrayList;

public class C10 {

	public static void main(String[] args) {
		Card c1 = new Card("SPADE",1);
		
		// ArrayList 명령어
		// 자동으로 크기 증가 / 추가,수정,삭제 가능
		// 최초 10개로 시작 -> 10개 초과 시 10개씩 증가
		// add: 추가, get: 읽어오기, remove(): 삭제, size(): 개수
		
		ArrayList list = new ArrayList();
		// 다형성: 조상의 참조변수로 자손의 객체를 다루는 것.
		list.add(c1); // list에 Card 객체 추가
		list.add(new Card("SPADE",2));
		list.add(new Card("SPADE",3));
		list.add(new Card("SPADE",4));
		list.add(new Card("SPADE",5));
		
		Object o = list.get(0); // list 들어가면 무조건 Object 타입으로 변경
		Card c = (Card)list.get(0); // Object -> Card 형변환
		System.out.println(c.kind);
		
		for(int i=0;i<list.size();i++) {
			Card cc = (Card)list.get(i); // get: 읽어오기
			System.out.println(cc.kind+","+cc.number);
		}
		
		list.remove(0); // 0번 인덱스 삭제
		list.remove(3); // 3번 인덱스 삭제
		System.out.println("===삭제 후===");
		
		for(int i=0;i<list.size();i++) {
			Card cc = (Card)list.get(i); // get: 읽어오기
			System.out.println(cc.kind+","+cc.number);
		}

	}

}
