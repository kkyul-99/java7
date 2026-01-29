package j0129;

public class A {
	void methodA(I i) { // 수정 B -> B2
		i.methodB(); // 부모의 참조변수로 자식의 오버라이딩된 메서드를 호출
	}
	
}
