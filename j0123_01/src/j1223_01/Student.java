package j1223_01;

public class Student {
	//기본생성자
	public Student() {}
	
	Student(Student s){
		this.no = s.no;
		this.id = s.id;
		this.pw = s.pw;
		this.name = s.name;
		this.phone = s.phone;
		this.gender = s.gender;
		this.hobby = s.hobby;
	}
	
	//전체생성자
	public Student(int no, String id, String pw, String name, String phone, String gender, String hobby) {
		this.no = no;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.hobby = hobby;
	}
	
	int no;
	String id;
	String pw;
	String name;
	String phone;
	String gender;
	String hobby;

}
