package j0127;

public class C07 {

	public static void main(String[] args) {
		Car c = null; // 저장 공간 X
		
		// f1은 FireCar 객체의 주소를 가지고 있음
		FireCar f1 = new FireCar(); // 저장 공간 O
		FireCar f2 = null; // 저장 공간 X
		
		AmbulCar a1 = null;
		
		f1.water();
//		f2.water(); // 에러(∵ f2가 null)
		
		c = f1; // Car <- FireCar (자동 형변환)
		f2 = (FireCar)c;
		f2.water(); // 정상 실행
		
		a1 = (AmbulCar)c; // c에는 f1(FireCar)의 주소가 들어있음
//		a1.water(); // 에러(∵ a1에는 water()가 없음)
		
//		Tv t1 = new Tv();
//		Car c3 = (Car) t1; // 에러(∵ Tv와 Car는 상속 관계가 아님)
		
		// 자동 형변환
		int a = 10;
		long aa = a; // int -> long: (long) 생략 가능
		
		// 강제 형변환
		long b = 20;
		int bb = (int)b; // long -> int: (int) 생략 불가
		
//		FireCar f = new FireCar();
//		f.color = "red";
//		System.out.println(f.color);

	}

}
