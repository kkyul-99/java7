package j1223_01;

public class Stuscore {
	{ //초기화블럭
		this.no = count+1;
		count++;
	}
	Stuscore(){} //기본생성자 - 생성자가 없으면 자동생성
	Stuscore(String name,int kor,int eng,int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
	
	void cal(int kor,int eng,int math) {
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
	
	static int count; //클래스변수 - 객체선언없이 클래스명.변수명
	int no;   //인스턴스 변수 - 객체선언후 참조변수명.변수명
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;

}
