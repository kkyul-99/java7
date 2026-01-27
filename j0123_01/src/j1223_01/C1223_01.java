package j1223_01;

public class C1223_01 {

	int aa; //인스턴스변수 - 객체선언후 참조변수명.변수명
	static int aaa; //클래스변수 - 객체선언없이 클래스명.변수명
	
	static void ch() { //클래스 메소드 = 객체선언없이 클래스명.메소드명
		int abc = 0; //지역변수-메소드내 선언
	}
	
	void change() { //인스턴스 메소드 - 객체선언후 참조변수명.메소드명
		int ab = 0;
	}
	
	public static void main(String[] args) {
//		int[] a = new int[5];
		int a = 0; //지역변수
		
		Stuscore[] ss = new Stuscore[5];
		ss[0] = new Stuscore();
		ss[0].no = 1;
		ss[0].name = "홍길동";
		ss[0].kor = 100;
		ss[0].eng = 100;
		ss[0].math = 100;
		ss[0].total = ss[0].kor+ss[0].eng+ss[0].math;
		ss[0].avg = ss[0].total/3.0;
		
		
		
		// 클래스명 참조변수명 = new 클래스명();
//		Tv t = new Tv();
		
//		Student s = new Student();
//		s.no = 1;
//		s.id = "aaa";
//		s.name = "홍길동";
//		Student s2 = new Student();
//		s2.no = 2;
//		s2.id = "bbb";
//		Student s3 = new Student();
//		s3.no = 3;
//		s3.id ="ccc";
		
		
		
		
//		//객체 - 다른타입 여러개 입력,메소드입력
//		Tv aaa = new Tv();
//		aaa.channel = 10;
//		aaa.color = "white";
////		System.out.println(aaa);
////		System.out.println(aaa.channel);
//		
//		
//		//배열 - 같은타입 여러개 입력
//		int[] aa = {1,2};
////		System.out.println(aa);
////		System.out.println(aa[0]);
//		
//		int[] bb = {0,0};
//		bb = aa;
//		System.out.println(bb[0]+","+bb[1]); //1,2
//		aa[0] = 100; // aa값만 변경
//		System.out.println(bb[0]+","+bb[1]); //
//		
//		
//		
//		
//		//기본형 8가지 타입 - 같은타입 1개값입력
//		boolean a = true;
//		char b = 'a';
//		byte c = 1;
//		short d = 1;
//		int e = 1;
//		long f = 1;
//		float g = 1;
//		double h = 1;
////		System.out.println(a);

	}

}
