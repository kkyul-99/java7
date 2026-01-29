package j0129;

public class C02 {
	
	public static void main(String[] args) {
		A a = new A();
//		B b = new B();
		// 업그레이드 완료
		I i = new B2(); // 다형성: 부모 인터페이스 I가 자식 클래스 B를 참조
		a.methodA(i);
		
//		A a = new A();
//		B b = new B();
////		a.methodA(b);
//		B2 b2 = new B2(); // 추가
//		a.methodA(b2); // 수정 b -> b2
	}

}
