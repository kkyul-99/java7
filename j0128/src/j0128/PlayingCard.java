package j0128;

// 인터페이스(interface): 미완성 설계도
// 상수와 추상메서드로만 구성
public interface PlayingCard {
	public static final int SPADE = 4;
	int DIAMOND = 3; // 제어자 생략 가능
	int HEART = 2;
	int CLOVER = 1;
	
	public abstract String getCardNumber();
	void pick(); // 제어자 생략 가능
	String getCardKind();
	
}
