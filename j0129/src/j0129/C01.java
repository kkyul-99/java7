package j0129;

public class C01 {
	static int a; // 클래스 변수 - 자동 초기화: 객체선언 없이 클래스명.변수명
	int b;        // 인스턴스 변수 - 자동 초기화: 객체선언 후 참조변수명.변수명
	
	public static void main(String[] args) {
		int c = 0; // 지역 변수 - 자동 초기화 안됨: 수동 초기화 필요
		System.out.println(c); // 지역 변수 호출
		
		// b를 출력하시오.
		C01 c1 = new C01();
		System.out.println(c1.b); // 인스턴스 변수 호출
		
		System.out.println(C01.a); // 클래스 변수 호출
		System.out.println(a); // 같은 클래스 내에서 호출시 클래스명 생략 가능
		
	}

}
