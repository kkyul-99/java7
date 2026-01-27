package j0127;

public class C08 {

	public static void main(String[] args) {
		Car c1 = null;
		FireCar f1 = new FireCar();
		
		AmbulCar a1 = null;
		
		c1 = f1;
		
		// c1의 실제 객체는 FireCar이지만 Car이므로 형변환은 가능
		// 런타임 에러 발생(ClassCastException)
		a1 = (AmbulCar) c1;
		
		// c1은 Car 객체이지만 안에 있는 실제 객체는 FireCar
		if(c1 instanceof AmbulCar) {
			System.out.println("형변환 가능");
			a1 = (AmbulCar) c1;
		} else {
			System.out.println("형변환 불가");
			a1 = (AmbulCar) c1;
		}
		
//		if(f1 instanceof Car) {
//			System.out.println("형변환 가능");
//		}
//		
//		if(f1 instanceof FireCar) {
//			System.out.println("형변환 가능");
//		}
//		
//		if(f1 instanceof Object) {
//			System.out.println("형변환 가능");
//		}

	}

}
