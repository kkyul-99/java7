package j0128;

public class Car {
	// 각 클래스마다 생성자가 1개 이상 꼭 있어야 함.
	// 없으면 컴파일시 자동으로 생성
	// 생성자를 1개라도 정의하면 기본 생성자가 자동생성 안됨.
//	Car(int x) { 
//		
//	}
	// 기본 생성자
	Car() {}
	
	static String name; // 클래스 변수 - 객체선언 없이 사용: 클래스명.변수명
	int door;           // 인스턴스 변수 - 객체선언후 사용: 참조변수명.변수명
	int speed;
	
	void speedUp() {
		System.out.println("속도를 높입니다.");
	}
	
	void stop() {
		System.out.println("정지합니다.");
	}
	
	// 오버로딩 - 매개변수의 개수나 타입이 다른 것
	int move() {
		return 10;
	}
	
//	int move() { // 중복 정의 불가
//		return 20;
//	}
	
	// 인스턴스 메서드 - 객체선언후 사용: 참조변수명.변수명
	int move(int num) { // 매개변수 - 메서드 호출시 값 전달
		int no = 5; // 지역변수 - 메서드 내에서만 사용
		// 지역변수는 반드시 초기화 후 사용
		// 클래스/인스턴스 변수는 자동 초기화
		System.out.println("출발");
		return no*num;
	}

}
