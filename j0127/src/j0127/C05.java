package j0127; // 패키지 - 없으면 에러, 없으면 컴파일시 자동으로 부여

// 컴파일시 Object 상속 자동으로 부여
public class C05 extends Object{ // Object 클래스는 모든 클래스의 최상위 부모 클래스
	
	// 기본생성자 - 없으면 에러, 없으면 컴파일시 자동으로 부여
	C05(){
		super(); // 조상의 생성자 호출 - 없으면 에러, 없으면 컴파일시 자동으로 부여
	}
	
	public static void main(String[] args) {
		Stuscore s1 = new Stuscore();
		s1.no = 1;
		s1.name = "홍길동";
		
		Stuscore s = new Stuscore("홍길동",100,100,99);

	}

}
