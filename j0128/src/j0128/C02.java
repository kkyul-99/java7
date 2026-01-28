package j0128; // 패키지 - 자동생성

import java.util.ArrayList;

// 상속 - 자동생성
public class C02 extends Object { 

	C02() { // 생성자 - 자동생성
		super(); // 부모생성자 호출 - 자동생성
	}
// 없을 시에만 자동생성, 있을 시에는 자동생성 X
	
	public static void main(String[] args) {
		// 컬렉션 - 객체를 저장하는 확장 배열
		// 다형성(Object는 모든 클래스의 최고 조상)
		// Object o = new Car();
		// Object o = new C02();
		ArrayList list = new ArrayList(); // Object 타입의 객체 저장
		list.add(5); // 자동으로 Integer 객체로 변환(박싱)
		
		int a = (int)list.get(0);
		System.out.println(a);
		
//		FireCar ff1 = (FireCar) list.get(0);
//		ff1.water();
//		FireCar ff2 = (FireCar) list.get(1);
//		ff2.water();
		
		System.out.println();
		
//		Car c = new Car();
//		Car c2 = null;
//		
//		FireCar f1 = new FireCar();
//		FireCar f2 = null;
////		f2.water(); // 에러(null 참조)
//		
//		AmbulCar a1 = new AmbulCar();
//		AmbulCar a2 = null;
//		
//		c2 = f1; // 형변환 생략 가능
////		a2 = f1; // AmbulCar = FireCar 불가(다형성 X)
//		f2 = (FireCar) c2; // 형변환 생략 불가능
//		f2.water(); // 정상 실행
//		
//		a2 = (AmbulCar) c2; // 실행시 에러(형변환 불가)
		
		// 배열을 개수가 정해지면 추가 불가능, 같은 타입만 입력 가능
//		int[] a = new int[2];
//		a[0] = 1;
//		a[1] = 2;
//		a[2] = 3; // 에러
//		a[1] = "홍길동"; // 에러(타입 불일치)
		
//		System.out.println(a[0]+","+a[1]);

	}

}
