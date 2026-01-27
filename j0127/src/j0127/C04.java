package j0127;

public class C04 {
	
	// 기본생성자 - 생성자가 없으면 자동으로 기본 생성자를 생성해줌.(컴파일)
	C04(){
		
	}
	
	// 클래스 변수 - 객체선언 없이 클래스명.변수명
	// static이 붙여져 있으면 클래스 변수
	static int aa; // 초기화 자동으로 설정됨.
	
	// 인스턴스 변수 - 객체선언 후 참조변수명.변수명
	int b; // 초기화 자동으로 설정됨.
	
	public static void main(String[] args) {
		// 지역 변수 - 메서드 내 변수
		// 지역변수는 초기화가 자동으로 되지 않기에 초기화를 해줘야 함.
		int a=0; // 지역변수는 초기화 안됨.
		System.out.println(a);
		
		C04 c = new C04(); // 생성자
		System.out.println(c.b);
		
		System.out.println(aa); // 같은 클래스 내에서는 클래스명 생략 가능(원래는 C04.aa)
		
	}

}
