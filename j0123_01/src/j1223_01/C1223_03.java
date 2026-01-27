package j1223_01;

public class C1223_03 {
	// 클래스변수,인스턴스변수,지역변수-메소드내선언
	// 클래스메소드 - 객체선언없이 클래스명.메소드명
	// 인스턴스메소드 - 객체선언후 참조변수명.메소드명
	int add(int a,int b) { // 인스턴스메소드
		return a+b;
	}
	
	int sub(int a,int b) {
		return a-b;
	}
	
	int multi(int a,int b) {
		return a*b;
	}
	
	double divide(int a,int b) {
		return a/(double)b;
	}
	
	//sub,multi,divide
	
	public static void main(String[] args) {
		//객체선언후 사용
		C1223_03 c = new C1223_03();
		int a = 10;
		int b = 3;
		int result = c.add(a,b);
		System.out.println(result);
		int result2 = c.sub(a,b);
		System.out.println(result2);
		int result3 = c.multi(a,b);
		System.out.println(result3);
		double result4 = c.divide(a, b);
		System.out.println(result4);
		

	}

}
