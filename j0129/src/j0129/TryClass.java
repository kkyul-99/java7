package j0129; // 패키지 - 없으면 에러, 없으면 자동 생성

public class TryClass extends Object { // 없으면 자동 생성(Object) - 11개 메서드 자동 생성
	
	// 기본 생성자 - 없으면 에러, 없으면 자동 생성
	TryClass() {
		super(); // 자동 생성 - 부모의 기본생성자"만" 호출
	}
	
	// Object의 11개 메서드
	// equals(), toString(), hashCode() 등
	
	void method() throws Exception{ // try-catch를 호출한 쪽으로 미룸
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(0/0);
		System.out.println(4);
		System.out.println(5);
	}
		
//	void method() {
//		System.out.println(1);
//		System.out.println(2);
//		try {
//			System.out.println(3);
//			System.out.println(0/0);
//		} catch (Exception e) {
//			System.out.println(4);
//			e.printStackTrace();
//		}
//		System.out.println(5);
//	}

}
