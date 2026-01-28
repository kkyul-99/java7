package j0128;

public class C01 {

	public static void main(String[] args) {
		Car c = new Car(); // 객체선언
		Car.name = "홍길동"; // 홍길동 -> 유관순(∵ 클래스 변수)
		c.door = 10;
		Car c2 = new Car();
		Car.name = "유관순";
		c2.door = 20;
		
		int num = 2;
		int no = c2.move(num); // 매개변수 전달
		System.out.println(no);
		
		int no2 = c2.move();
		System.out.println(no2);
		
	}

}
