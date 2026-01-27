package j1223_01;

public class Car {
	
	Car(){
		this("white","auto",5); //this:생성자에서 다른생성자를 호출(this)
//		color = "white";
//		gearType = "auto";
//		door = 5;
	} //기본생성자
	
	// 매개변수가 있는 생성자
	// 지역변수(메소드내에 선언)
	Car(String color,String gearType,int door){
		this.color = color;  //인스턴스변수:this
		this.gearType = gearType;
		this.door = door;
	}
	
	String color; //인스턴스변수
	String gearType;
	int door;

}
