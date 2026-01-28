package j0128;

public class A {
	// 다형성
	void methodA(I b) {
		System.out.println("B클래스 호출");
		b.methodB();
	}

}
